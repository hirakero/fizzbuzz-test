(ns fizzbuzz-test.core
  (:gen-class))

(defn fizzbuzz [n]
  (if (zero? (mod n 3))
    "Fizz"
    (str n)))
