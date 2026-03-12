# Hints:
# 1) How many cards are there?
# 2) What's the sum of the cards that SHOULD be there?
# 3) What's the sum of the cards that are there?
# 4) How can you find the value of the missing card?

# Read an integer for the number of cards there are
n = int(input())

# Create a variable to store the sum of the cards that SHOULD be there
expected = 0

# Use a for loop to add all the cards to the expected total     HINT: range(1, cards + 1)



# Create a variable to store the sum of the cards that are there
total = 0


# Use a for loop to add all the cards that are there
for card in range(n - 1):
    # Read the value of the card
    value = 
    # Add the card to the total



# The missing card is the difference between the expected total 
# and the total of the cards that are there.
missing = 

# Print the missing card
print()


'''
n = int(input())

expected = 0
for i in range(1, n + 1):
    total += i

remaining = 0
for i in range(n - 1):
    value = int(input())
    remaining += value

print(expected - remaining)
'''