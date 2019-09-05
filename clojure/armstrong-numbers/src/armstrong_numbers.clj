(ns armstrong-numbers)
(defn digits[n] (count (map #(Character/digit % 10) (str n))))
(defn ** [x n] (reduce *' (repeat n x)))

(defn armstrong? [num] ;; <- arglist goes here
  ;; your code goes here  
  
  (def nDigits (digits num))  
  


  (type nDigits)

)

(println (armstrong? 484))
