import pygame
import random

pygame.init()

# Create Window
window = pygame.display.set_mode((995, 800))
pygame.display.set_caption("Mario Bouncing Ball Game")

# Text Font
font1 = pygame.font.Font("Words\\font1.ttf", 90)
font2 = pygame.font.Font("Words\\font2.ttf", 60)
font3 = pygame.font.Font("Words\\font1.ttf", 40)
font4 = pygame.font.Font("Words\\font1.ttf", 100)
font5 = pygame.font.Font("Words\\font2.ttf", 50)

# Timer setting
time_counter = 60
second = font3.render(str(time_counter), True, (255, 0, 0))

time_delay = 1000
timer_event = pygame.USEREVENT + 1
pygame.time.set_timer(timer_event, time_delay)

clock = pygame.time.Clock()

# Mario
walkRight = [pygame.image.load('Mario right\\nr1.png'), pygame.image.load('Mario right\\nr2.png'), pygame.image.load('Mario right\\nr3.png')]
walkLeft = [pygame.image.load('Mario left\\nl1.png'), pygame.image.load('Mario left\\nl2.png'), pygame.image.load('Mario left\\nl3.png')]
stand = pygame.image.load('Mario right\\nr1.png')
mario_x = 498
mario_y = 700
mario_speed = 15
mario_rect = pygame.Rect(mario_x, mario_y, stand.get_width(), stand.get_height())

# Mashroom
mashroom = pygame.image.load("mashroom\\mashroom2.png")
mashroom_speed = [random.choice([-10, 10]), 15]
mashroom_rect = mashroom.get_rect()
mashroom_rect.center = (995 // 2, 800 // 2)

left = False
right = False
walkCount = 0

colliding_times = 0

# System setting
bg = pygame.image.load('background\\bg.jpg')

def redrawGameWindow():
    global walkCount
    window.blit(bg, (0,0))

    if walkCount + 1 >= 24:
        walkCount = 0
    if left:
        frame = walkCount // 3 % len(walkLeft)
        window.blit(walkLeft[frame], (mario_x, mario_y))
    elif right:
        frame = walkCount // 3 % len(walkRight)
        window.blit(walkRight[frame], (mario_x, mario_y))
    else:
        window.blit(stand, (mario_x, mario_y))
    
    walkCount += 1

# Starting page method
def show_start_screen():
    image1 = pygame.image.load("starting page\starting page bg.jpg")
    window.blit(image1, (0,0))

    title = font1.render("Mario Bouncing Ball Game", True, (255,0,0))
    window.blit(title, (50,155))

    instruction = font2.render("Press space to enter the game", True, (0,0,0))
    window.blit(instruction, (260,450))

    pygame.display.flip()

    waiting = True
    while waiting:
        for event in pygame.event.get():
            if event.type == pygame.QUIT:
                exit()
            elif event.type == pygame.KEYDOWN:
                if event.key == pygame.K_SPACE:
                    waiting = False

showing_start_screen = True
running = True

while running:
    # Start screen display
    if showing_start_screen:
        show_start_screen()
        showing_start_screen = False
    
    # Events
    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            running = False
        elif event.type == timer_event:
            # recreate text
            time_counter -= 1
            second = font3.render(str(time_counter), True, (255, 0, 0))
    
    window.blit(second, (498, 10))
    
    # Mario setting code blocks
    keys = pygame.key.get_pressed()
    if keys[pygame.K_LEFT] and mario_x > mario_speed:
        mario_x -= mario_speed
        left = True
        right = False

    elif keys[pygame.K_RIGHT] and mario_x < 995 - 97 - mario_speed:
        mario_x += mario_speed
        left = False
        right = True
    
    else:
        left = False
        right = False
        walkCount = 0
    
    mario_rect.x = mario_x 
    mario_rect.y = mario_y
    
    # Mashroom setting code blocks
    window.blit(mashroom, (mashroom_rect.x, mashroom_rect.y))

    # Update the ball position
    mashroom_rect.x += mashroom_speed[0]
    mashroom_rect.y += mashroom_speed[1]

    # Check for collision with the player
    if mario_rect.colliderect(mashroom_rect):
        mashroom_speed[1] = -15
        if time_counter > 30:
            colliding_times += 1
        elif time_counter <= 30 and time_counter >= 0:
            colliding_times += 2 

    # Bounce the ball off the walls
    if mashroom_rect.left < 0 or mashroom_rect.right > 995:
        mashroom_speed[0] = -mashroom_speed[0]
    if mashroom_rect.top < 0 or mashroom_rect.bottom > 800:
        mashroom_speed[1] = -mashroom_speed[1]
    
    pygame.display.update()

    redrawGameWindow()

    clock.tick(60)

    if time_counter <= 0:
        game_over = font4.render("Game over!", True, (255,0,0))
        window.blit(game_over, (200,350))
        
        score = font5.render(f"Score: {colliding_times}", True, (0,0,0))
        window.blit(score, (210, 450))

pygame.quit()