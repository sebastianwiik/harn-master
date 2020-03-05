(ns harn-master.core
  (:gen-class))

(def d4 4)
(def d6 6)
(def d8 8)
(def d10 10)
(def d20 20)
(def d100 100)

(defn dice-roll
  [dice]
  (+ (rand-int dice) 1))

(defn -main
  "Simulates Harn Master Role Playing Game."
  [& args]
  (println "Hello, World!"))
