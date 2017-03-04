package io.fares.jaxb.xjc.plugins.substitution;

import com.github.javaparser.ast.CompilationUnit;

import java.io.File;

public class ExtendedElementListTest extends AbstractSubstitutionPluginTest {

  @Override
  public File getSchemaDirectory() {
    return new File(getBaseDir(), "src/test/resources/schemas/ExtendedElementList");
  }

  @Override
  protected void validateGeneratedContextClass(CompilationUnit unit) {
    new ExtensionListValidator().visit(unit, null);
  }

}
