// Generated from C:/Users/Eugene/Desktop/ufabc/compiladores/Corvus/projeto-compiladores\Proj.g4 by ANTLR 4.9.1
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
		T__0=1, T__1=2, T__2=3, T__3=4, WhiteSpace=5, OpenParentheses=6, CloseParentheses=7, 
		OpenBraces=8, CloseBraces=9, Semicolon=10, Operation=11, LogicalOperator=12, 
		Attribute=13, Integer=14, Float=15, String=16, IfSintax=17, ElseSintax=18, 
		WhileSintax=19, Identifier=20, Char=21;
	public static final int
		RULE_prog = 0, RULE_codeBlock = 1, RULE_command = 2, RULE_read = 3, RULE_write = 4, 
		RULE_attribute = 5, RULE_expression = 6, RULE_boolExpression = 7, RULE_termo = 8, 
		RULE_ifCMD = 9, RULE_ifElseCMD = 10, RULE_elseIfCMD = 11, RULE_whileCMD = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "codeBlock", "command", "read", "write", "attribute", "expression", 
			"boolExpression", "termo", "ifCMD", "ifElseCMD", "elseIfCMD", "whileCMD"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'program'", "'end'", "'read'", "'write'", null, "'('", "')'", 
			"'{'", "'}'", "';'", null, null, "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "WhiteSpace", "OpenParentheses", "CloseParentheses", 
			"OpenBraces", "CloseBraces", "Semicolon", "Operation", "LogicalOperator", 
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
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << IfSintax) | (1L << WhileSintax) | (1L << Identifier))) != 0)) {
				{
				{
				setState(32);
				command();
				}
				}
				setState(37);
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
		public WhileCMDContext whileCMD() {
			return getRuleContext(WhileCMDContext.class,0);
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
			setState(45);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(38);
				read();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(39);
				write();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(40);
				attribute();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(41);
				ifCMD();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(42);
				ifElseCMD();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(43);
				elseIfCMD();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(44);
				whileCMD();
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
		public TermoContext termo() {
			return getRuleContext(TermoContext.class,0);
		}
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
			setState(47);
			match(T__2);
			setState(48);
			match(OpenParentheses);
			setState(49);
			termo();
			setState(50);
			match(CloseParentheses);
			setState(51);
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
			setState(53);
			match(T__3);
			setState(54);
			match(OpenParentheses);
			setState(55);
			termo();
			setState(56);
			match(CloseParentheses);
			setState(57);
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
			setState(59);
			match(Identifier);
			setState(60);
			match(Attribute);
			setState(61);
			expression();
			setState(62);
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
			setState(64);
			termo();
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Operation) {
				{
				{
				setState(65);
				match(Operation);
				setState(66);
				termo();
				}
				}
				setState(71);
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
			setState(72);
			termo();
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LogicalOperator) {
				{
				{
				setState(73);
				match(LogicalOperator);
				setState(74);
				termo();
				}
				}
				setState(79);
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
		public TerminalNode String() { return getToken(ProjParser.String, 0); }
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Integer) | (1L << Float) | (1L << String) | (1L << Identifier))) != 0)) ) {
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
		enterRule(_localctx, 18, RULE_ifCMD);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(IfSintax);
			setState(83);
			match(OpenParentheses);
			setState(84);
			boolExpression();
			setState(85);
			match(CloseParentheses);
			setState(86);
			match(OpenBraces);
			setState(87);
			codeBlock();
			setState(88);
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
		enterRule(_localctx, 20, RULE_ifElseCMD);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			ifCMD();
			setState(91);
			match(ElseSintax);
			setState(92);
			match(OpenBraces);
			setState(93);
			codeBlock();
			setState(94);
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
		enterRule(_localctx, 22, RULE_elseIfCMD);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			ifCMD();
			setState(99); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(97);
				match(ElseSintax);
				setState(98);
				ifCMD();
				}
				}
				setState(101); 
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

	public static class WhileCMDContext extends ParserRuleContext {
		public TerminalNode WhileSintax() { return getToken(ProjParser.WhileSintax, 0); }
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
		public WhileCMDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileCMD; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjListener ) ((ProjListener)listener).enterWhileCMD(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjListener ) ((ProjListener)listener).exitWhileCMD(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjVisitor ) return ((ProjVisitor<? extends T>)visitor).visitWhileCMD(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileCMDContext whileCMD() throws RecognitionException {
		WhileCMDContext _localctx = new WhileCMDContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_whileCMD);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(WhileSintax);
			setState(104);
			match(OpenParentheses);
			setState(105);
			boolExpression();
			setState(106);
			match(CloseParentheses);
			setState(107);
			match(OpenBraces);
			setState(108);
			codeBlock();
			setState(109);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\27r\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\2\3\2\3\2\3\3\7\3$\n\3\f\3\16\3"+
		"\'\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\60\n\4\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\7\bF\n\b\f\b"+
		"\16\bI\13\b\3\t\3\t\3\t\7\tN\n\t\f\t\16\tQ\13\t\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\6\rf\n\r"+
		"\r\r\16\rg\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\2\2\17\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\2\3\4\2\20\22\26\26\2n\2\34\3\2\2\2\4%\3\2\2"+
		"\2\6/\3\2\2\2\b\61\3\2\2\2\n\67\3\2\2\2\f=\3\2\2\2\16B\3\2\2\2\20J\3\2"+
		"\2\2\22R\3\2\2\2\24T\3\2\2\2\26\\\3\2\2\2\30b\3\2\2\2\32i\3\2\2\2\34\35"+
		"\7\3\2\2\35\36\7\n\2\2\36\37\5\4\3\2\37 \7\13\2\2 !\7\4\2\2!\3\3\2\2\2"+
		"\"$\5\6\4\2#\"\3\2\2\2$\'\3\2\2\2%#\3\2\2\2%&\3\2\2\2&\5\3\2\2\2\'%\3"+
		"\2\2\2(\60\5\b\5\2)\60\5\n\6\2*\60\5\f\7\2+\60\5\24\13\2,\60\5\26\f\2"+
		"-\60\5\30\r\2.\60\5\32\16\2/(\3\2\2\2/)\3\2\2\2/*\3\2\2\2/+\3\2\2\2/,"+
		"\3\2\2\2/-\3\2\2\2/.\3\2\2\2\60\7\3\2\2\2\61\62\7\5\2\2\62\63\7\b\2\2"+
		"\63\64\5\22\n\2\64\65\7\t\2\2\65\66\7\f\2\2\66\t\3\2\2\2\678\7\6\2\28"+
		"9\7\b\2\29:\5\22\n\2:;\7\t\2\2;<\7\f\2\2<\13\3\2\2\2=>\7\26\2\2>?\7\17"+
		"\2\2?@\5\16\b\2@A\7\f\2\2A\r\3\2\2\2BG\5\22\n\2CD\7\r\2\2DF\5\22\n\2E"+
		"C\3\2\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2H\17\3\2\2\2IG\3\2\2\2JO\5\22\n"+
		"\2KL\7\16\2\2LN\5\22\n\2MK\3\2\2\2NQ\3\2\2\2OM\3\2\2\2OP\3\2\2\2P\21\3"+
		"\2\2\2QO\3\2\2\2RS\t\2\2\2S\23\3\2\2\2TU\7\23\2\2UV\7\b\2\2VW\5\20\t\2"+
		"WX\7\t\2\2XY\7\n\2\2YZ\5\4\3\2Z[\7\13\2\2[\25\3\2\2\2\\]\5\24\13\2]^\7"+
		"\24\2\2^_\7\n\2\2_`\5\4\3\2`a\7\13\2\2a\27\3\2\2\2be\5\24\13\2cd\7\24"+
		"\2\2df\5\24\13\2ec\3\2\2\2fg\3\2\2\2ge\3\2\2\2gh\3\2\2\2h\31\3\2\2\2i"+
		"j\7\25\2\2jk\7\b\2\2kl\5\20\t\2lm\7\t\2\2mn\7\n\2\2no\5\4\3\2op\7\13\2"+
		"\2p\33\3\2\2\2\7%/GOg";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}