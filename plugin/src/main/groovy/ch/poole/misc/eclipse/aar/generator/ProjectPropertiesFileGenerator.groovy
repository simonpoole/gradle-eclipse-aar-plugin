package ch.poole.misc.eclipse.aar.generator

class ProjectPropertiesFileGenerator extends MetaDataFileGenerator {
    String androidTarget

    @Override
    String generateContent(File file) {
        """\
        |target=${androidTarget}
        |android.library=true
        |""".stripMargin()
    }
}
