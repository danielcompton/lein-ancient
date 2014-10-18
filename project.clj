(defproject lein-ancient "0.6.0-SNAPSHOT"
  :description "Check your Projects for outdated Dependencies."
  :url "https://github.com/xsc/lein-ancient"
  :dependencies [[rewrite-clj "0.3.9"]
                 [ancient-clj "0.2.0"]
                 [jansi-clj "0.1.0"]
                 [pandect "0.4.1"]
                 [potemkin "0.3.10"]
                 [commons-io "2.4"]]
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :profiles {:dev {:dependencies [[midje "1.6.3"]]
                   :plugins [[lein-midje "3.1.1"]]
                   :test-paths ["test"]}}
  :aliases {"test" ["midje"]}
  :eval-in-leiningen true
  :pedantic? :abort)
