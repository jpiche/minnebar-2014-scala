
def fiboeuler(limit)
  x,y = 1,2
  numary = [1]
  i = 1
  sum = 0

  while x < limit
    x,y = y, x+y
    numary << x

    if numary[i-1] % 2 == 0
      sum += numary[i-1]
    end
    i += 1
  end
  sum
end

puts fiboeuler(4000000)

