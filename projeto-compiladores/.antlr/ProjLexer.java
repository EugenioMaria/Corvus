// Generated from c:\Users\Eugene\Desktop\u005Cufabc\compiladores\projeto-compiladores-ufabc\projeto-compiladores\Proj.g4 by ANTLR 4.8
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
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, OpenParentheses=6, CloseParentheses=7, 
		OpenBraces=8, CloseBraces=9, Semicolon=10, WriteSpace=11, Operation=12, 
		Attribute=13, Identifier=14, Integer=15, Float=16, Char=17, If=18, Else=19;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "OpenParentheses", "CloseParentheses", 
			"OpenBraces", "CloseBraces", "Semicolon", "WriteSpace", "Operation", 
			"Attribute", "Identifier", "Integer", "Float", "Char", "If", "Else"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'program'", "'end'", "'read'", "'write'", "'attribute'", "'('", 
			"')'", "'{'", "'}'", "';'", null, null, "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "OpenParentheses", "CloseParentheses", 
			"OpenBraces", "CloseBraces", "Semicolon", "WriteSpace", "Operation", 
			"Attribute", "Identifier", "Integer", "Float", "Char", "If", "Else"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\25\u0086\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3"+
		"\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\7\17_\n\17\f\17\16\17b\13\17\3\20\3"+
		"\20\3\21\6\21g\n\21\r\21\16\21h\3\21\3\21\6\21m\n\21\r\21\16\21n\3\22"+
		"\3\22\5\22s\n\22\3\22\3\22\3\23\3\23\3\23\3\23\5\23{\n\23\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\5\24\u0085\n\24\2\2\25\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25\3\2\t\5\2\13\f\17\17\"\"\6\2\'\',-//\61\61\3\2c|\7\2\"\"\62\62;;C"+
		"\\c|\3\2\62;\4\2$$))\4\2C\\c|\2\u008a\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3"+
		"\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\3)\3"+
		"\2\2\2\5\61\3\2\2\2\7\65\3\2\2\2\t:\3\2\2\2\13@\3\2\2\2\rJ\3\2\2\2\17"+
		"L\3\2\2\2\21N\3\2\2\2\23P\3\2\2\2\25R\3\2\2\2\27T\3\2\2\2\31X\3\2\2\2"+
		"\33Z\3\2\2\2\35\\\3\2\2\2\37c\3\2\2\2!f\3\2\2\2#p\3\2\2\2%z\3\2\2\2\'"+
		"\u0084\3\2\2\2)*\7r\2\2*+\7t\2\2+,\7q\2\2,-\7i\2\2-.\7t\2\2./\7c\2\2/"+
		"\60\7o\2\2\60\4\3\2\2\2\61\62\7g\2\2\62\63\7p\2\2\63\64\7f\2\2\64\6\3"+
		"\2\2\2\65\66\7t\2\2\66\67\7g\2\2\678\7c\2\289\7f\2\29\b\3\2\2\2:;\7y\2"+
		"\2;<\7t\2\2<=\7k\2\2=>\7v\2\2>?\7g\2\2?\n\3\2\2\2@A\7c\2\2AB\7v\2\2BC"+
		"\7v\2\2CD\7t\2\2DE\7k\2\2EF\7d\2\2FG\7w\2\2GH\7v\2\2HI\7g\2\2I\f\3\2\2"+
		"\2JK\7*\2\2K\16\3\2\2\2LM\7+\2\2M\20\3\2\2\2NO\7}\2\2O\22\3\2\2\2PQ\7"+
		"\177\2\2Q\24\3\2\2\2RS\7=\2\2S\26\3\2\2\2TU\t\2\2\2UV\3\2\2\2VW\b\f\2"+
		"\2W\30\3\2\2\2XY\t\3\2\2Y\32\3\2\2\2Z[\7?\2\2[\34\3\2\2\2\\`\t\4\2\2]"+
		"_\t\5\2\2^]\3\2\2\2_b\3\2\2\2`^\3\2\2\2`a\3\2\2\2a\36\3\2\2\2b`\3\2\2"+
		"\2cd\t\6\2\2d \3\2\2\2eg\t\6\2\2fe\3\2\2\2gh\3\2\2\2hf\3\2\2\2hi\3\2\2"+
		"\2ij\3\2\2\2jl\7\60\2\2km\t\6\2\2lk\3\2\2\2mn\3\2\2\2nl\3\2\2\2no\3\2"+
		"\2\2o\"\3\2\2\2pr\t\7\2\2qs\t\b\2\2rq\3\2\2\2st\3\2\2\2tu\t\7\2\2u$\3"+
		"\2\2\2vw\7k\2\2w{\7h\2\2xy\7K\2\2y{\7H\2\2zv\3\2\2\2zx\3\2\2\2{&\3\2\2"+
		"\2|}\7g\2\2}~\7n\2\2~\177\7u\2\2\177\u0085\7g\2\2\u0080\u0081\7G\2\2\u0081"+
		"\u0082\7N\2\2\u0082\u0083\7U\2\2\u0083\u0085\7G\2\2\u0084|\3\2\2\2\u0084"+
		"\u0080\3\2\2\2\u0085(\3\2\2\2\n\2^`hnrz\u0084\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}