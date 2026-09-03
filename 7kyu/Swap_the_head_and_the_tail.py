def swap_head_tail(arr):
    x = len(arr) // 2
    evenLen = not len(arr) % 2
    return arr[x:] + arr[0:x] if evenLen else arr[x+1:] + [arr[x]] + arr[0:x]
