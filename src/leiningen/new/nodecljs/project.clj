(defproject {{name}} "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/clojurescript "0.0-2173"]]
  :plugins [[lein-cljsbuild "1.0.2"]]
  :source-paths ["src"]
  :cljsbuild {:builds [{:id "{{name}}"
                        :source-paths ["src"]
                        :compiler {:output-to "{{sanitized}}.js"
                                   :output-dir "out"
                                   :target :nodejs
                                   :optimizations :simple}}]})
