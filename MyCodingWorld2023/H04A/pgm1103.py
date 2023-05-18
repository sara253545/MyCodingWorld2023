#1. Design a simple calculator - addition & subtraction

#Step 1 - Display the menu
print("----------------------------------------")
print("|   S I M P L E  C A L C U L A T O R   |")
print("----------------------------------------")
print("|           1. Addition                |")
print("|           2. Subtraction             |")
print("----------------------------------------")
print("|           0. Exit                    |")
print("----------------------------------------")

#Step 2 - Prompt and accept user's choice
choice = int(input("Enter your choice : "))

#Step 3 - Process the choice
if choice == 0:
    print("OK")
elif choice == 1:
    print("----------------------------------------")
    print("|           A D D I T I O N            |")
    print("----------------------------------------")
    a = float(input("Enter the first number : "))
    b = float(input("Enter the second number: "))
    sum = a + b
    print("The sum of", a, "and", b, "is =", sum)
    print("----------------------------------------")
elif choice == 2:
    print("----------------------------------------")
    print("|       S U B T R A C T I O N          |")
    print("----------------------------------------")
    a = float(input("Enter the first number : "))
    b = float(input("Enter the second number: "))
    difference = a + b
    print("The difference of", a, "and", b, "is =", difference)
    print("----------------------------------------")
else:
    print("Invalid Choice")
    

#Step 4 - Exit
print("----------------------------------------")
print("|      THANK YOU!!!    VISIT AGAIN     |")
print("----------------------------------------")
