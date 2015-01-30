(ns euler-problems.3and5)

(->>
 (let [number-range (range 1 1000)]
  (->
   (for [factors [3 5]
      :let [multiples (filter #(= 0 (mod % factors)) number-range)]]
    multiples)
   flatten
   set))
 (reduce +)
 (time))