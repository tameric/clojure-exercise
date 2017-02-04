(ns com.americ.clojure.exercise-test
  (:require [clojure.test :refer :all]
            [com.americ.clojure.exercise :refer :all]))

(deftest a-test
  (testing "FIXME, I fail."
    (is (= 1 1))))

(deftest average-test
  (is (= (average '(1 2 3)) (double 2)))
  (is (thrown? clojure.lang.ArityException (average))))

(deftest map-average-test
  (is (= (map-average [1 2] [4 5 6]) [1.5 5.0]))
  (is (thrown? clojure.lang.ArityException (map-average))))

(deftest moving-average-test
  (is (= (moving-average [1 2]) [1.0 1.5]))
  (is (thrown? clojure.lang.ArityException (moving-average))))

