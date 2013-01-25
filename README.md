Uses JavaScript as an embedded DSL in Scala to integrate client-side and server-side validation into Play 2.

# Run it!

Setup [LMS](https://github.com/TiarkRompf/virtualization-lms-core) and [js-scala](https://github.com/js-scala/js-scala).

Setup the validation library:

```bash
$ cd core
$ sbt publish-local
```

Finally run the samples:

```bash
$ cd samples/{sample} # Replace “sample” with “forms”, “mini” or “mini-forms”
$ sbt run
```