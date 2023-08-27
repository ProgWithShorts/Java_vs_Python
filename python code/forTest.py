from time import time

startTime = time()

arr = []
nums = 0

while (nums < 5_000_000):
    arr.append(nums)
    nums += 1

endTime = time()

print((endTime-startTime)*1000, " ms")
