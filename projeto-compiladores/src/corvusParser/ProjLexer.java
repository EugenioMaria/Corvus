// Generated from C:/Users/Gabriel Agostini/IdeaProjects/projeto-compiladores-ufabc/projeto-compiladores\Proj.g4 by ANTLR 4.9.1
package corvusParser;
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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, OpenParentheses=7, CloseParentheses=8, 
		OpenBraces=9, CloseBraces=10, Semicolon=11, WhiteSpace=12, Operation=13, 
		LogicalOperator=14, Attribute=15, Identifier=16, Integer=17, Float=18, 
		Char=19, IfSintax=20, ElseSintax=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "OpenParentheses", "CloseParentheses", 
			"OpenBraces", "CloseBraces", "Semicolon", "WhiteSpace", "Operation", 
			"LogicalOperator", "Attribute", "Identifier", "Integer", "Float", "Char", 
			"IfSintax", "ElseSintax"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'program'", "'end'", "'read'", "'write'", "'''", "'\"'", "'('", 
			"')'", "'{'", "'}'", "';'", null, null, null, "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "OpenParentheses", "CloseParentheses", 
			"OpenBraces", "CloseBraces", "Semicolon", "WhiteSpace", "Operation", 
			"LogicalOperator", "Attribute", "Identifier", "Integer", "Float", "Char", 
			"IfSintax", "ElseSintax"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\27\u008e\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3"+
		"\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17b\n\17\3"+
		"\20\3\20\3\21\3\21\7\21h\n\21\f\21\16\21k\13\21\3\22\3\22\3\23\6\23p\n"+
		"\23\r\23\16\23q\3\23\3\23\6\23v\n\23\r\23\16\23w\5\23z\n\23\3\24\5\24"+
		"}\n\24\3\25\3\25\3\25\3\25\5\25\u0083\n\25\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\5\26\u008d\n\26\3i\2\27\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27\3"+
		"\2\b\5\2\13\f\17\17\"\"\6\2\'\',-//\61\61\3\2c|\7\2\"\"\62\62;;C\\c|\3"+
		"\2\62;\5\2\62;C\\c|\2\u0097\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3"+
		"\2\2\2\3-\3\2\2\2\5\65\3\2\2\2\79\3\2\2\2\t>\3\2\2\2\13D\3\2\2\2\rF\3"+
		"\2\2\2\17H\3\2\2\2\21J\3\2\2\2\23L\3\2\2\2\25N\3\2\2\2\27P\3\2\2\2\31"+
		"R\3\2\2\2\33V\3\2\2\2\35a\3\2\2\2\37c\3\2\2\2!e\3\2\2\2#l\3\2\2\2%o\3"+
		"\2\2\2\'|\3\2\2\2)\u0082\3\2\2\2+\u008c\3\2\2\2-.\7r\2\2./\7t\2\2/\60"+
		"\7q\2\2\60\61\7i\2\2\61\62\7t\2\2\62\63\7c\2\2\63\64\7o\2\2\64\4\3\2\2"+
		"\2\65\66\7g\2\2\66\67\7p\2\2\678\7f\2\28\6\3\2\2\29:\7t\2\2:;\7g\2\2;"+
		"<\7c\2\2<=\7f\2\2=\b\3\2\2\2>?\7y\2\2?@\7t\2\2@A\7k\2\2AB\7v\2\2BC\7g"+
		"\2\2C\n\3\2\2\2DE\7)\2\2E\f\3\2\2\2FG\7$\2\2G\16\3\2\2\2HI\7*\2\2I\20"+
		"\3\2\2\2JK\7+\2\2K\22\3\2\2\2LM\7}\2\2M\24\3\2\2\2NO\7\177\2\2O\26\3\2"+
		"\2\2PQ\7=\2\2Q\30\3\2\2\2RS\t\2\2\2ST\3\2\2\2TU\b\r\2\2U\32\3\2\2\2VW"+
		"\t\3\2\2W\34\3\2\2\2XY\7~\2\2Yb\7~\2\2Z[\7(\2\2[b\7(\2\2\\]\7#\2\2]b\7"+
		"?\2\2^b\7#\2\2_`\7?\2\2`b\7?\2\2aX\3\2\2\2aZ\3\2\2\2a\\\3\2\2\2a^\3\2"+
		"\2\2a_\3\2\2\2b\36\3\2\2\2cd\7?\2\2d \3\2\2\2ei\t\4\2\2fh\t\5\2\2gf\3"+
		"\2\2\2hk\3\2\2\2ij\3\2\2\2ig\3\2\2\2j\"\3\2\2\2ki\3\2\2\2lm\t\6\2\2m$"+
		"\3\2\2\2np\t\6\2\2on\3\2\2\2pq\3\2\2\2qo\3\2\2\2qr\3\2\2\2ry\3\2\2\2s"+
		"u\7\60\2\2tv\t\6\2\2ut\3\2\2\2vw\3\2\2\2wu\3\2\2\2wx\3\2\2\2xz\3\2\2\2"+
		"ys\3\2\2\2yz\3\2\2\2z&\3\2\2\2{}\t\7\2\2|{\3\2\2\2}(\3\2\2\2~\177\7k\2"+
		"\2\177\u0083\7h\2\2\u0080\u0081\7K\2\2\u0081\u0083\7H\2\2\u0082~\3\2\2"+
		"\2\u0082\u0080\3\2\2\2\u0083*\3\2\2\2\u0084\u0085\7g\2\2\u0085\u0086\7"+
		"n\2\2\u0086\u0087\7u\2\2\u0087\u008d\7g\2\2\u0088\u0089\7G\2\2\u0089\u008a"+
		"\7N\2\2\u008a\u008b\7U\2\2\u008b\u008d\7G\2\2\u008c\u0084\3\2\2\2\u008c"+
		"\u0088\3\2\2\2\u008d,\3\2\2\2\f\2agiqwy|\u0082\u008c\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}