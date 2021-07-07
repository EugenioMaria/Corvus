// Generated from C:/Users/Gabriel Agostini/IdeaProjects/projeto-compiladores-ufabc/projeto-compiladores\Proj.g4 by ANTLR 4.9.1
package corvusParser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ProjParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, OpenParentheses=7, CloseParentheses=8, 
		OpenBraces=9, CloseBraces=10, Semicolon=11, WhiteSpace=12, Operation=13, 
		LogicalOperator=14, Attribute=15, Identifier=16, Integer=17, Float=18, 
		Char=19, IfSintax=20, ElseSintax=21;
	public static final int
		RULE_prog = 0, RULE_codeBlock = 1, RULE_command = 2, RULE_read = 3, RULE_write = 4, 
		RULE_attribute = 5, RULE_expression = 6, RULE_boolExpression = 7, RULE_termo = 8, 
		RULE_string = 9, RULE_ifCMD = 10, RULE_ifElseCMD = 11, RULE_elseIfCMD = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "codeBlock", "command", "read", "write", "attribute", "expression", 
			"boolExpression", "termo", "string", "ifCMD", "ifElseCMD", "elseIfCMD"
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

	@Override
	public String getGrammarFileName() { return "Proj.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ProjParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public TerminalNode OpenBraces() { return getToken(ProjParser.OpenBraces, 0); }
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public TerminalNode CloseBraces() { return getToken(ProjParser.CloseBraces, 0); }
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjListener ) ((ProjListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjListener ) ((ProjListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjVisitor ) return ((ProjVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			match(T__0);
			setState(27);
			match(OpenBraces);
			setState(28);
			codeBlock();
			setState(29);
			match(CloseBraces);
			setState(30);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CodeBlockContext extends ParserRuleContext {
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public CodeBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codeBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjListener ) ((ProjListener)listener).enterCodeBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjListener ) ((ProjListener)listener).exitCodeBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjVisitor ) return ((ProjVisitor<? extends T>)visitor).visitCodeBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodeBlockContext codeBlock() throws RecognitionException {
		CodeBlockContext _localctx = new CodeBlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_codeBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(32);
				command();
				}
				}
				setState(35); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << Identifier) | (1L << IfSintax))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommandContext extends ParserRuleContext {
		public ReadContext read() {
			return getRuleContext(ReadContext.class,0);
		}
		public WriteContext write() {
			return getRuleContext(WriteContext.class,0);
		}
		public AttributeContext attribute() {
			return getRuleContext(AttributeContext.class,0);
		}
		public IfCMDContext ifCMD() {
			return getRuleContext(IfCMDContext.class,0);
		}
		public IfElseCMDContext ifElseCMD() {
			return getRuleContext(IfElseCMDContext.class,0);
		}
		public ElseIfCMDContext elseIfCMD() {
			return getRuleContext(ElseIfCMDContext.class,0);
		}
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjListener ) ((ProjListener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjListener ) ((ProjListener)listener).exitCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjVisitor ) return ((ProjVisitor<? extends T>)visitor).visitCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_command);
		try {
			setState(43);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(37);
				read();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(38);
				write();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(39);
				attribute();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(40);
				ifCMD();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(41);
				ifElseCMD();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(42);
				elseIfCMD();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReadContext extends ParserRuleContext {
		public TerminalNode OpenParentheses() { return getToken(ProjParser.OpenParentheses, 0); }
		public TerminalNode Identifier() { return getToken(ProjParser.Identifier, 0); }
		public TerminalNode CloseParentheses() { return getToken(ProjParser.CloseParentheses, 0); }
		public TerminalNode Semicolon() { return getToken(ProjParser.Semicolon, 0); }
		public ReadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjListener ) ((ProjListener)listener).enterRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjListener ) ((ProjListener)listener).exitRead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjVisitor ) return ((ProjVisitor<? extends T>)visitor).visitRead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadContext read() throws RecognitionException {
		ReadContext _localctx = new ReadContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_read);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(T__2);
			setState(46);
			match(OpenParentheses);
			setState(47);
			match(Identifier);
			setState(48);
			match(CloseParentheses);
			setState(49);
			match(Semicolon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WriteContext extends ParserRuleContext {
		public TerminalNode OpenParentheses() { return getToken(ProjParser.OpenParentheses, 0); }
		public TermoContext termo() {
			return getRuleContext(TermoContext.class,0);
		}
		public TerminalNode CloseParentheses() { return getToken(ProjParser.CloseParentheses, 0); }
		public TerminalNode Semicolon() { return getToken(ProjParser.Semicolon, 0); }
		public WriteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_write; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjListener ) ((ProjListener)listener).enterWrite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjListener ) ((ProjListener)listener).exitWrite(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjVisitor ) return ((ProjVisitor<? extends T>)visitor).visitWrite(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WriteContext write() throws RecognitionException {
		WriteContext _localctx = new WriteContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_write);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(T__3);
			setState(52);
			match(OpenParentheses);
			setState(53);
			termo();
			setState(54);
			match(CloseParentheses);
			setState(55);
			match(Semicolon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributeContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(ProjParser.Identifier, 0); }
		public TerminalNode Attribute() { return getToken(ProjParser.Attribute, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Semicolon() { return getToken(ProjParser.Semicolon, 0); }
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjListener ) ((ProjListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjListener ) ((ProjListener)listener).exitAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjVisitor ) return ((ProjVisitor<? extends T>)visitor).visitAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(Identifier);
			setState(58);
			match(Attribute);
			setState(59);
			expression();
			setState(60);
			match(Semicolon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public List<TermoContext> termo() {
			return getRuleContexts(TermoContext.class);
		}
		public TermoContext termo(int i) {
			return getRuleContext(TermoContext.class,i);
		}
		public List<TerminalNode> Operation() { return getTokens(ProjParser.Operation); }
		public TerminalNode Operation(int i) {
			return getToken(ProjParser.Operation, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjListener ) ((ProjListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjListener ) ((ProjListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjVisitor ) return ((ProjVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			termo();
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Operation) {
				{
				{
				setState(63);
				match(Operation);
				setState(64);
				termo();
				}
				}
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BoolExpressionContext extends ParserRuleContext {
		public List<TermoContext> termo() {
			return getRuleContexts(TermoContext.class);
		}
		public TermoContext termo(int i) {
			return getRuleContext(TermoContext.class,i);
		}
		public List<TerminalNode> LogicalOperator() { return getTokens(ProjParser.LogicalOperator); }
		public TerminalNode LogicalOperator(int i) {
			return getToken(ProjParser.LogicalOperator, i);
		}
		public BoolExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjListener ) ((ProjListener)listener).enterBoolExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjListener ) ((ProjListener)listener).exitBoolExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjVisitor ) return ((ProjVisitor<? extends T>)visitor).visitBoolExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolExpressionContext boolExpression() throws RecognitionException {
		BoolExpressionContext _localctx = new BoolExpressionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_boolExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			termo();
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LogicalOperator) {
				{
				{
				setState(71);
				match(LogicalOperator);
				setState(72);
				termo();
				}
				}
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermoContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(ProjParser.Identifier, 0); }
		public TerminalNode Integer() { return getToken(ProjParser.Integer, 0); }
		public TerminalNode Float() { return getToken(ProjParser.Float, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TermoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjListener ) ((ProjListener)listener).enterTermo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjListener ) ((ProjListener)listener).exitTermo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjVisitor ) return ((ProjVisitor<? extends T>)visitor).visitTermo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermoContext termo() throws RecognitionException {
		TermoContext _localctx = new TermoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_termo);
		try {
			setState(82);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				match(Identifier);
				}
				break;
			case Integer:
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				match(Integer);
				}
				break;
			case Float:
				enterOuterAlt(_localctx, 3);
				{
				setState(80);
				match(Float);
				}
				break;
			case T__4:
			case T__5:
				enterOuterAlt(_localctx, 4);
				{
				setState(81);
				string();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringContext extends ParserRuleContext {
		public List<TerminalNode> Char() { return getTokens(ProjParser.Char); }
		public TerminalNode Char(int i) {
			return getToken(ProjParser.Char, i);
		}
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjListener ) ((ProjListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjListener ) ((ProjListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjVisitor ) return ((ProjVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_string);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			_la = _input.LA(1);
			if ( !(_la==T__4 || _la==T__5) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(86); 
			_errHandler.sync(this);
			_alt = 1+1;
			do {
				switch (_alt) {
				case 1+1:
					{
					{
					setState(85);
					match(Char);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(88); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			} while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(90);
			_la = _input.LA(1);
			if ( !(_la==T__4 || _la==T__5) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfCMDContext extends ParserRuleContext {
		public TerminalNode IfSintax() { return getToken(ProjParser.IfSintax, 0); }
		public TerminalNode OpenParentheses() { return getToken(ProjParser.OpenParentheses, 0); }
		public BoolExpressionContext boolExpression() {
			return getRuleContext(BoolExpressionContext.class,0);
		}
		public TerminalNode CloseParentheses() { return getToken(ProjParser.CloseParentheses, 0); }
		public TerminalNode OpenBraces() { return getToken(ProjParser.OpenBraces, 0); }
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public TerminalNode CloseBraces() { return getToken(ProjParser.CloseBraces, 0); }
		public IfCMDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifCMD; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjListener ) ((ProjListener)listener).enterIfCMD(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjListener ) ((ProjListener)listener).exitIfCMD(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjVisitor ) return ((ProjVisitor<? extends T>)visitor).visitIfCMD(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfCMDContext ifCMD() throws RecognitionException {
		IfCMDContext _localctx = new IfCMDContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_ifCMD);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(IfSintax);
			setState(93);
			match(OpenParentheses);
			setState(94);
			boolExpression();
			setState(95);
			match(CloseParentheses);
			setState(96);
			match(OpenBraces);
			setState(97);
			codeBlock();
			setState(98);
			match(CloseBraces);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfElseCMDContext extends ParserRuleContext {
		public IfCMDContext ifCMD() {
			return getRuleContext(IfCMDContext.class,0);
		}
		public TerminalNode ElseSintax() { return getToken(ProjParser.ElseSintax, 0); }
		public TerminalNode OpenBraces() { return getToken(ProjParser.OpenBraces, 0); }
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public TerminalNode CloseBraces() { return getToken(ProjParser.CloseBraces, 0); }
		public IfElseCMDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifElseCMD; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjListener ) ((ProjListener)listener).enterIfElseCMD(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjListener ) ((ProjListener)listener).exitIfElseCMD(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjVisitor ) return ((ProjVisitor<? extends T>)visitor).visitIfElseCMD(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfElseCMDContext ifElseCMD() throws RecognitionException {
		IfElseCMDContext _localctx = new IfElseCMDContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_ifElseCMD);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			ifCMD();
			setState(101);
			match(ElseSintax);
			setState(102);
			match(OpenBraces);
			setState(103);
			codeBlock();
			setState(104);
			match(CloseBraces);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseIfCMDContext extends ParserRuleContext {
		public List<IfCMDContext> ifCMD() {
			return getRuleContexts(IfCMDContext.class);
		}
		public IfCMDContext ifCMD(int i) {
			return getRuleContext(IfCMDContext.class,i);
		}
		public List<TerminalNode> ElseSintax() { return getTokens(ProjParser.ElseSintax); }
		public TerminalNode ElseSintax(int i) {
			return getToken(ProjParser.ElseSintax, i);
		}
		public ElseIfCMDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseIfCMD; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjListener ) ((ProjListener)listener).enterElseIfCMD(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjListener ) ((ProjListener)listener).exitElseIfCMD(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjVisitor ) return ((ProjVisitor<? extends T>)visitor).visitElseIfCMD(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseIfCMDContext elseIfCMD() throws RecognitionException {
		ElseIfCMDContext _localctx = new ElseIfCMDContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_elseIfCMD);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			ifCMD();
			setState(109); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(107);
				match(ElseSintax);
				setState(108);
				ifCMD();
				}
				}
				setState(111); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ElseSintax );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\27t\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\2\3\2\3\2\3\3\6\3$\n\3\r\3\16\3"+
		"%\3\4\3\4\3\4\3\4\3\4\3\4\5\4.\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\7\bD\n\b\f\b\16\bG\13\b\3"+
		"\t\3\t\3\t\7\tL\n\t\f\t\16\tO\13\t\3\n\3\n\3\n\3\n\5\nU\n\n\3\13\3\13"+
		"\6\13Y\n\13\r\13\16\13Z\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\6\16p\n\16\r\16\16\16q\3\16\3Z\2\17"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\2\3\3\2\7\b\2s\2\34\3\2\2\2\4#\3\2\2"+
		"\2\6-\3\2\2\2\b/\3\2\2\2\n\65\3\2\2\2\f;\3\2\2\2\16@\3\2\2\2\20H\3\2\2"+
		"\2\22T\3\2\2\2\24V\3\2\2\2\26^\3\2\2\2\30f\3\2\2\2\32l\3\2\2\2\34\35\7"+
		"\3\2\2\35\36\7\13\2\2\36\37\5\4\3\2\37 \7\f\2\2 !\7\4\2\2!\3\3\2\2\2\""+
		"$\5\6\4\2#\"\3\2\2\2$%\3\2\2\2%#\3\2\2\2%&\3\2\2\2&\5\3\2\2\2\'.\5\b\5"+
		"\2(.\5\n\6\2).\5\f\7\2*.\5\26\f\2+.\5\30\r\2,.\5\32\16\2-\'\3\2\2\2-("+
		"\3\2\2\2-)\3\2\2\2-*\3\2\2\2-+\3\2\2\2-,\3\2\2\2.\7\3\2\2\2/\60\7\5\2"+
		"\2\60\61\7\t\2\2\61\62\7\22\2\2\62\63\7\n\2\2\63\64\7\r\2\2\64\t\3\2\2"+
		"\2\65\66\7\6\2\2\66\67\7\t\2\2\678\5\22\n\289\7\n\2\29:\7\r\2\2:\13\3"+
		"\2\2\2;<\7\22\2\2<=\7\21\2\2=>\5\16\b\2>?\7\r\2\2?\r\3\2\2\2@E\5\22\n"+
		"\2AB\7\17\2\2BD\5\22\n\2CA\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2F\17\3"+
		"\2\2\2GE\3\2\2\2HM\5\22\n\2IJ\7\20\2\2JL\5\22\n\2KI\3\2\2\2LO\3\2\2\2"+
		"MK\3\2\2\2MN\3\2\2\2N\21\3\2\2\2OM\3\2\2\2PU\7\22\2\2QU\7\23\2\2RU\7\24"+
		"\2\2SU\5\24\13\2TP\3\2\2\2TQ\3\2\2\2TR\3\2\2\2TS\3\2\2\2U\23\3\2\2\2V"+
		"X\t\2\2\2WY\7\25\2\2XW\3\2\2\2YZ\3\2\2\2Z[\3\2\2\2ZX\3\2\2\2[\\\3\2\2"+
		"\2\\]\t\2\2\2]\25\3\2\2\2^_\7\26\2\2_`\7\t\2\2`a\5\20\t\2ab\7\n\2\2bc"+
		"\7\13\2\2cd\5\4\3\2de\7\f\2\2e\27\3\2\2\2fg\5\26\f\2gh\7\27\2\2hi\7\13"+
		"\2\2ij\5\4\3\2jk\7\f\2\2k\31\3\2\2\2lo\5\26\f\2mn\7\27\2\2np\5\26\f\2"+
		"om\3\2\2\2pq\3\2\2\2qo\3\2\2\2qr\3\2\2\2r\33\3\2\2\2\t%-EMTZq";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}