{:user {:jvm-opts ["-Dapple.awt.UIElement=true" "-XX:-OmitStackTraceInFastThrow"]
        :dependencies [[criterium "0.4.3"]
                       [pjstadig/humane-test-output "0.7.0"]
                       [org.clojure/tools.nrepl "0.2.10"]]
        :plugins [[cider/cider-nrepl "0.10.0-SNAPSHOT"]
                  [com.jakemccrary/lein-test-refresh "0.10.0"]
                  [jonase/eastwood "0.2.1"]
                  [lein-ancient "0.6.7"]
                  [lein-bikeshed "0.2.0"]
                  [lein-cljfmt "0.2.0"]
                  [lein-kibit "0.1.2"]
                  [refactor-nrepl "1.1.0-SNAPSHOT"]
                  [venantius/yagni "0.1.1"]]
        :injections [(require 'pjstadig.humane-test-output)
                     (pjstadig.humane-test-output/activate!)]
        :test-refresh {:quiet true}}}
