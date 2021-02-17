# program 1:

# import math #to perform square root operation we need to import math module


def IsPrime(num):
    # sqrt = int(math.sqrt(num)) # for small numbers square root value will create some error.
    prime = True

    for divider in range(2, num):
        if num % divider == 0:
            prime = False
            break
    return prime


print("program to find whether it is a prime number or composite number")
n = int(input("enter a number"))
if n < 2:
    print("it is neither prime or composite number")
else:
    if IsPrime(n):
        print(n, " is a prime number")
    else:
        print(n, " is a composite number")

# program 2:

print("program to print no. of prime and composite no present in a range given by the user")
start = int(input("enter the starting value"))
end = int(input("enter the ending value"))
# start = 1
# end = 10
i = 0
j = 0
for v in range(start, end + 1):
    if v < 2:
        print("your range contain 0 or 1 which is neither a prime no. nor composite no.")
        continue
    elif v == 2:
        j = j + 1
    else:
        for n in range(2, int(v)):
            if v % n == 0:
                i = i + 1
                break
        else:
            j = j + 1

print(f"total number of composite number present between {start} and {end} is {i}")
print(f"total number of prime number present between {start} and {end} is {j}")
