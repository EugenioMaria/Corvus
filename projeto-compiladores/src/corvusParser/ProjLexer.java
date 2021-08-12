// Generated from C:/Users/Gabriel Agostini/IdeaProjects/Corvus/projeto-compiladores\Proj.g4 by ANTLR 4.9.1
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
    import corvusAST.CommandFor;
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
		T__9=10, T__10=11, T__11=12, WhiteSpace=13, OpenParentheses=14, CloseParentheses=15, 
		OpenBraces=16, CloseBraces=17, Semicolon=18, Colon=19, Operation=20, LogicalOperator=21, 
		Attribute=22, Integer=23, Float=24, String=25, IfSintax=26, ElseSintax=27, 
		WhileSintax=28, Identifier=29, Char=30;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "WhiteSpace", "OpenParentheses", "CloseParentheses", 
			"OpenBraces", "CloseBraces", "Semicolon", "Colon", "Operation", "LogicalOperator", 
			"Attribute", "Integer", "Float", "String", "IfSintax", "ElseSintax", 
			"WhileSintax", "Identifier", "Char"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'program'", "'end'", "'int'", "'float'", "'string'", "'list'", 
			"'boolean'", "'read'", "'write'", "'false'", "'true'", "'for'", null, 
			"'('", "')'", "'{'", "'}'", "';'", "','", null, null, "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "WhiteSpace", "OpenParentheses", "CloseParentheses", "OpenBraces", 
			"CloseBraces", "Semicolon", "Colon", "Operation", "LogicalOperator", 
			"Attribute", "Integer", "Float", "String", "IfSintax", "ElseSintax", 
			"WhileSintax", "Identifier", "Char"
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
	    private Stack<String> iteratorStack = new Stack<String>();
	    private Stack<String>  incrementStack = new Stack<String>();
	    private Stack<String>  startValueStack = new Stack<String>();
	    private CorvusVariable symbol;
	    private CorvusProgram program = new CorvusProgram();
	    private ArrayList<CorvusAbstractCommand> curThread;
	    private ArrayList<CorvusAbstractCommand> cmdTrue;
	    private ArrayList<CorvusAbstractCommand> cmdFalse;
	    private ArrayList<CorvusAbstractCommand> cmdWhile;
	    private ArrayList<CorvusAbstractCommand> cmdFor;

	    private String _readId;
	    private String _writeId;
	    private String _attrId;
	    private String _attrContent;
	    private String _exprDecision;
	    private int _varType;
	    private int _attrType;
	    private String _varName;
	    private String _varValue;
	    private Boolean isAttr = false;
	    private String [] varTypeStrings = CorvusVariable.typeList;
	    private int line;

	    private void verifyId(String id){
	        if(!symbolTable.exists(id)){
	            throw new CorvusSemanticException("Variable '" + id + "' has not been declared. Line " + line);
	        }
	    }

	    public void printCMD(){
	        for(CorvusAbstractCommand cur : program.getCmd()){
	            System.out.println(cur.toString());
	        }
	    }

	    public void verifyType(int attrType, int expressionType){
	        if(attrType!=expressionType && isAttr){
	            throw new CorvusSemanticException("Illegal attribution from " + varTypeStrings[attrType] + " to " + varTypeStrings[expressionType] + " at line " + line);
	        }
	    }

	    public void validLoopType(int idType){
	        if(idType != 0){
	            throw new CorvusSemanticException("Illegal iterator, an iterator must be an int. At line " + line);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2 \u00e8\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24"+
		"\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\5\26\u00a4\n\26\3\27\3\27\3\30\6\30\u00a9\n\30\r\30\16\30\u00aa"+
		"\3\31\6\31\u00ae\n\31\r\31\16\31\u00af\3\31\3\31\6\31\u00b4\n\31\r\31"+
		"\16\31\u00b5\5\31\u00b8\n\31\3\32\3\32\3\32\7\32\u00bd\n\32\f\32\16\32"+
		"\u00c0\13\32\3\32\3\32\3\33\3\33\3\33\3\33\5\33\u00c8\n\33\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\5\34\u00d2\n\34\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\5\35\u00de\n\35\3\36\3\36\7\36\u00e2\n\36\f"+
		"\36\16\36\u00e5\13\36\3\37\3\37\2\2 \3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36;\37= \3\2\t\5\2\13\f\17\17\"\"\6\2\'"+
		"\',-//\61\61\4\2>>@@\3\2\62;\3\2c|\5\2\62;C\\c|\5\2*+}}\177\177\2\u00f8"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\3?\3\2\2\2\5G\3\2\2\2\7K\3\2\2\2\tO\3\2\2\2\13U\3\2"+
		"\2\2\r\\\3\2\2\2\17a\3\2\2\2\21i\3\2\2\2\23n\3\2\2\2\25t\3\2\2\2\27z\3"+
		"\2\2\2\31\177\3\2\2\2\33\u0083\3\2\2\2\35\u0087\3\2\2\2\37\u0089\3\2\2"+
		"\2!\u008b\3\2\2\2#\u008d\3\2\2\2%\u008f\3\2\2\2\'\u0091\3\2\2\2)\u0093"+
		"\3\2\2\2+\u00a3\3\2\2\2-\u00a5\3\2\2\2/\u00a8\3\2\2\2\61\u00ad\3\2\2\2"+
		"\63\u00b9\3\2\2\2\65\u00c7\3\2\2\2\67\u00d1\3\2\2\29\u00dd\3\2\2\2;\u00df"+
		"\3\2\2\2=\u00e6\3\2\2\2?@\7r\2\2@A\7t\2\2AB\7q\2\2BC\7i\2\2CD\7t\2\2D"+
		"E\7c\2\2EF\7o\2\2F\4\3\2\2\2GH\7g\2\2HI\7p\2\2IJ\7f\2\2J\6\3\2\2\2KL\7"+
		"k\2\2LM\7p\2\2MN\7v\2\2N\b\3\2\2\2OP\7h\2\2PQ\7n\2\2QR\7q\2\2RS\7c\2\2"+
		"ST\7v\2\2T\n\3\2\2\2UV\7u\2\2VW\7v\2\2WX\7t\2\2XY\7k\2\2YZ\7p\2\2Z[\7"+
		"i\2\2[\f\3\2\2\2\\]\7n\2\2]^\7k\2\2^_\7u\2\2_`\7v\2\2`\16\3\2\2\2ab\7"+
		"d\2\2bc\7q\2\2cd\7q\2\2de\7n\2\2ef\7g\2\2fg\7c\2\2gh\7p\2\2h\20\3\2\2"+
		"\2ij\7t\2\2jk\7g\2\2kl\7c\2\2lm\7f\2\2m\22\3\2\2\2no\7y\2\2op\7t\2\2p"+
		"q\7k\2\2qr\7v\2\2rs\7g\2\2s\24\3\2\2\2tu\7h\2\2uv\7c\2\2vw\7n\2\2wx\7"+
		"u\2\2xy\7g\2\2y\26\3\2\2\2z{\7v\2\2{|\7t\2\2|}\7w\2\2}~\7g\2\2~\30\3\2"+
		"\2\2\177\u0080\7h\2\2\u0080\u0081\7q\2\2\u0081\u0082\7t\2\2\u0082\32\3"+
		"\2\2\2\u0083\u0084\t\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086\b\16\2\2\u0086"+
		"\34\3\2\2\2\u0087\u0088\7*\2\2\u0088\36\3\2\2\2\u0089\u008a\7+\2\2\u008a"+
		" \3\2\2\2\u008b\u008c\7}\2\2\u008c\"\3\2\2\2\u008d\u008e\7\177\2\2\u008e"+
		"$\3\2\2\2\u008f\u0090\7=\2\2\u0090&\3\2\2\2\u0091\u0092\7.\2\2\u0092("+
		"\3\2\2\2\u0093\u0094\t\3\2\2\u0094*\3\2\2\2\u0095\u0096\7~\2\2\u0096\u00a4"+
		"\7~\2\2\u0097\u0098\7(\2\2\u0098\u00a4\7(\2\2\u0099\u009a\7#\2\2\u009a"+
		"\u00a4\7?\2\2\u009b\u00a4\7#\2\2\u009c\u009d\7?\2\2\u009d\u00a4\7?\2\2"+
		"\u009e\u00a4\t\4\2\2\u009f\u00a0\7>\2\2\u00a0\u00a4\7?\2\2\u00a1\u00a2"+
		"\7@\2\2\u00a2\u00a4\7?\2\2\u00a3\u0095\3\2\2\2\u00a3\u0097\3\2\2\2\u00a3"+
		"\u0099\3\2\2\2\u00a3\u009b\3\2\2\2\u00a3\u009c\3\2\2\2\u00a3\u009e\3\2"+
		"\2\2\u00a3\u009f\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4,\3\2\2\2\u00a5\u00a6"+
		"\7?\2\2\u00a6.\3\2\2\2\u00a7\u00a9\t\5\2\2\u00a8\u00a7\3\2\2\2\u00a9\u00aa"+
		"\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\60\3\2\2\2\u00ac"+
		"\u00ae\t\5\2\2\u00ad\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00ad\3\2"+
		"\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b7\3\2\2\2\u00b1\u00b3\7\60\2\2\u00b2"+
		"\u00b4\t\5\2\2\u00b3\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b3\3\2"+
		"\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b8\3\2\2\2\u00b7\u00b1\3\2\2\2\u00b7"+
		"\u00b8\3\2\2\2\u00b8\62\3\2\2\2\u00b9\u00be\7$\2\2\u00ba\u00bd\5=\37\2"+
		"\u00bb\u00bd\5\33\16\2\u00bc\u00ba\3\2\2\2\u00bc\u00bb\3\2\2\2\u00bd\u00c0"+
		"\3\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c1\3\2\2\2\u00c0"+
		"\u00be\3\2\2\2\u00c1\u00c2\7$\2\2\u00c2\64\3\2\2\2\u00c3\u00c4\7k\2\2"+
		"\u00c4\u00c8\7h\2\2\u00c5\u00c6\7K\2\2\u00c6\u00c8\7H\2\2\u00c7\u00c3"+
		"\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8\66\3\2\2\2\u00c9\u00ca\7g\2\2\u00ca"+
		"\u00cb\7n\2\2\u00cb\u00cc\7u\2\2\u00cc\u00d2\7g\2\2\u00cd\u00ce\7G\2\2"+
		"\u00ce\u00cf\7N\2\2\u00cf\u00d0\7U\2\2\u00d0\u00d2\7G\2\2\u00d1\u00c9"+
		"\3\2\2\2\u00d1\u00cd\3\2\2\2\u00d28\3\2\2\2\u00d3\u00d4\7y\2\2\u00d4\u00d5"+
		"\7j\2\2\u00d5\u00d6\7k\2\2\u00d6\u00d7\7n\2\2\u00d7\u00de\7g\2\2\u00d8"+
		"\u00d9\7Y\2\2\u00d9\u00da\7J\2\2\u00da\u00db\7K\2\2\u00db\u00dc\7N\2\2"+
		"\u00dc\u00de\7G\2\2\u00dd\u00d3\3\2\2\2\u00dd\u00d8\3\2\2\2\u00de:\3\2"+
		"\2\2\u00df\u00e3\t\6\2\2\u00e0\u00e2\t\7\2\2\u00e1\u00e0\3\2\2\2\u00e2"+
		"\u00e5\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4<\3\2\2\2"+
		"\u00e5\u00e3\3\2\2\2\u00e6\u00e7\n\b\2\2\u00e7>\3\2\2\2\17\2\u00a3\u00aa"+
		"\u00af\u00b5\u00b7\u00bc\u00be\u00c7\u00d1\u00dd\u00e1\u00e3\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}