// This is a generated file. Not intended for manual editing.
package com.github.likelion.swiprolog.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.github.likelion.swiprolog.psi.PrologTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.github.likelion.swiprolog.psi.*;

public class PrologArgImpl extends ASTWrapperPsiElement implements PrologArg {

  public PrologArgImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof PrologVisitor) ((PrologVisitor)visitor).visitArg(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public PrologList getList() {
    return findChildByClass(PrologList.class);
  }

  @Override
  @Nullable
  public PrologLiteral getLiteral() {
    return findChildByClass(PrologLiteral.class);
  }

  @Override
  @Nullable
  public PrologPredicate getPredicate() {
    return findChildByClass(PrologPredicate.class);
  }

  @Override
  @Nullable
  public PsiElement getVar() {
    return findChildByType(VAR);
  }

}