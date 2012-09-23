(ns clojure-exercises.numbers)

(defn first-digit [x]
  (if (>= x 10) (recur (quot x 10)) x))
