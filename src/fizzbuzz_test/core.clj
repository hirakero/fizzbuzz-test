(ns fizzbuzz-test.core
  (:gen-class))

(defn fizzbuzz [n]
  (if (zero? (mod n 3))
    "Fizz"
    (if (zero? (mod n 5))
      "Buzz"
      (str n))))
