package main;

import java.util.Scanner;
import corvusExceptions.CorvusSemanticException;
import corvusParser.ProjParser;
import corvusParser.ProjLexer;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.InputMismatchException;
import org.antlr.v4.runtime.RecognitionException;

/*
 * Arquivo fonte: .proj
 */

public class MainClass {
    public static void main(String[] args){
        Scanner _scan = new Scanner(System.in);
        try {
            ProjLexer lexer;
            ProjParser parser;
            lexer = new ProjLexer(CharStreams.fromFileName("script.cor"));

            CommonTokenStream tokenStream = new CommonTokenStream(lexer);

            parser = new ProjParser(tokenStream);

            parser.prog();
            //parser.printCMD();
            parser.generateCode();
            System.out.println("Compilation Successful");
        } catch (RecognitionException e){
            System.out.println("@@ RecognitionException -- " + e.getMessage());
        } catch (CorvusSemanticException e) {
            System.out.println("@@ SemanticException -- " + e.getMessage());
        } catch (Exception e){
            System.out.println("@@ RuntimeException -- " + e.getMessage());
        }
    }
}
