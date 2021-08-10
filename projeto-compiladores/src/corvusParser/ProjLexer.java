// Generated from C:/Users/Eugene/Desktop/ufabc/compiladores/Corvus/projeto-compiladores\Proj.g4 by ANTLR 4.9.1
package corvusParser;

    import corvusDataStructures.CorvusSymbol;
    import corvusDataStructures.CorvusVariable;
    import corvusDataStructures.CorvusSymbolTable;
    import corvusExceptions.CorvusSemanticException;
    import corvusAST.CorvusAbstractCommand;
    import corvusAST.CorvusProgram;
    import corvusAST.CommandRead;
    import corvusAST.CommandWrite;
    import corvusAST.CommandAttr;
    import corvusAST.CommandDecider;
    import corvusAST.CommandWhile;
    import corvusAST.CommandVariable;
    import java.util.ArrayList;
    import java.util.Stack;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ProjLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		WhiteSpace=10, OpenParentheses=11, CloseParentheses=12, OpenBraces=13, 
		CloseBraces=14, Semicolon=15, Colon=16, Operation=17, LogicalOperator=18, 
		Attribute=19, Integer=20, Float=21, String=22, IfSintax=23, ElseSintax=24, 
		WhileSintax=25, Identifier=26, Char=27;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"WhiteSpace", "OpenParentheses", "CloseParentheses", "OpenBraces", "CloseBraces", 
			"Semicolon", "Colon", "Operation", "LogicalOperator", "Attribute", "Integer", 
			"Float", "String", "IfSintax", "ElseSintax", "WhileSintax", "Identifier", 
			"Char"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'program'", "'end'", "'int'", "'float'", "'string'", "'list'", 
			"'obj'", "'read'", "'write'", null, "'('", "')'", "'{'", "'}'", "';'", 
			"','", null, null, "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "WhiteSpace", 
			"OpenParentheses", "CloseParentheses", "OpenBraces", "CloseBraces", "Semicolon", 
			"Colon", "Operation", "LogicalOperator", "Attribute", "Integer", "Float", 
			"String", "IfSintax", "ElseSintax", "WhileSintax", "Identifier", "Char"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	    private CorvusSymbolTable symbolTable = new CorvusSymbolTable();
	    private Stack<ArrayList<CorvusAbstractCommand>> cmdStack = new Stack<ArrayList<CorvusAbstractCommand>>();
	    private Stack<String> conditionStack = new Stack<String>();
	    private CorvusSymbol symbol;
	    private CorvusProgram program = new CorvusProgram();
	    private ArrayList<CorvusAbstractCommand> curThread;
	    private ArrayList<CorvusAbstractCommand> cmdTrue;
	    private ArrayList<CorvusAbstractCommand> cmdFalse;
	    private ArrayList<CorvusAbstractCommand> cmdWhile;

	    private String _readId;
	    private String _writeId;
	    private String _attrId;
	    private String _attrContent;
	    private String _exprDecision;
	    private int _varType;
	    private String _varName;
	    private String _varValue;

	    private void verifyId(String id){
	        if(!symbolTable.exists(id)){
	            throw new CorvusSemanticException("Variable '" + id + "' has not been declared");
	        }
	    }

	    public void printCMD(){
	        for(CorvusAbstractCommand cur : program.getCmd()){
	            System.out.println(cur.toString());
	        }
	    }

		public void generateCode(){
			program.generateTarget();
		}


	public ProjLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Proj.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\35\u00cc\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3"+
		"\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u008b\n\23\3\24\3\24\3\25"+
		"\3\25\3\26\6\26\u0092\n\26\r\26\16\26\u0093\3\26\3\26\6\26\u0098\n\26"+
		"\r\26\16\26\u0099\5\26\u009c\n\26\3\27\3\27\7\27\u00a0\n\27\f\27\16\27"+
		"\u00a3\13\27\3\27\3\27\3\30\3\30\3\30\3\30\5\30\u00ab\n\30\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\5\31\u00b5\n\31\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\5\32\u00c1\n\32\3\33\3\33\7\33\u00c5\n\33\f"+
		"\33\16\33\u00c8\13\33\3\34\5\34\u00cb\n\34\2\2\35\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\67\35\3\2\t\5\2\13\f\17\17\"\"\6\2"+
		"\'\',-//\61\61\4\2>>@@\3\2\62;\4\2$$))\3\2c|\5\2\62;C\\c|\2\u00da\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2"+
		"\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\39\3\2\2\2\5A\3\2\2"+
		"\2\7E\3\2\2\2\tI\3\2\2\2\13O\3\2\2\2\rV\3\2\2\2\17[\3\2\2\2\21_\3\2\2"+
		"\2\23d\3\2\2\2\25j\3\2\2\2\27n\3\2\2\2\31p\3\2\2\2\33r\3\2\2\2\35t\3\2"+
		"\2\2\37v\3\2\2\2!x\3\2\2\2#z\3\2\2\2%\u008a\3\2\2\2\'\u008c\3\2\2\2)\u008e"+
		"\3\2\2\2+\u0091\3\2\2\2-\u009d\3\2\2\2/\u00aa\3\2\2\2\61\u00b4\3\2\2\2"+
		"\63\u00c0\3\2\2\2\65\u00c2\3\2\2\2\67\u00ca\3\2\2\29:\7r\2\2:;\7t\2\2"+
		";<\7q\2\2<=\7i\2\2=>\7t\2\2>?\7c\2\2?@\7o\2\2@\4\3\2\2\2AB\7g\2\2BC\7"+
		"p\2\2CD\7f\2\2D\6\3\2\2\2EF\7k\2\2FG\7p\2\2GH\7v\2\2H\b\3\2\2\2IJ\7h\2"+
		"\2JK\7n\2\2KL\7q\2\2LM\7c\2\2MN\7v\2\2N\n\3\2\2\2OP\7u\2\2PQ\7v\2\2QR"+
		"\7t\2\2RS\7k\2\2ST\7p\2\2TU\7i\2\2U\f\3\2\2\2VW\7n\2\2WX\7k\2\2XY\7u\2"+
		"\2YZ\7v\2\2Z\16\3\2\2\2[\\\7q\2\2\\]\7d\2\2]^\7l\2\2^\20\3\2\2\2_`\7t"+
		"\2\2`a\7g\2\2ab\7c\2\2bc\7f\2\2c\22\3\2\2\2de\7y\2\2ef\7t\2\2fg\7k\2\2"+
		"gh\7v\2\2hi\7g\2\2i\24\3\2\2\2jk\t\2\2\2kl\3\2\2\2lm\b\13\2\2m\26\3\2"+
		"\2\2no\7*\2\2o\30\3\2\2\2pq\7+\2\2q\32\3\2\2\2rs\7}\2\2s\34\3\2\2\2tu"+
		"\7\177\2\2u\36\3\2\2\2vw\7=\2\2w \3\2\2\2xy\7.\2\2y\"\3\2\2\2z{\t\3\2"+
		"\2{$\3\2\2\2|}\7~\2\2}\u008b\7~\2\2~\177\7(\2\2\177\u008b\7(\2\2\u0080"+
		"\u0081\7#\2\2\u0081\u008b\7?\2\2\u0082\u008b\7#\2\2\u0083\u0084\7?\2\2"+
		"\u0084\u008b\7?\2\2\u0085\u008b\t\4\2\2\u0086\u0087\7>\2\2\u0087\u008b"+
		"\7?\2\2\u0088\u0089\7@\2\2\u0089\u008b\7?\2\2\u008a|\3\2\2\2\u008a~\3"+
		"\2\2\2\u008a\u0080\3\2\2\2\u008a\u0082\3\2\2\2\u008a\u0083\3\2\2\2\u008a"+
		"\u0085\3\2\2\2\u008a\u0086\3\2\2\2\u008a\u0088\3\2\2\2\u008b&\3\2\2\2"+
		"\u008c\u008d\7?\2\2\u008d(\3\2\2\2\u008e\u008f\t\5\2\2\u008f*\3\2\2\2"+
		"\u0090\u0092\t\5\2\2\u0091\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0091"+
		"\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u009b\3\2\2\2\u0095\u0097\7\60\2\2"+
		"\u0096\u0098\t\5\2\2\u0097\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u0097"+
		"\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009c\3\2\2\2\u009b\u0095\3\2\2\2\u009b"+
		"\u009c\3\2\2\2\u009c,\3\2\2\2\u009d\u00a1\t\6\2\2\u009e\u00a0\5\67\34"+
		"\2\u009f\u009e\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2"+
		"\3\2\2\2\u00a2\u00a4\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4\u00a5\t\6\2\2\u00a5"+
		".\3\2\2\2\u00a6\u00a7\7k\2\2\u00a7\u00ab\7h\2\2\u00a8\u00a9\7K\2\2\u00a9"+
		"\u00ab\7H\2\2\u00aa\u00a6\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab\60\3\2\2\2"+
		"\u00ac\u00ad\7g\2\2\u00ad\u00ae\7n\2\2\u00ae\u00af\7u\2\2\u00af\u00b5"+
		"\7g\2\2\u00b0\u00b1\7G\2\2\u00b1\u00b2\7N\2\2\u00b2\u00b3\7U\2\2\u00b3"+
		"\u00b5\7G\2\2\u00b4\u00ac\3\2\2\2\u00b4\u00b0\3\2\2\2\u00b5\62\3\2\2\2"+
		"\u00b6\u00b7\7y\2\2\u00b7\u00b8\7j\2\2\u00b8\u00b9\7k\2\2\u00b9\u00ba"+
		"\7n\2\2\u00ba\u00c1\7g\2\2\u00bb\u00bc\7Y\2\2\u00bc\u00bd\7J\2\2\u00bd"+
		"\u00be\7K\2\2\u00be\u00bf\7N\2\2\u00bf\u00c1\7G\2\2\u00c0\u00b6\3\2\2"+
		"\2\u00c0\u00bb\3\2\2\2\u00c1\64\3\2\2\2\u00c2\u00c6\t\7\2\2\u00c3\u00c5"+
		"\t\b\2\2\u00c4\u00c3\3\2\2\2\u00c5\u00c8\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6"+
		"\u00c7\3\2\2\2\u00c7\66\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c9\u00cb\t\b\2"+
		"\2\u00ca\u00c9\3\2\2\2\u00cb8\3\2\2\2\16\2\u008a\u0093\u0099\u009b\u00a1"+
		"\u00aa\u00b4\u00c0\u00c4\u00c6\u00ca\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}