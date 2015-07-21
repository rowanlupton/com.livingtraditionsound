(defproject com.livingtraditionsound "0.1"
  :description "website for Living Tradition Sound"
  :url "http://www.livingtraditionsound.com"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]]
  :main ^:skip-aot foo.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
