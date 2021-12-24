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
  )
