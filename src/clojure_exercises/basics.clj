(ns clojure-exercises.basics)

(defn shift-pop [items]
  (rest (butlast items)))
