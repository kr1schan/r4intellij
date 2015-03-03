/*
 * Copyright 2011 Holger Brandl
 *
 * This code is licensed under BSD. For details see
 * http://www.opensource.org/licenses/bsd-license.php
 */

/* The following code was generated by JFlex 1.4.3 on 3/3/15 2:52 PM */

/** Based on the arc lexer (http://code.google.com/p/intelli-arc/) **/

package com.r4intellij.lang.lexer;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.r4intellij.psi.RTypes;

import static com.r4intellij.psi.RTypes.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 3/3/15 2:52 PM from the specification file
 * <tt>src/com/r4intellij/lang/lexer/r.flex</tt>
 */
public class _RLexer implements FlexLexer {
    /**
     * initial size of the lookahead buffer
     */
    private static final int ZZ_BUFFERSIZE = 16384;

    /**
     * lexical states
     */
    public static final int YYINITIAL = 0;

    /**
     * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
     * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
     * at the beginning of a line
     * l is of the form l = 2*k, k a non negative integer
     */
    private static final int ZZ_LEXSTATE[] = {
            0, 0
    };

    /**
     * Translates characters to character classes
     */
    private static final String ZZ_CMAP_PACKED =
            "\11\0\1\2\1\1\1\0\1\2\1\1\22\0\1\2\1\54\1\15" +
                    "\1\3\1\70\1\65\1\60\1\16\1\46\1\47\1\64\1\12\1\45" +
                    "\1\62\1\13\1\66\1\6\11\7\1\44\1\43\1\57\1\55\1\56" +
                    "\1\73\1\72\4\4\1\11\6\4\1\10\1\4\1\41\5\4\1\71" +
                    "\1\42\5\4\1\52\1\14\1\53\1\67\1\5\1\0\1\35\1\34" +
                    "\1\22\1\4\1\32\1\17\1\4\1\30\1\24\1\4\1\36\1\31" +
                    "\1\4\1\21\1\25\1\40\1\4\1\26\1\33\1\23\1\20\1\4" +
                    "\1\27\1\37\2\4\1\50\1\61\1\51\1\63\uff81\0";

    /**
     * Translates characters to character classes
     */
    private static final char[] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

    /**
     * Translates DFA states to action switch labels.
     */
    private static final int[] ZZ_ACTION = zzUnpackAction();

    private static final String ZZ_ACTION_PACKED_0 =
            "\1\1\1\2\1\1\1\3\1\4\1\5\2\6\1\7" +
                    "\1\5\2\10\10\5\1\11\1\12\1\13\1\14\1\15" +
                    "\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25" +
                    "\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35" +
                    "\1\36\1\37\1\40\2\4\1\0\2\6\2\5\3\10" +
                    "\3\5\1\41\1\42\5\5\1\43\1\44\1\45\1\46" +
                    "\1\47\1\50\1\51\1\0\1\52\1\53\1\54\1\55" +
                    "\3\0\1\33\1\4\1\6\1\0\1\5\1\56\1\5" +
                    "\1\57\6\5\1\60\1\61\1\62\1\63\1\4\1\5" +
                    "\1\64\2\5\1\65\1\5\1\66\1\4\2\5\1\67" +
                    "\1\70\1\0\1\4\1\5\1\71\1\0\1\4\1\5" +
                    "\1\72\1\4\1\73\160\4";


    private static int[] zzUnpackAction() {
        int[] result = new int[232];
        int offset = 0;
        offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
        return result;
    }


    private static int zzUnpackAction(String packed, int offset, int[] result) {
        int i = 0;       /* index in packed string  */
        int j = offset;  /* index in unpacked array */
        int l = packed.length();
        while (i < l) {
            int count = packed.charAt(i++);
            int value = packed.charAt(i++);
            do result[j++] = value; while (--count > 0);
        }
        return j;
    }


    /**
     * Translates a state to a row index in the transition table
     */
    private static final int[] ZZ_ROWMAP = zzUnpackRowMap();

    private static final String ZZ_ROWMAP_PACKED_0 =
            "\0\0\0\74\0\170\0\74\0\264\0\360\0\u012c\0\u0168" +
                    "\0\74\0\u01a4\0\u01e0\0\u021c\0\u0258\0\u0294\0\u02d0\0\u030c" +
                    "\0\u0348\0\u0384\0\u03c0\0\u03fc\0\74\0\u0438\0\74\0\74" +
                    "\0\74\0\74\0\74\0\u0474\0\u04b0\0\u04ec\0\u0528\0\u0564" +
                    "\0\u05a0\0\u05dc\0\u0618\0\u0654\0\74\0\74\0\u0690\0\74" +
                    "\0\74\0\74\0\74\0\74\0\u06cc\0\u0708\0\u0744\0\u0780" +
                    "\0\74\0\u07bc\0\u07f8\0\u0834\0\74\0\u0870\0\u08ac\0\u08e8" +
                    "\0\u0924\0\360\0\360\0\u0960\0\u099c\0\u09d8\0\u0a14\0\u0a50" +
                    "\0\u0a8c\0\74\0\74\0\74\0\74\0\74\0\74\0\u0ac8" +
                    "\0\74\0\74\0\74\0\u0b04\0\u0b40\0\u0b7c\0\u0bb8\0\74" +
                    "\0\u0bf4\0\u0c30\0\u0c30\0\u0c6c\0\360\0\u0ca8\0\360\0\u0ce4" +
                    "\0\u0d20\0\u0d5c\0\u0d98\0\u0dd4\0\u0e10\0\74\0\74\0\74" +
                    "\0\74\0\u0e4c\0\u0e88\0\360\0\u0ec4\0\u0f00\0\360\0\u0f3c" +
                    "\0\360\0\u0f78\0\u0fb4\0\u0ff0\0\360\0\360\0\u102c\0\u1068" +
                    "\0\u10a4\0\360\0\u10e0\0\u111c\0\u1158\0\u1194\0\u11d0\0\360" +
                    "\0\u120c\0\u1248\0\u1284\0\u12c0\0\u12fc\0\u1338\0\u1374\0\u13b0" +
                    "\0\u13ec\0\u1428\0\u1464\0\u14a0\0\u14dc\0\u1518\0\u1554\0\u1590" +
                    "\0\u15cc\0\u1608\0\u1644\0\u1680\0\u16bc\0\u16f8\0\u1734\0\u1770" +
                    "\0\u17ac\0\u17e8\0\u1824\0\u1860\0\u189c\0\u18d8\0\u1914\0\u1950" +
                    "\0\u198c\0\u19c8\0\u1a04\0\u1a40\0\u1a7c\0\u1ab8\0\u1af4\0\u1b30" +
                    "\0\u1b6c\0\u1ba8\0\u1be4\0\u1c20\0\u1c5c\0\u1c98\0\u1cd4\0\u1d10" +
                    "\0\u1d4c\0\u1d88\0\u1dc4\0\u1e00\0\u1e3c\0\u1e78\0\u1eb4\0\u1ef0" +
                    "\0\u1f2c\0\u1f68\0\u1fa4\0\u1fe0\0\u201c\0\u2058\0\u2094\0\u20d0" +
                    "\0\u210c\0\u2148\0\u2184\0\u21c0\0\u21fc\0\u2238\0\u2274\0\u22b0" +
                    "\0\u22ec\0\u2328\0\u2364\0\u23a0\0\u23dc\0\u2418\0\u2454\0\u2490" +
                    "\0\u24cc\0\u2508\0\u2544\0\u2580\0\u25bc\0\u25f8\0\u2634\0\u2670" +
                    "\0\u26ac\0\u26e8\0\u2724\0\u2760\0\u279c\0\u27d8\0\u2814\0\u2850" +
                    "\0\u288c\0\u28c8\0\u2904\0\u2940\0\u297c\0\u29b8\0\u29f4\0\u2a30" +
                    "\0\u2a6c\0\u2aa8\0\u2ae4\0\u2b20\0\u2b5c\0\u2b98\0\u2bd4\0\u2c10";


    private static int[] zzUnpackRowMap() {
        int[] result = new int[232];
        int offset = 0;
        offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
        return result;
    }


    private static int zzUnpackRowMap(String packed, int offset, int[] result) {
        int i = 0;  /* index in packed string  */
        int j = offset;  /* index in unpacked array */
        int l = packed.length();
        while (i < l) {
            int high = packed.charAt(i++) << 16;
            result[j++] = high | packed.charAt(i++);
        }
        return j;
    }


    /**
     * The transition table of the DFA
     */
    private static final int[] ZZ_TRANS = zzUnpackTrans();

    private static final String ZZ_TRANS_PACKED_0 =
            "\1\2\1\3\1\4\1\5\1\6\1\2\1\7\1\10" +
                    "\2\6\1\11\1\12\1\2\1\13\1\14\1\15\1\6" +
                    "\1\16\2\6\1\17\1\6\1\20\1\21\2\6\1\22" +
                    "\1\6\1\23\4\6\1\24\1\6\1\25\1\26\1\27" +
                    "\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37" +
                    "\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47" +
                    "\1\50\1\51\1\52\1\6\1\53\1\54\75\0\1\3" +
                    "\72\0\1\55\1\0\1\55\1\56\70\55\4\0\6\6" +
                    "\1\0\1\6\3\0\24\6\26\0\1\6\10\0\2\7" +
                    "\1\0\1\57\1\0\1\60\16\0\1\57\47\0\2\10" +
                    "\1\61\1\57\1\0\1\60\16\0\1\57\45\0\2\6" +
                    "\2\62\2\6\1\0\1\63\3\0\24\6\26\0\1\6" +
                    "\2\0\14\13\1\64\1\65\56\13\14\14\1\66\1\14" +
                    "\1\65\55\14\4\0\6\6\1\0\1\6\3\0\1\6" +
                    "\1\67\4\6\1\70\15\6\26\0\1\6\6\0\6\6" +
                    "\1\0\1\6\3\0\13\6\1\71\10\6\26\0\1\6" +
                    "\6\0\6\6\1\0\1\6\3\0\1\72\1\6\1\73" +
                    "\21\6\26\0\1\6\6\0\6\6\1\0\1\6\3\0" +
                    "\13\6\1\74\10\6\26\0\1\6\6\0\6\6\1\0" +
                    "\1\6\3\0\11\6\1\75\12\6\26\0\1\6\6\0" +
                    "\6\6\1\0\1\6\3\0\12\6\1\76\11\6\26\0" +
                    "\1\6\6\0\6\6\1\0\1\6\3\0\7\6\1\77" +
                    "\14\6\26\0\1\6\6\0\6\6\1\0\1\6\3\0" +
                    "\23\6\1\100\26\0\1\6\46\0\1\101\101\0\1\102" +
                    "\74\0\1\103\75\0\1\104\73\0\1\105\73\0\1\106" +
                    "\73\0\1\107\1\0\1\110\2\0\1\111\71\0\1\112" +
                    "\74\0\1\113\70\0\1\114\27\0\1\115\11\0\1\116" +
                    "\1\115\11\0\1\115\16\0\1\115\1\117\4\0\1\115" +
                    "\1\120\1\115\1\0\1\115\1\117\2\0\1\55\1\0" +
                    "\73\55\1\0\1\55\1\121\70\55\6\0\2\122\2\0" +
                    "\1\123\47\0\1\123\17\0\2\60\1\0\1\57\20\0" +
                    "\1\57\45\0\2\6\2\62\1\6\1\124\1\0\1\6" +
                    "\3\0\13\6\1\124\10\6\26\0\1\6\6\0\6\6" +
                    "\1\0\1\125\3\0\24\6\26\0\1\6\2\0\1\13" +
                    "\1\0\72\13\1\14\1\0\72\14\4\0\6\6\1\0" +
                    "\1\6\3\0\2\6\1\126\21\6\26\0\1\6\6\0" +
                    "\6\6\1\0\1\6\3\0\7\6\1\127\14\6\26\0" +
                    "\1\6\6\0\6\6\1\0\1\6\3\0\20\6\1\130" +
                    "\3\6\26\0\1\6\6\0\6\6\1\0\1\6\3\0" +
                    "\21\6\1\131\2\6\26\0\1\6\6\0\6\6\1\0" +
                    "\1\6\3\0\5\6\1\132\16\6\26\0\1\6\6\0" +
                    "\6\6\1\0\1\6\3\0\14\6\1\133\7\6\26\0" +
                    "\1\6\6\0\6\6\1\0\1\6\3\0\13\6\1\134" +
                    "\10\6\26\0\1\6\6\0\4\6\1\135\1\6\1\0" +
                    "\1\6\3\0\24\6\26\0\1\6\46\0\1\136\111\0" +
                    "\1\137\67\0\1\140\102\0\1\141\27\0\1\115\130\0" +
                    "\1\115\15\0\1\55\1\0\1\55\1\142\70\55\6\0" +
                    "\2\122\70\0\6\6\1\123\1\6\3\0\24\6\17\0" +
                    "\1\123\6\0\1\6\6\0\6\6\1\0\1\6\3\0" +
                    "\3\6\1\143\20\6\26\0\1\6\6\0\6\6\1\0" +
                    "\1\6\3\0\4\6\1\144\17\6\26\0\1\6\6\0" +
                    "\6\6\1\0\1\6\3\0\13\6\1\145\10\6\26\0" +
                    "\1\6\6\0\6\6\1\0\1\6\3\0\12\6\1\146" +
                    "\11\6\26\0\1\6\6\0\6\6\1\0\1\6\3\0" +
                    "\13\6\1\147\10\6\26\0\1\6\6\0\6\6\1\0" +
                    "\1\6\3\0\16\6\1\150\5\6\26\0\1\6\6\0" +
                    "\4\6\1\151\1\6\1\0\1\6\3\0\24\6\26\0" +
                    "\1\6\2\0\1\55\1\0\1\55\1\152\70\55\4\0" +
                    "\6\6\1\0\1\6\3\0\4\6\1\153\17\6\26\0" +
                    "\1\6\6\0\6\6\1\0\1\6\3\0\16\6\1\154" +
                    "\5\6\26\0\1\6\6\0\6\6\1\0\1\6\3\0" +
                    "\13\6\1\155\10\6\26\0\1\6\6\0\6\6\1\0" +
                    "\1\6\3\0\17\6\1\156\4\6\26\0\1\6\2\0" +
                    "\1\55\1\157\1\55\1\160\70\55\4\0\6\6\1\0" +
                    "\1\6\3\0\5\6\1\161\16\6\26\0\1\6\6\0" +
                    "\6\6\1\0\1\6\3\0\4\6\1\162\17\6\26\0" +
                    "\1\6\5\0\1\163\70\0\1\55\1\157\1\55\1\164" +
                    "\70\55\4\0\6\6\1\0\1\6\3\0\6\6\1\165" +
                    "\15\6\26\0\1\6\5\0\1\166\70\0\1\55\1\157" +
                    "\1\55\1\167\70\55\4\0\6\6\1\0\1\6\3\0" +
                    "\2\6\1\170\21\6\26\0\1\6\2\0\1\166\1\0" +
                    "\72\166\1\55\1\157\1\55\1\171\71\55\1\157\1\55" +
                    "\1\172\71\55\1\157\1\55\1\173\71\55\1\157\1\55" +
                    "\1\174\71\55\1\157\1\55\1\175\71\55\1\157\1\55" +
                    "\1\176\71\55\1\157\1\55\1\177\71\55\1\157\1\55" +
                    "\1\200\71\55\1\157\1\55\1\201\71\55\1\157\1\55" +
                    "\1\202\71\55\1\157\1\55\1\203\71\55\1\157\1\55" +
                    "\1\204\71\55\1\157\1\55\1\205\71\55\1\157\1\55" +
                    "\1\206\71\55\1\157\1\55\1\207\71\55\1\157\1\55" +
                    "\1\210\71\55\1\157\1\55\1\211\71\55\1\157\1\55" +
                    "\1\212\71\55\1\157\1\55\1\213\71\55\1\157\1\55" +
                    "\1\214\71\55\1\157\1\55\1\215\71\55\1\157\1\55" +
                    "\1\216\71\55\1\157\1\55\1\217\71\55\1\157\1\55" +
                    "\1\220\71\55\1\157\1\55\1\221\71\55\1\157\1\55" +
                    "\1\222\71\55\1\157\1\55\1\223\71\55\1\157\1\55" +
                    "\1\224\71\55\1\157\1\55\1\225\71\55\1\157\1\55" +
                    "\1\226\71\55\1\157\1\55\1\227\71\55\1\157\1\55" +
                    "\1\230\71\55\1\157\1\55\1\231\71\55\1\157\1\55" +
                    "\1\232\71\55\1\157\1\55\1\233\71\55\1\157\1\55" +
                    "\1\234\71\55\1\157\1\55\1\235\71\55\1\157\1\55" +
                    "\1\236\71\55\1\157\1\55\1\237\71\55\1\157\1\55" +
                    "\1\240\71\55\1\157\1\55\1\241\71\55\1\157\1\55" +
                    "\1\242\71\55\1\157\1\55\1\243\71\55\1\157\1\55" +
                    "\1\244\71\55\1\157\1\55\1\245\71\55\1\157\1\55" +
                    "\1\246\71\55\1\157\1\55\1\247\71\55\1\157\1\55" +
                    "\1\250\71\55\1\157\1\55\1\251\71\55\1\157\1\55" +
                    "\1\252\71\55\1\157\1\55\1\253\71\55\1\157\1\55" +
                    "\1\254\71\55\1\157\1\55\1\255\71\55\1\157\1\55" +
                    "\1\256\71\55\1\157\1\55\1\257\71\55\1\157\1\55" +
                    "\1\260\71\55\1\157\1\55\1\261\71\55\1\157\1\55" +
                    "\1\262\71\55\1\157\1\55\1\263\71\55\1\157\1\55" +
                    "\1\264\71\55\1\157\1\55\1\265\71\55\1\157\1\55" +
                    "\1\266\71\55\1\157\1\55\1\267\71\55\1\157\1\55" +
                    "\1\270\71\55\1\157\1\55\1\271\71\55\1\157\1\55" +
                    "\1\272\71\55\1\157\1\55\1\273\71\55\1\157\1\55" +
                    "\1\274\71\55\1\157\1\55\1\275\71\55\1\157\1\55" +
                    "\1\276\71\55\1\157\1\55\1\277\71\55\1\157\1\55" +
                    "\1\300\71\55\1\157\1\55\1\301\71\55\1\157\1\55" +
                    "\1\302\71\55\1\157\1\55\1\303\71\55\1\157\1\55" +
                    "\1\304\71\55\1\157\1\55\1\305\71\55\1\157\1\55" +
                    "\1\306\71\55\1\157\1\55\1\307\71\55\1\157\1\55" +
                    "\1\310\71\55\1\157\1\55\1\311\71\55\1\157\1\55" +
                    "\1\312\71\55\1\157\1\55\1\313\71\55\1\157\1\55" +
                    "\1\314\71\55\1\157\1\55\1\315\71\55\1\157\1\55" +
                    "\1\316\71\55\1\157\1\55\1\317\71\55\1\157\1\55" +
                    "\1\320\71\55\1\157\1\55\1\321\71\55\1\157\1\55" +
                    "\1\322\71\55\1\157\1\55\1\323\71\55\1\157\1\55" +
                    "\1\324\71\55\1\157\1\55\1\325\71\55\1\157\1\55" +
                    "\1\326\71\55\1\157\1\55\1\327\71\55\1\157\1\55" +
                    "\1\330\71\55\1\157\1\55\1\331\71\55\1\157\1\55" +
                    "\1\332\71\55\1\157\1\55\1\333\71\55\1\157\1\55" +
                    "\1\334\71\55\1\157\1\55\1\335\71\55\1\157\1\55" +
                    "\1\336\71\55\1\157\1\55\1\337\71\55\1\157\1\55" +
                    "\1\340\71\55\1\157\1\55\1\341\71\55\1\157\1\55" +
                    "\1\342\71\55\1\157\1\55\1\343\71\55\1\157\1\55" +
                    "\1\344\71\55\1\157\1\55\1\345\71\55\1\157\1\55" +
                    "\1\346\71\55\1\157\1\55\1\347\71\55\1\157\1\55" +
                    "\1\350\71\55\1\157\72\55";


    private static int[] zzUnpackTrans() {
        int[] result = new int[11340];
        int offset = 0;
        offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
        return result;
    }


    private static int zzUnpackTrans(String packed, int offset, int[] result) {
        int i = 0;       /* index in packed string  */
        int j = offset;  /* index in unpacked array */
        int l = packed.length();
        while (i < l) {
            int count = packed.charAt(i++);
            int value = packed.charAt(i++);
            value--;
            do result[j++] = value; while (--count > 0);
        }
        return j;
    }


    /* error codes */
    private static final int ZZ_UNKNOWN_ERROR = 0;
    private static final int ZZ_NO_MATCH = 1;
    private static final int ZZ_PUSHBACK_2BIG = 2;
    private static final char[] EMPTY_BUFFER = new char[0];
    private static final int YYEOF = -1;
    private static java.io.Reader zzReader = null; // Fake

    /* error messages for the codes above */
    private static final String ZZ_ERROR_MSG[] = {
            "Unkown internal scanner error",
            "Error: could not match input",
            "Error: pushback value was too large"
    };

    /**
     * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
     */
    private static final int[] ZZ_ATTRIBUTE = zzUnpackAttribute();

    private static final String ZZ_ATTRIBUTE_PACKED_0 =
            "\1\1\1\11\1\1\1\11\4\1\1\11\13\1\1\11" +
                    "\1\1\5\11\11\1\2\11\1\1\5\11\2\1\1\0" +
                    "\1\1\1\11\3\1\1\11\14\1\6\11\1\0\3\11" +
                    "\1\1\3\0\1\11\2\1\1\0\12\1\4\11\15\1" +
                    "\1\0\3\1\1\0\165\1";


    private static int[] zzUnpackAttribute() {
        int[] result = new int[232];
        int offset = 0;
        offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
        return result;
    }


    private static int zzUnpackAttribute(String packed, int offset, int[] result) {
        int i = 0;       /* index in packed string  */
        int j = offset;  /* index in unpacked array */
        int l = packed.length();
        while (i < l) {
            int count = packed.charAt(i++);
            int value = packed.charAt(i++);
            do result[j++] = value; while (--count > 0);
        }
        return j;
    }


    /** the current state of the DFA */
    private int zzState;

    /**
     * the current lexical state
     */
    private int zzLexicalState = YYINITIAL;

    /** this buffer contains the current text to be matched and is
     the source of the yytext() string */
    private CharSequence zzBuffer = "";

    /** this buffer may contains the current text array to be matched when it is cheap to acquire it */
    private char[] zzBufferArray;

    /** the textposition at the last accepting state */
    private int zzMarkedPos;

    /** the textposition at the last state to be included in yytext */
    private int zzPushbackPos;

    /** the current text position in the buffer */
    private int zzCurrentPos;

    /** startRead marks the beginning of the yytext() string in the buffer */
    private int zzStartRead;

    /** endRead marks the last character in the buffer, that has been read
     from input */
    private int zzEndRead;

    /**
     * zzAtBOL == true <=> the scanner is currently at the beginning of a line
     */
    private boolean zzAtBOL = true;

    /** zzAtEOF == true <=> the scanner is at the EOF */
    private boolean zzAtEOF;

    /* user code: */
    StringBuffer string = new StringBuffer();

    //helper
    long yychar = 0;


    public _RLexer(java.io.Reader in) {
        this.zzReader = in;
    }


    /**
     * Creates a new scanner.
     * There is also java.io.Reader version of this constructor.
     *
     * @param in the java.io.Inputstream to read input from.
     */
    public _RLexer(java.io.InputStream in) {
        this(new java.io.InputStreamReader(in));
    }


    /**
     * Unpacks the compressed character translation table.
     *
     * @param packed the packed character translation table
     * @return the unpacked character translation table
     */
    private static char[] zzUnpackCMap(String packed) {
        char[] map = new char[0x10000];
        int i = 0;  /* index in packed string  */
        int j = 0;  /* index in unpacked array */
        while (i < 156) {
            int count = packed.charAt(i++);
            char value = packed.charAt(i++);
            do map[j++] = value; while (--count > 0);
        }
        return map;
    }


    public final int getTokenStart() {
        return zzStartRead;
    }


    public final int getTokenEnd() {
        return getTokenStart() + yylength();
    }


    public void reset(CharSequence buffer, int start, int end, int initialState) {
        zzBuffer = buffer;
        zzBufferArray = com.intellij.util.text.CharArrayUtil.fromSequenceWithoutCopying(buffer);
        zzCurrentPos = zzMarkedPos = zzStartRead = start;
        zzPushbackPos = 0;
        zzAtEOF = false;
        zzAtBOL = true;
        zzEndRead = end;
        yybegin(initialState);
    }


    /**
     * Refills the input buffer.
     *
     * @return <code>false</code>, iff there was new input.
     * @throws java.io.IOException if any I/O-Error occurs
     */
    private boolean zzRefill() throws java.io.IOException {
        return true;
    }


    /**
     * Returns the current lexical state.
     */
    public final int yystate() {
        return zzLexicalState;
    }


    /**
     * Enters a new lexical state
     *
     * @param newState the new lexical state
     */
    public final void yybegin(int newState) {
        zzLexicalState = newState;
    }


    /**
     * Returns the text matched by the current regular expression.
     */
    public final CharSequence yytext() {
        return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
    }


    /**
     * Returns the character at position <tt>pos</tt> from the
     * matched text.
     * <p/>
     * It is equivalent to yytext().charAt(pos), but faster
     *
     * @param pos the position of the character to fetch.
     *            A value from 0 to yylength()-1.
     * @return the character at position pos
     */
    public final char yycharat(int pos) {
        return zzBufferArray != null ? zzBufferArray[zzStartRead + pos] : zzBuffer.charAt(zzStartRead + pos);
    }


    /**
     * Returns the length of the matched text region.
     */
    public final int yylength() {
        return zzMarkedPos - zzStartRead;
    }


    /**
     * Reports an error that occured while scanning.
     * <p/>
     * In a wellformed scanner (no or only correct usage of
     * yypushback(int) and a match-all fallback rule) this method
     * will only be called with things that "Can't Possibly Happen".
     * If this method is called, something is seriously wrong
     * (e.g. a JFlex bug producing a faulty scanner etc.).
     * <p/>
     * Usual syntax/scanner level error handling should be done
     * in error fallback rules.
     *
     * @param errorCode the code of the errormessage to display
     */
    private void zzScanError(int errorCode) {
        String message;
        try {
            message = ZZ_ERROR_MSG[errorCode];
        } catch (ArrayIndexOutOfBoundsException e) {
            message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
        }

        throw new Error(message);
    }


    /**
     * Pushes the specified amount of characters back into the input stream.
     *
     * They will be read again by then next call of the scanning method
     *
     * @param number  the number of characters to be read again.
     *                This number must not be greater than yylength()!
     */
    public void yypushback(int number) {
        if (number > yylength())
            zzScanError(ZZ_PUSHBACK_2BIG);

        zzMarkedPos -= number;
    }


    /**
     * Resumes scanning until the next regular expression is matched,
     * the end of input is encountered or an I/O-Error occurs.
     *
     * @return the next token
     * @exception java.io.IOException  if any I/O-Error occurs
     */
    public IElementType advance() throws java.io.IOException {
        int zzInput;
        int zzAction;

        // cached fields:
        int zzCurrentPosL;
        int zzMarkedPosL;
        int zzEndReadL = zzEndRead;
        CharSequence zzBufferL = zzBuffer;
        char[] zzBufferArrayL = zzBufferArray;
        char[] zzCMapL = ZZ_CMAP;

        int[] zzTransL = ZZ_TRANS;
        int [] zzRowMapL = ZZ_ROWMAP;
        int[] zzAttrL = ZZ_ATTRIBUTE;

        while (true) {
            zzMarkedPosL = zzMarkedPos;

            yychar += zzMarkedPosL - zzStartRead;

            zzAction = -1;

            zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

            zzState = ZZ_LEXSTATE[zzLexicalState];


            zzForAction:
            {
                while (true) {

                    if (zzCurrentPosL < zzEndReadL)
                        zzInput = zzBufferL.charAt(zzCurrentPosL++);
                    else if (zzAtEOF) {
                        zzInput = YYEOF;
                        break zzForAction;
                    } else {
                        // store back cached positions
                        zzCurrentPos = zzCurrentPosL;
                        zzMarkedPos = zzMarkedPosL;
                        boolean eof = zzRefill();
                        // get translated positions and possibly new buffer
                        zzCurrentPosL = zzCurrentPos;
                        zzMarkedPosL = zzMarkedPos;
                        zzBufferL = zzBuffer;
                        zzEndReadL = zzEndRead;
                        if (eof) {
                            zzInput = YYEOF;
                            break zzForAction;
                        } else {
                            zzInput = zzBufferL.charAt(zzCurrentPosL++);
                        }
                    }
                    int zzNext = zzTransL[zzRowMapL[zzState] + zzCMapL[zzInput]];
                    if (zzNext == -1) break zzForAction;
                    zzState = zzNext;

                    int zzAttributes = zzAttrL[zzState];
                    if ((zzAttributes & 1) == 1) {
                        zzAction = zzState;
                        zzMarkedPosL = zzCurrentPosL;
                        if ((zzAttributes & 8) == 8) break zzForAction;
                    }

                }
            }

            // store back cached position
            zzMarkedPos = zzMarkedPosL;

            switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
                case 46: {
                    return R_SYMBOL_FORMALS;
                }
                case 60:
                    break;
                case 42: {
                    return R_LEFT_ASSIGN;
                }
                case 61:
                    break;
                case 37: {
                    yybegin(YYINITIAL);
                    return RTypes.R_RBB;
                }
                case 62:
                    break;
                case 47: {
                    return R_FOR;
                }
                case 63:
                    break;
                case 54: {
                    return R_NULL_CONST;
                }
                case 64:
                    break;
                case 57: {
                    return R_REPEAT;
                }
                case 65:
                    break;
                case 8: {
                    yybegin(YYINITIAL);
                    return RTypes.R_STR_CONST;
                }
                case 66:
                    break;
                case 27: {
                    return R_ARITH_MOD;
                }
                case 67:
                    break;
                case 24: {
                    return R_ARITH_MINUS;
                }
                case 68:
                    break;
                case 31: {
                    return R_SLOT;
                }
                case 69:
                    break;
                case 14: {
                    yybegin(YYINITIAL);
                    return RTypes.R_LEFT_BRACE;
                }
                case 70:
                    break;
                case 19: {
                    return R_EQ_ASSIGN;
                }
                case 71:
                    break;
                case 23: {
                    return R_OR;
                }
                case 72:
                    break;
                case 34: {
                    return R_IN;
                }
                case 73:
                    break;
                case 43: {
                    return R_AND2;
                }
                case 74:
                    break;
                case 28: {
                    return R_ARITH_DIV;
                }
                case 75:
                    break;
                case 25: {
                    return R_TILDE;
                }
                case 76:
                    break;
                case 49: {
                    return R_GLOBAL_LEFT_ASSIGN;
                }
                case 77:
                    break;
                case 40: {
                    return R_GE;
                }
                case 78:
                    break;
                case 17: {
                    yybegin(YYINITIAL);
                    return RTypes.R_RIGHT_BRACKET;
                }
                case 79:
                    break;
                case 53: {
                    return R_ELSE;
                }
                case 80:
                    break;
                case 48: {
                    yybegin(YYINITIAL);
                    return RTypes.R_NS_GET_INT;
                }
                case 81:
                    break;
                case 45: {
                    return R_RIGHT_ASSIGN;
                }
                case 82:
                    break;
                case 11: {
                    yybegin(YYINITIAL);
                    return R_COMMA;
                }
                case 83:
                    break;
                case 5: {
                    yybegin(YYINITIAL);
                    return RTypes.R_SYMBOL;
                }
                case 84:
                    break;
                case 1: {
                    yybegin(YYINITIAL);
                    return R_EOL;
                }
                case 85:
                    break;
                case 20: {
                    return R_GT;
                }
                case 86:
                    break;
                case 7: {
                    return R_ARITH_PLUS;
                }
                case 87:
                    break;
                case 13: {
                    yybegin(YYINITIAL);
                    return RTypes.R_RIGHT_PAREN;
                }
                case 88:
                    break;
                case 16: {
                    yybegin(YYINITIAL);
                    return RTypes.R_LEFT_BRACKET;
                }
                case 89:
                    break;
                case 10: {
                    yybegin(YYINITIAL);
                    return R_COLON;
                }
                case 90:
                    break;
                case 32: {
                    return R_QUESTION;
                }
                case 91:
                    break;
                case 38: {
                    return R_NE;
                }
                case 92:
                    break;
                case 51: {
                    return R_ARITH_MISC;
                }
                case 93:
                    break;
                case 36: {
                    yybegin(YYINITIAL);
                    return RTypes.R_LBB;
                }
                case 94:
                    break;
                case 52: {
                    return R_NEXT;
                }
                case 95:
                    break;
                case 30: {
                    return R_LIST_SUBSET;
                }
                case 96:
                    break;
                case 3: {
                    yybegin(YYINITIAL);
                    return com.intellij.psi.TokenType.WHITE_SPACE;
                }
                case 97:
                    break;
                case 59: {
                    return R_FUNCTION;
                }
                case 98:
                    break;
                case 39: {
                    return R_EQ;
                }
                case 99:
                    break;
                case 22: {
                    return R_AND;
                }
                case 100:
                    break;
                case 18: {
                    return R_NEGATION;
                }
                case 101:
                    break;
                case 26: {
                    return R_ARITH_MULT;
                }
                case 102:
                    break;
                case 4: {
                    yybegin(YYINITIAL);
                    return R_COMMENT;
                }
                case 103:
                    break;
                case 41: {
                    return R_LE;
                }
                case 104:
                    break;
                case 33: {
                    return R_IF;
                }
                case 105:
                    break;
                case 15: {
                    yybegin(YYINITIAL);
                    return RTypes.R_RIGHT_BRACE;
                }
                case 106:
                    break;
                case 44: {
                    return R_OR2;
                }
                case 107:
                    break;
                case 9: {
                    yybegin(YYINITIAL);
                    return RTypes.R_SEMICOLON;
                }
                case 108:
                    break;
                case 58: {
                    yybegin(YYINITIAL);
                    return R_SECTION_COMMENT;
                }
                case 109:
                    break;
                case 12: {
                    yybegin(YYINITIAL);
                    return RTypes.R_LEFT_PAREN;
                }
                case 110:
                    break;
                case 21: {
                    return R_LT;
                }
                case 111:
                    break;
                case 55: {
                    return R_WHILE;
                }
                case 112:
                    break;
                case 29: {
                    return R_ARITH_EXPONENTIAION;
                }
                case 113:
                    break;
                case 6: {
                    return R_NUM_CONST;
                }
                case 114:
                    break;
                case 50: {
                    return R_GLOBAL_RIGHT_ASSIGN;
                }
                case 115:
                    break;
                case 56: {
                    return R_BREAK;
                }
                case 116:
                    break;
                case 35: {
                    yybegin(YYINITIAL);
                    return RTypes.R_NS_GET;
                }
                case 117:
                    break;
                case 2: {
                    return com.intellij.psi.TokenType.BAD_CHARACTER;
                }
                case 118:
                    break;
                default:
                    if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            return null;
          }
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
