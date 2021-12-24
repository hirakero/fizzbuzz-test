(ns fizzbuzz-test.core-test
  (:require [clojure.test :refer :all]
            [fizzbuzz-test.core :refer :all]))

(deftest fizzbuzz-test
  (testing "1を渡すと文字列1を返す"
    (is (= "1" (fizzbuzz 1))))
  (testing "2を渡すと文字列2を返す"
    (is (= "2" (fizzbuzz 2))))
  (testing "3を渡すと文字列Fizzを返す"
    (is (= "Fizz" (fizzbuzz 3))))
  (testing "5を渡すと文字列Buzzを返す"
    (is (= "Buzz" (fizzbuzz 5))))
  )

(use-fixtures :once
  (fn [test-fn]
    (println "pre-once")
    (test-fn)
    (println "post-once")))

(use-fixtures :each
  (fn [test-fn]
    (println "pre-each")
    (test-fn)
    (println "post-each")))
