(ns fizzbuzz-test.core
  (:gen-class))

(defn fizzbuzz [n]
  (cond
    (zero? (mod n 15)) "FizzBuzz"
    (zero? (mod n 5)) "Buzz"
    (zero? (mod n 3)) "Fizz"
    :else (str n)))
