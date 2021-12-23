(ns fizzbuzz-test.core-test
  (:require [clojure.test :refer :all]
            [fizzbuzz-test.core :refer :all]))

(deftest fizzbuzz-test
  (testing "1を渡すと文字列1を返す"
    ;; 準備 
    ;; 実行 ＆ 検証 
    (is (= "1" (fizzbuzz 1)))
    ;; 後片付け
    ))
