/*
 * Decompiled with CFR 0_132.
 *
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  kotlin.text.StringsKt
 *  org.jetbrains.annotations.NotNull
 */
package classeiiiandiiiobjects.classeiiiandiiiinheritance.p14derivediiiclassiiiinitializationiiiorder;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(
    mv = {1, 1, 11},
    bv = {1, 0, 2},
    k = 1,
    d1 = {
      "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\f"
    },
    d2 = {
      "Lclasseiiiandiiiobjects/classeiiiandiiiinheritance/p14derivediiiclassiiiinitializationiiiorder/Derived;",
      "Lclasseiiiandiiiobjects/classeiiiandiiiinheritance/p14derivediiiclassiiiinitializationiiiorder/Base;",
      "name",
      "",
      "lastName",
      "(Ljava/lang/String;Ljava/lang/String;)V",
      "getLastName",
      "()Ljava/lang/String;",
      "size",
      "",
      "getSize",
      "()I",
      "yet-another-kotlin-vs-java-comparison"
    })
public final class Derived extends Base {
  private final int size;
  @NotNull private final String lastName;

  @Override
  public int getSize() {
    return this.size;
  }

  @NotNull
  public final String getLastName() {
    return this.lastName;
  }

  public Derived(@NotNull String name, @NotNull String lastName) {
    int n;
    Intrinsics.checkParameterIsNotNull((Object) name, (String) "name");
    Intrinsics.checkParameterIsNotNull((Object) lastName, (String) "lastName");
    String string = StringsKt.capitalize((String) name);
    Derived derived = this;
    String it = string;
    String string2 = "Argument for Base: " + it;
    System.out.println((Object) string2);
    String string3 = string;
    super(string3);
    this.lastName = lastName;
    string = "Initializing Derived";
    System.out.println((Object) string);
    int n2 = super.getSize() + this.lastName.length();
    derived = this;
    int it2 = n2;
    string2 = "Initializing size in Derived: " + it2;
    System.out.println((Object) string2);
    derived.size = n = n2;
  }
}
