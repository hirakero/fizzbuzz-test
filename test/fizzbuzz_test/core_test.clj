(ns fizzbuzz-test.core-test
  (:require [clojure.test :refer :all]
            [fizzbuzz-test.core :refer :all]))

(deftest fizzbuzz-test
  (testing "1を渡すと文字列1を返す" ;←"数を文字列に変換する"
    ;; 準備 3
    ;; 実行 2
    (let [actual (fizzbuzz 1)]
    ;; 検証 1
      (is (= "1" actual)))
    ;; 後片付け
    ))
