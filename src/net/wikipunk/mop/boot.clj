(ns net.wikipunk.mop.boot
  {:rdf/type :jsonld/Context})

(def mop
  {:rdf/type    :rdfa/PrefixMapping
   :rdfa/uri    "https://wikipunk.net/mop/"
   :rdfa/prefix "mop"})
