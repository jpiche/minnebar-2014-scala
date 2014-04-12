{-
 - Return the sum of the even fibonacci numbers
 - that do not exceed four million.
 -}

fib :: [Int]
fib = 0 : scanl (+) 1 fib

fibsUpTo :: Int -> [Int]
fibsUpTo n = takeWhile (< n) fib

limit :: Int
limit = 4000000

main :: IO ()
main = do
    print $ sum $ filter even (fibsUpTo limit)

