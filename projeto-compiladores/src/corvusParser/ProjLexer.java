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
		T__9=10, T__10=11, WhiteSpace=12, OpenParentheses=13, CloseParentheses=14, 
		OpenBraces=15, CloseBraces=16, Semicolon=17, Colon=18, Operation=19, LogicalOperator=20, 
		Attribute=21, Integer=22, Float=23, String=24, IfSintax=25, ElseSintax=26, 
		WhileSintax=27, Identifier=28, Char=29;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "WhiteSpace", "OpenParentheses", "CloseParentheses", 
			"OpenBraces", "CloseBraces", "Semicolon", "Colon", "Operation", "LogicalOperator", 
			"Attribute", "Integer", "Float", "String", "IfSintax", "ElseSintax", 
			"WhileSintax", "Identifier", "Char"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'program'", "'end'", "'int'", "'float'", "'string'", "'list'", 
			"'boolean'", "'read'", "'write'", "'true'", "'false'", null, "'('", "')'", 
			"'{'", "'}'", "';'", "','", null, null, "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"WhiteSpace", "OpenParentheses", "CloseParentheses", "OpenBraces", "CloseBraces", 
			"Semicolon", "Colon", "Operation", "LogicalOperator", "Attribute", "Integer", 
			"Float", "String", "IfSintax", "ElseSintax", "WhileSintax", "Identifier", 
			"Char"
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
	    private CorvusVariable symbol;
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
	    private int _attrType;
	    private String _varName;
	    private String _varValue;
	    private Boolean isAttr;
	    private String [] varTypeStrings = CorvusVariable.typeList;
	    private int line;

	    private void verifyId(String id){
	        if(!symbolTable.exists(id)){
	            throw new CorvusSemanticException("Variable '" + id + "' has not been declared at Line " + line);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\37\u00e2\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3"+
		"\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3"+
		"\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u009e\n\25"+
		"\3\26\3\26\3\27\6\27\u00a3\n\27\r\27\16\27\u00a4\3\30\6\30\u00a8\n\30"+
		"\r\30\16\30\u00a9\3\30\3\30\6\30\u00ae\n\30\r\30\16\30\u00af\5\30\u00b2"+
		"\n\30\3\31\3\31\7\31\u00b6\n\31\f\31\16\31\u00b9\13\31\3\31\3\31\3\32"+
		"\3\32\3\32\3\32\5\32\u00c1\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\5\33\u00cb\n\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34"+
		"\u00d7\n\34\3\35\3\35\7\35\u00db\n\35\f\35\16\35\u00de\13\35\3\36\5\36"+
		"\u00e1\n\36\2\2\37\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r"+
		"\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37\3\2\b\5\2\13\f\17\17\"\"\6\2\'\',-//\61\61\4\2>>"+
		"@@\3\2\62;\3\2c|\5\2\62;C\\c|\2\u00f1\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3"+
		"\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3"+
		"\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65"+
		"\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\3=\3\2\2\2\5E\3\2\2\2\7I\3"+
		"\2\2\2\tM\3\2\2\2\13S\3\2\2\2\rZ\3\2\2\2\17_\3\2\2\2\21g\3\2\2\2\23l\3"+
		"\2\2\2\25r\3\2\2\2\27w\3\2\2\2\31}\3\2\2\2\33\u0081\3\2\2\2\35\u0083\3"+
		"\2\2\2\37\u0085\3\2\2\2!\u0087\3\2\2\2#\u0089\3\2\2\2%\u008b\3\2\2\2\'"+
		"\u008d\3\2\2\2)\u009d\3\2\2\2+\u009f\3\2\2\2-\u00a2\3\2\2\2/\u00a7\3\2"+
		"\2\2\61\u00b3\3\2\2\2\63\u00c0\3\2\2\2\65\u00ca\3\2\2\2\67\u00d6\3\2\2"+
		"\29\u00d8\3\2\2\2;\u00e0\3\2\2\2=>\7r\2\2>?\7t\2\2?@\7q\2\2@A\7i\2\2A"+
		"B\7t\2\2BC\7c\2\2CD\7o\2\2D\4\3\2\2\2EF\7g\2\2FG\7p\2\2GH\7f\2\2H\6\3"+
		"\2\2\2IJ\7k\2\2JK\7p\2\2KL\7v\2\2L\b\3\2\2\2MN\7h\2\2NO\7n\2\2OP\7q\2"+
		"\2PQ\7c\2\2QR\7v\2\2R\n\3\2\2\2ST\7u\2\2TU\7v\2\2UV\7t\2\2VW\7k\2\2WX"+
		"\7p\2\2XY\7i\2\2Y\f\3\2\2\2Z[\7n\2\2[\\\7k\2\2\\]\7u\2\2]^\7v\2\2^\16"+
		"\3\2\2\2_`\7d\2\2`a\7q\2\2ab\7q\2\2bc\7n\2\2cd\7g\2\2de\7c\2\2ef\7p\2"+
		"\2f\20\3\2\2\2gh\7t\2\2hi\7g\2\2ij\7c\2\2jk\7f\2\2k\22\3\2\2\2lm\7y\2"+
		"\2mn\7t\2\2no\7k\2\2op\7v\2\2pq\7g\2\2q\24\3\2\2\2rs\7v\2\2st\7t\2\2t"+
		"u\7w\2\2uv\7g\2\2v\26\3\2\2\2wx\7h\2\2xy\7c\2\2yz\7n\2\2z{\7u\2\2{|\7"+
		"g\2\2|\30\3\2\2\2}~\t\2\2\2~\177\3\2\2\2\177\u0080\b\r\2\2\u0080\32\3"+
		"\2\2\2\u0081\u0082\7*\2\2\u0082\34\3\2\2\2\u0083\u0084\7+\2\2\u0084\36"+
		"\3\2\2\2\u0085\u0086\7}\2\2\u0086 \3\2\2\2\u0087\u0088\7\177\2\2\u0088"+
		"\"\3\2\2\2\u0089\u008a\7=\2\2\u008a$\3\2\2\2\u008b\u008c\7.\2\2\u008c"+
		"&\3\2\2\2\u008d\u008e\t\3\2\2\u008e(\3\2\2\2\u008f\u0090\7~\2\2\u0090"+
		"\u009e\7~\2\2\u0091\u0092\7(\2\2\u0092\u009e\7(\2\2\u0093\u0094\7#\2\2"+
		"\u0094\u009e\7?\2\2\u0095\u009e\7#\2\2\u0096\u0097\7?\2\2\u0097\u009e"+
		"\7?\2\2\u0098\u009e\t\4\2\2\u0099\u009a\7>\2\2\u009a\u009e\7?\2\2\u009b"+
		"\u009c\7@\2\2\u009c\u009e\7?\2\2\u009d\u008f\3\2\2\2\u009d\u0091\3\2\2"+
		"\2\u009d\u0093\3\2\2\2\u009d\u0095\3\2\2\2\u009d\u0096\3\2\2\2\u009d\u0098"+
		"\3\2\2\2\u009d\u0099\3\2\2\2\u009d\u009b\3\2\2\2\u009e*\3\2\2\2\u009f"+
		"\u00a0\7?\2\2\u00a0,\3\2\2\2\u00a1\u00a3\t\5\2\2\u00a2\u00a1\3\2\2\2\u00a3"+
		"\u00a4\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5.\3\2\2\2"+
		"\u00a6\u00a8\t\5\2\2\u00a7\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00a7"+
		"\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00b1\3\2\2\2\u00ab\u00ad\7\60\2\2"+
		"\u00ac\u00ae\t\5\2\2\u00ad\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00ad"+
		"\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b2\3\2\2\2\u00b1\u00ab\3\2\2\2\u00b1"+
		"\u00b2\3\2\2\2\u00b2\60\3\2\2\2\u00b3\u00b7\7$\2\2\u00b4\u00b6\5;\36\2"+
		"\u00b5\u00b4\3\2\2\2\u00b6\u00b9\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8"+
		"\3\2\2\2\u00b8\u00ba\3\2\2\2\u00b9\u00b7\3\2\2\2\u00ba\u00bb\7$\2\2\u00bb"+
		"\62\3\2\2\2\u00bc\u00bd\7k\2\2\u00bd\u00c1\7h\2\2\u00be\u00bf\7K\2\2\u00bf"+
		"\u00c1\7H\2\2\u00c0\u00bc\3\2\2\2\u00c0\u00be\3\2\2\2\u00c1\64\3\2\2\2"+
		"\u00c2\u00c3\7g\2\2\u00c3\u00c4\7n\2\2\u00c4\u00c5\7u\2\2\u00c5\u00cb"+
		"\7g\2\2\u00c6\u00c7\7G\2\2\u00c7\u00c8\7N\2\2\u00c8\u00c9\7U\2\2\u00c9"+
		"\u00cb\7G\2\2\u00ca\u00c2\3\2\2\2\u00ca\u00c6\3\2\2\2\u00cb\66\3\2\2\2"+
		"\u00cc\u00cd\7y\2\2\u00cd\u00ce\7j\2\2\u00ce\u00cf\7k\2\2\u00cf\u00d0"+
		"\7n\2\2\u00d0\u00d7\7g\2\2\u00d1\u00d2\7Y\2\2\u00d2\u00d3\7J\2\2\u00d3"+
		"\u00d4\7K\2\2\u00d4\u00d5\7N\2\2\u00d5\u00d7\7G\2\2\u00d6\u00cc\3\2\2"+
		"\2\u00d6\u00d1\3\2\2\2\u00d78\3\2\2\2\u00d8\u00dc\t\6\2\2\u00d9\u00db"+
		"\t\7\2\2\u00da\u00d9\3\2\2\2\u00db\u00de\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc"+
		"\u00dd\3\2\2\2\u00dd:\3\2\2\2\u00de\u00dc\3\2\2\2\u00df\u00e1\t\7\2\2"+
		"\u00e0\u00df\3\2\2\2\u00e1<\3\2\2\2\17\2\u009d\u00a4\u00a9\u00af\u00b1"+
		"\u00b7\u00c0\u00ca\u00d6\u00da\u00dc\u00e0\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}