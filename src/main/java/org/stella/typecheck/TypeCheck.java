package org.stella.typecheck;

import org.syntax.stella.Absyn.*;
import org.stella.typecheck.VisitTypeCheck;
import org.syntax.stella.PrettyPrinter;

public class TypeCheck
{
    public static void typecheckProgram(Program program) throws Exception
    {
//        PrettyPrinter.print(program);
        VisitTypeCheck v = new VisitTypeCheck();
        program.accept(v.new ProgramVisitor<>(), null /* initial context information*/);
    }
}
