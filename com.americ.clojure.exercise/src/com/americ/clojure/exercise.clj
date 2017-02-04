(ns com.americ.clojure.exercise)

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

(defn average
  [params]
  (/ (double (reduce + params)) (count params)))
    
(defn map-average
  [& lst]
  (map average lst))