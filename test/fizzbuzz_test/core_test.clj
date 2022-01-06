(ns fizzbuzz-test.core-test
  (:require [clojure.test :refer :all]
            [fizzbuzz-test.core :refer :all]))

(deftest fizzbuzz-test
  (testing "fizzbuzzは、数を文字列に変換する"
    (testing "3の倍数のときは、数の代わりに「Fizz」と変換する"
      (testing "3を渡すと文字列Fizzを返す"
        (is (= "Fizz" (fizzbuzz 3)))))
    (testing "5の倍数のときは、数の代わりに「Buzz」と変換する"
      (testing "5を渡すと文字列Buzzを返す"
        (is (= "Buzz" (fizzbuzz 5)))))
    (testing "3と5の倍数のときは、数の代わりに「FizzBuzz」と変換する"
      (testing "15を渡すと文字列FizzBuzzを返す"
        (is (= "FizzBuzz" (fizzbuzz 15)))))
    (testing "その他の数のときは、そのまま数を文字列に変換する"
      (testing "1を渡すと文字列1を返す"
        (is (= "1" (fizzbuzz 1))))))
  (testing "範囲のテスト"
    (testing "1から15までの数を渡すと、「1 2 Fizz 3 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz」を返す "
      (are [x y] (= x y)
        "1" (fizzbuzz 1)
        "2" (fizzbuzz 2)
        "Fizz" (fizzbuzz 3)
        "4" (fizzbuzz 4)
        "Buzz" (fizzbuzz 5)
        "Fizz" (fizzbuzz 6)
        "7" (fizzbuzz 7)
        "8" (fizzbuzz 8)
        "Fizz" (fizzbuzz 9)
        "Buzz" (fizzbuzz 10)
        "11" (fizzbuzz 11)
        "Fizz" (fizzbuzz 12)
        "13" (fizzbuzz 13)
        "14" (fizzbuzz 14)
        "FizzBuzz" (fizzbuzz 15)))))
