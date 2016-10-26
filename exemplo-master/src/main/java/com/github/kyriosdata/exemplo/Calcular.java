/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.kyriosdata.exemplo;

import com.github.kyriosdata.parser.Lexer;
import com.github.kyriosdata.parser.Parser;

/**
 *
 * @author Paulo Junio Sales Rodrigues -/- 201602510
 */
public class Calcular {
    public static void main(String[] args) {
        int codigo = 0;
        if(args.length > 0) {
            Lexer tradutor = new Lexer(args[0]);
            try {
                Parser nome1 = new Parser(tradutor.tokenize());
                System.out.println(nome1.expressao().valor());
            } catch (Exception e) {
                codigo = 1;
            }
        }
        System.exit(codigo);
    }
}
