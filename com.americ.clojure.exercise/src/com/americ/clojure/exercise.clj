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
  (if (empty? lst)
    (throw (new clojure.lang.ArityException (count lst) "map-average"))
    (map average lst)))

(defn moving-average
  [lst]
  (loop [i 1
         ma []]
    (if (<= i (count lst)) 
     (recur (inc i) (conj ma (average (take i lst))))
      ma)))
            
(defn map-moving-average
  [& lst]
  (if (empty? lst)
    (throw (new clojure.lang.ArityException (count lst) "map-moving-average"))
    (map moving-average lst)))
