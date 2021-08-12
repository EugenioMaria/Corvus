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
    import java.util.ArrayList;
    import java.util.Stack;

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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, WhiteSpace=12, OpenParentheses=13, CloseParentheses=14, 
		OpenBraces=15, CloseBraces=16, Semicolon=17, Colon=18, Operation=19, LogicalOperator=20, 
		Attribute=21, Integer=22, Float=23, String=24, IfSintax=25, ElseSintax=26, 
		WhileSintax=27, Identifier=28, Char=29;
	public static final int
		RULE_prog = 0, RULE_decl = 1, RULE_varDeclaration = 2, RULE_type = 3, 
		RULE_codeBlock = 4, RULE_command = 5, RULE_read = 6, RULE_write = 7, RULE_attribute = 8, 
		RULE_expression = 9, RULE_boolExpression = 10, RULE_termo = 11, RULE_ifCMD = 12, 
		RULE_ifElseCMD = 13, RULE_whileCMD = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "decl", "varDeclaration", "type", "codeBlock", "command", "read", 
			"write", "attribute", "expression", "boolExpression", "termo", "ifCMD", 
			"ifElseCMD", "whileCMD"
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

	@Override
	public String getGrammarFileName() { return "Proj.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


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
	    private Boolean isAttr = false;
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

	public ProjParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public TerminalNode OpenBraces() { return getToken(ProjParser.OpenBraces, 0); }
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
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
			setState(30);
			match(T__0);
			setState(31);
			match(OpenBraces);
			setState(32);
			decl();
			setState(33);
			codeBlock();
			setState(34);
			match(CloseBraces);
			setState(35);
			match(T__1);

			        program.setVarTable(symbolTable);
			        program.setCmd(cmdStack.pop());
			    
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

	public static class DeclContext extends ParserRuleContext {
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjListener ) ((ProjListener)listener).enterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjListener ) ((ProjListener)listener).exitDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjVisitor ) return ((ProjVisitor<? extends T>)visitor).visitDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_decl);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(39); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(38);
					varDeclaration();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(41); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class VarDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> Identifier() { return getTokens(ProjParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(ProjParser.Identifier, i);
		}
		public TerminalNode Semicolon() { return getToken(ProjParser.Semicolon, 0); }
		public List<TerminalNode> Colon() { return getTokens(ProjParser.Colon); }
		public TerminalNode Colon(int i) {
			return getToken(ProjParser.Colon, i);
		}
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjListener ) ((ProjListener)listener).enterVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjListener ) ((ProjListener)listener).exitVarDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjVisitor ) return ((ProjVisitor<? extends T>)visitor).visitVarDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_varDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			type();

			//            _varType = _input.LT(-1).getText();
			        
			setState(45);
			match(Identifier);

			            _varName = _input.LT(-1).getText();
			            _varValue = null;
			            symbol = new CorvusVariable(_varName,_varValue,_varType);
			            symbolTable.add(symbol);

			//            CommandVariable cmd = new CommandVariable(_varName,_varValue,_varType);
			//            cmdStack.peek().add(cmd);
			        
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Colon) {
				{
				{
				setState(47);
				match(Colon);
				setState(48);
				match(Identifier);

				            _varName = _input.LT(-1).getText();
				            _varValue = null;
				            symbol = new CorvusVariable(_varName,_varValue,_varType);
				            symbolTable.add(symbol);

				//            CommandVariable cmd = new CommandVariable(_varName,_varValue,_varType);
				//            cmdStack.peek().add(cmd);
				        
				}
				}
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjListener ) ((ProjListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjListener ) ((ProjListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjVisitor ) return ((ProjVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_type);
		try {
			setState(67);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
				match(T__2);
				 _varType = CorvusVariable.intVar; 
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(59);
				match(T__3);
				 _varType = CorvusVariable.floatVar; 
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 3);
				{
				setState(61);
				match(T__4);
				 _varType = CorvusVariable.stringVar; 
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 4);
				{
				setState(63);
				match(T__5);
				 _varType = CorvusVariable.listVar; 
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 5);
				{
				setState(65);
				match(T__6);
				 _varType = CorvusVariable.booleanVar;
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
		enterRule(_localctx, 8, RULE_codeBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{

			        curThread = new ArrayList<CorvusAbstractCommand>();
			        cmdStack.push(curThread);
			    
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << IfSintax) | (1L << WhileSintax) | (1L << Identifier))) != 0)) {
				{
				{
				setState(70);
				command();
				}
				}
				setState(75);
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
		public WhileCMDContext whileCMD() {
			return getRuleContext(WhileCMDContext.class,0);
		}
		public VarDeclarationContext varDeclaration() {
			return getRuleContext(VarDeclarationContext.class,0);
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
		enterRule(_localctx, 10, RULE_command);
		try {
			setState(83);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				read();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
				write();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(78);
				attribute();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(79);
				ifCMD();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(80);
				ifElseCMD();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(81);
				whileCMD();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(82);
				varDeclaration();
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
		enterRule(_localctx, 12, RULE_read);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(T__7);
			setState(86);
			match(OpenParentheses);
			setState(87);
			match(CloseParentheses);
			setState(89);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(88);
				match(Semicolon);
				}
				break;
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
		enterRule(_localctx, 14, RULE_write);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(T__8);
			setState(92);
			match(OpenParentheses);
			setState(93);
			termo();

			        _writeId = _input.LT(-1).getText();
			    
			setState(95);
			match(CloseParentheses);
			setState(96);
			match(Semicolon);

			        CommandWrite cmd = new CommandWrite(_writeId);
			        cmdStack.peek().add(cmd);
			    
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
		public TerminalNode Semicolon() { return getToken(ProjParser.Semicolon, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReadContext read() {
			return getRuleContext(ReadContext.class,0);
		}
		public TerminalNode OpenParentheses() { return getToken(ProjParser.OpenParentheses, 0); }
		public BoolExpressionContext boolExpression() {
			return getRuleContext(BoolExpressionContext.class,0);
		}
		public TerminalNode CloseParentheses() { return getToken(ProjParser.CloseParentheses, 0); }
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
		enterRule(_localctx, 16, RULE_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(Identifier);

			      verifyId(_input.LT(-1).getText());
			      _varName = _input.LT(-1).getText();
			      line = _input.LT(-1).getLine();
			      _attrId = _varName;
			      isAttr = true;
			      _attrType = symbolTable.getType(_varName);
			    
			setState(101);
			match(Attribute);

			      _attrContent = "";
			    
			setState(115);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Integer:
			case Float:
			case String:
			case Identifier:
				{
				setState(103);
				expression();

				            CommandAttr cmd = new CommandAttr(_attrId,_attrContent);
				            cmdStack.peek().add(cmd);
				        
				}
				break;
			case T__7:
				{
				setState(106);
				read();

				            CommandRead cmdRead = new CommandRead(symbolTable.get(_varName).getTypeString());
				            CommandAttr cmd = new CommandAttr(_attrId,cmdRead.generateJava(0));
				            cmdStack.peek().add(cmd);
				        
				}
				break;
			case OpenParentheses:
				{
				setState(109);
				match(OpenParentheses);

				              verifyType(_attrType,3);
				              isAttr = false;
				            
				setState(111);
				boolExpression();

				             CommandAttr cmd = new CommandAttr(_attrId,_attrContent);
				             cmdStack.peek().add(cmd);

				           
				setState(113);
				match(CloseParentheses);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(117);
			match(Semicolon);

			      symbolTable.setValue(_varName, _attrContent);
			      isAttr = false;
			    
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
		enterRule(_localctx, 18, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			termo();
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Operation) {
				{
				{
				setState(121);
				match(Operation);
				_attrContent += _input.LT(-1).getText();
				setState(123);
				termo();
				}
				}
				setState(128);
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
		public TerminalNode LogicalOperator() { return getToken(ProjParser.LogicalOperator, 0); }
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
		enterRule(_localctx, 20, RULE_boolExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			termo();
			{
			setState(130);
			match(LogicalOperator);
			_attrContent += _input.LT(-1).getText();
			setState(132);
			termo();
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
		enterRule(_localctx, 22, RULE_termo);
		try {
			setState(142);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(134);
				match(Identifier);

				        verifyId(_input.LT(-1).getText());
				        _varName = _input.LT(-1).getText();
				        _attrContent += _input.LT(-1).getText();
				        _varType  = symbolTable.getType(_varName);
				        verifyType(_attrType,_varType);
				        symbolTable.setRead(_varName);
				    
				}
				break;
			case Integer:
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				match(Integer);

				        _attrContent += _input.LT(-1).getText();
				        verifyType(_attrType, 0);
				    
				}
				break;
			case Float:
				enterOuterAlt(_localctx, 3);
				{
				setState(138);
				match(Float);

				        _attrContent += _input.LT(-1).getText();
				        verifyType(_attrType, 4);
				    
				}
				break;
			case String:
				enterOuterAlt(_localctx, 4);
				{
				setState(140);
				match(String);

				        _attrContent += _input.LT(-1).getText();
				        verifyType(_attrType,1);
				    
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

	public static class IfCMDContext extends ParserRuleContext {
		public TerminalNode IfSintax() { return getToken(ProjParser.IfSintax, 0); }
		public TerminalNode OpenParentheses() { return getToken(ProjParser.OpenParentheses, 0); }
		public TerminalNode CloseParentheses() { return getToken(ProjParser.CloseParentheses, 0); }
		public TerminalNode OpenBraces() { return getToken(ProjParser.OpenBraces, 0); }
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public TerminalNode CloseBraces() { return getToken(ProjParser.CloseBraces, 0); }
		public BoolExpressionContext boolExpression() {
			return getRuleContext(BoolExpressionContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(ProjParser.Identifier, 0); }
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
		enterRule(_localctx, 24, RULE_ifCMD);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(IfSintax);
			_attrContent = "";
			setState(146);
			match(OpenParentheses);
			setState(156);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(147);
				boolExpression();
				_exprDecision = _attrContent;
				}
				break;
			case 2:
				{
				setState(150);
				match(Identifier);

				                    _varName = _input.LT(-1).getText();
				                    _varType  = symbolTable.getType(_varName);
				                    _exprDecision = _varName;
				                    symbolTable.setRead(_varName);
				                    verifyType(3,_varType);
				                
				}
				break;
			case 3:
				{
				setState(152);
				match(T__9);
				_exprDecision = "true";
				}
				break;
			case 4:
				{
				setState(154);
				match(T__10);
				_exprDecision = "false";
				}
				break;
			}
			setState(158);
			match(CloseParentheses);

			        conditionStack.push(_exprDecision);
			    
			setState(160);
			match(OpenBraces);
			setState(161);
			codeBlock();
			setState(162);
			match(CloseBraces);

			        cmdTrue = cmdStack.pop();
			        CommandDecider cmd = new CommandDecider(conditionStack.pop(), cmdTrue, null);
			        cmdStack.peek().add(cmd);
			    
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
		public TerminalNode IfSintax() { return getToken(ProjParser.IfSintax, 0); }
		public TerminalNode OpenParentheses() { return getToken(ProjParser.OpenParentheses, 0); }
		public TerminalNode CloseParentheses() { return getToken(ProjParser.CloseParentheses, 0); }
		public List<TerminalNode> OpenBraces() { return getTokens(ProjParser.OpenBraces); }
		public TerminalNode OpenBraces(int i) {
			return getToken(ProjParser.OpenBraces, i);
		}
		public List<CodeBlockContext> codeBlock() {
			return getRuleContexts(CodeBlockContext.class);
		}
		public CodeBlockContext codeBlock(int i) {
			return getRuleContext(CodeBlockContext.class,i);
		}
		public List<TerminalNode> CloseBraces() { return getTokens(ProjParser.CloseBraces); }
		public TerminalNode CloseBraces(int i) {
			return getToken(ProjParser.CloseBraces, i);
		}
		public TerminalNode ElseSintax() { return getToken(ProjParser.ElseSintax, 0); }
		public BoolExpressionContext boolExpression() {
			return getRuleContext(BoolExpressionContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(ProjParser.Identifier, 0); }
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
		enterRule(_localctx, 26, RULE_ifElseCMD);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(IfSintax);
			_attrContent = "";
			setState(167);
			match(OpenParentheses);
			setState(177);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(168);
				boolExpression();
				_exprDecision = _attrContent;
				}
				break;
			case 2:
				{
				setState(171);
				match(Identifier);

				                _varName = _input.LT(-1).getText();
				                _varType  = symbolTable.getType(_varName);
				                _exprDecision = _varName;
				                symbolTable.setRead(_varName);
				                verifyType(3,_varType);
				            
				}
				break;
			case 3:
				{
				setState(173);
				match(T__9);
				_exprDecision = "true";
				}
				break;
			case 4:
				{
				setState(175);
				match(T__10);
				_exprDecision = "false";
				}
				break;
			}
			setState(179);
			match(CloseParentheses);

			        conditionStack.push(_exprDecision);
			    
			setState(181);
			match(OpenBraces);
			setState(182);
			codeBlock();
			setState(183);
			match(CloseBraces);

			        cmdTrue = cmdStack.pop();
			    
			setState(185);
			match(ElseSintax);
			setState(186);
			match(OpenBraces);
			setState(187);
			codeBlock();
			setState(188);
			match(CloseBraces);

			        cmdFalse = cmdStack.pop();
			        CommandDecider cmd = new CommandDecider(conditionStack.pop(), cmdTrue, cmdFalse);
			        cmdStack.peek().add(cmd);
			    
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
		public TerminalNode CloseParentheses() { return getToken(ProjParser.CloseParentheses, 0); }
		public TerminalNode OpenBraces() { return getToken(ProjParser.OpenBraces, 0); }
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public TerminalNode CloseBraces() { return getToken(ProjParser.CloseBraces, 0); }
		public BoolExpressionContext boolExpression() {
			return getRuleContext(BoolExpressionContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(ProjParser.Identifier, 0); }
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
		enterRule(_localctx, 28, RULE_whileCMD);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(WhileSintax);
			setState(192);
			match(OpenParentheses);
			_attrContent = "";
			setState(203);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(194);
				boolExpression();
				_exprDecision = _attrContent;
				}
				break;
			case 2:
				{
				setState(197);
				match(Identifier);

				            _varName = _input.LT(-1).getText();
				            _varType  = symbolTable.getType(_varName);
				            _exprDecision = _varName;
				            symbolTable.setRead(_varName);
				            verifyType(3,_varType);
				        
				}
				break;
			case 3:
				{
				setState(199);
				match(T__9);
				_exprDecision = "true";
				}
				break;
			case 4:
				{
				setState(201);
				match(T__10);
				_exprDecision = "false";
				}
				break;
			}
			setState(205);
			match(CloseParentheses);

			        conditionStack.push(_exprDecision);
			    
			setState(207);
			match(OpenBraces);
			setState(208);
			codeBlock();
			setState(209);
			match(CloseBraces);

			        cmdWhile = cmdStack.pop();
			        CommandWhile cmd  = new CommandWhile(conditionStack.pop(),cmdWhile);
			        cmdStack.peek().add(cmd);
			    
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\37\u00d7\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\3\6\3*\n\3\r\3\16\3+\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4"+
		"\65\n\4\f\4\16\48\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\5\5F\n\5\3\6\3\6\7\6J\n\6\f\6\16\6M\13\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\5\7V\n\7\3\b\3\b\3\b\3\b\5\b\\\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\nv\n"+
		"\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\7\13\177\n\13\f\13\16\13\u0082\13\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0091\n\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u009f\n\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\5\17\u00b4\n\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\5\20\u00ce\n\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\2\2\21\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36\2\2\2\u00e4\2 \3\2"+
		"\2\2\4)\3\2\2\2\6-\3\2\2\2\bE\3\2\2\2\nG\3\2\2\2\fU\3\2\2\2\16W\3\2\2"+
		"\2\20]\3\2\2\2\22e\3\2\2\2\24z\3\2\2\2\26\u0083\3\2\2\2\30\u0090\3\2\2"+
		"\2\32\u0092\3\2\2\2\34\u00a7\3\2\2\2\36\u00c1\3\2\2\2 !\7\3\2\2!\"\7\21"+
		"\2\2\"#\5\4\3\2#$\5\n\6\2$%\7\22\2\2%&\7\4\2\2&\'\b\2\1\2\'\3\3\2\2\2"+
		"(*\5\6\4\2)(\3\2\2\2*+\3\2\2\2+)\3\2\2\2+,\3\2\2\2,\5\3\2\2\2-.\5\b\5"+
		"\2./\b\4\1\2/\60\7\36\2\2\60\66\b\4\1\2\61\62\7\24\2\2\62\63\7\36\2\2"+
		"\63\65\b\4\1\2\64\61\3\2\2\2\658\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\67"+
		"9\3\2\2\28\66\3\2\2\29:\7\23\2\2:\7\3\2\2\2;<\7\5\2\2<F\b\5\1\2=>\7\6"+
		"\2\2>F\b\5\1\2?@\7\7\2\2@F\b\5\1\2AB\7\b\2\2BF\b\5\1\2CD\7\t\2\2DF\b\5"+
		"\1\2E;\3\2\2\2E=\3\2\2\2E?\3\2\2\2EA\3\2\2\2EC\3\2\2\2F\t\3\2\2\2GK\b"+
		"\6\1\2HJ\5\f\7\2IH\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2L\13\3\2\2\2M"+
		"K\3\2\2\2NV\5\16\b\2OV\5\20\t\2PV\5\22\n\2QV\5\32\16\2RV\5\34\17\2SV\5"+
		"\36\20\2TV\5\6\4\2UN\3\2\2\2UO\3\2\2\2UP\3\2\2\2UQ\3\2\2\2UR\3\2\2\2U"+
		"S\3\2\2\2UT\3\2\2\2V\r\3\2\2\2WX\7\n\2\2XY\7\17\2\2Y[\7\20\2\2Z\\\7\23"+
		"\2\2[Z\3\2\2\2[\\\3\2\2\2\\\17\3\2\2\2]^\7\13\2\2^_\7\17\2\2_`\5\30\r"+
		"\2`a\b\t\1\2ab\7\20\2\2bc\7\23\2\2cd\b\t\1\2d\21\3\2\2\2ef\7\36\2\2fg"+
		"\b\n\1\2gh\7\27\2\2hu\b\n\1\2ij\5\24\13\2jk\b\n\1\2kv\3\2\2\2lm\5\16\b"+
		"\2mn\b\n\1\2nv\3\2\2\2op\7\17\2\2pq\b\n\1\2qr\5\26\f\2rs\b\n\1\2st\7\20"+
		"\2\2tv\3\2\2\2ui\3\2\2\2ul\3\2\2\2uo\3\2\2\2vw\3\2\2\2wx\7\23\2\2xy\b"+
		"\n\1\2y\23\3\2\2\2z\u0080\5\30\r\2{|\7\25\2\2|}\b\13\1\2}\177\5\30\r\2"+
		"~{\3\2\2\2\177\u0082\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081"+
		"\25\3\2\2\2\u0082\u0080\3\2\2\2\u0083\u0084\5\30\r\2\u0084\u0085\7\26"+
		"\2\2\u0085\u0086\b\f\1\2\u0086\u0087\5\30\r\2\u0087\27\3\2\2\2\u0088\u0089"+
		"\7\36\2\2\u0089\u0091\b\r\1\2\u008a\u008b\7\30\2\2\u008b\u0091\b\r\1\2"+
		"\u008c\u008d\7\31\2\2\u008d\u0091\b\r\1\2\u008e\u008f\7\32\2\2\u008f\u0091"+
		"\b\r\1\2\u0090\u0088\3\2\2\2\u0090\u008a\3\2\2\2\u0090\u008c\3\2\2\2\u0090"+
		"\u008e\3\2\2\2\u0091\31\3\2\2\2\u0092\u0093\7\33\2\2\u0093\u0094\b\16"+
		"\1\2\u0094\u009e\7\17\2\2\u0095\u0096\5\26\f\2\u0096\u0097\b\16\1\2\u0097"+
		"\u009f\3\2\2\2\u0098\u0099\7\36\2\2\u0099\u009f\b\16\1\2\u009a\u009b\7"+
		"\f\2\2\u009b\u009f\b\16\1\2\u009c\u009d\7\r\2\2\u009d\u009f\b\16\1\2\u009e"+
		"\u0095\3\2\2\2\u009e\u0098\3\2\2\2\u009e\u009a\3\2\2\2\u009e\u009c\3\2"+
		"\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a1\7\20\2\2\u00a1\u00a2\b\16\1\2\u00a2"+
		"\u00a3\7\21\2\2\u00a3\u00a4\5\n\6\2\u00a4\u00a5\7\22\2\2\u00a5\u00a6\b"+
		"\16\1\2\u00a6\33\3\2\2\2\u00a7\u00a8\7\33\2\2\u00a8\u00a9\b\17\1\2\u00a9"+
		"\u00b3\7\17\2\2\u00aa\u00ab\5\26\f\2\u00ab\u00ac\b\17\1\2\u00ac\u00b4"+
		"\3\2\2\2\u00ad\u00ae\7\36\2\2\u00ae\u00b4\b\17\1\2\u00af\u00b0\7\f\2\2"+
		"\u00b0\u00b4\b\17\1\2\u00b1\u00b2\7\r\2\2\u00b2\u00b4\b\17\1\2\u00b3\u00aa"+
		"\3\2\2\2\u00b3\u00ad\3\2\2\2\u00b3\u00af\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4"+
		"\u00b5\3\2\2\2\u00b5\u00b6\7\20\2\2\u00b6\u00b7\b\17\1\2\u00b7\u00b8\7"+
		"\21\2\2\u00b8\u00b9\5\n\6\2\u00b9\u00ba\7\22\2\2\u00ba\u00bb\b\17\1\2"+
		"\u00bb\u00bc\7\34\2\2\u00bc\u00bd\7\21\2\2\u00bd\u00be\5\n\6\2\u00be\u00bf"+
		"\7\22\2\2\u00bf\u00c0\b\17\1\2\u00c0\35\3\2\2\2\u00c1\u00c2\7\35\2\2\u00c2"+
		"\u00c3\7\17\2\2\u00c3\u00cd\b\20\1\2\u00c4\u00c5\5\26\f\2\u00c5\u00c6"+
		"\b\20\1\2\u00c6\u00ce\3\2\2\2\u00c7\u00c8\7\36\2\2\u00c8\u00ce\b\20\1"+
		"\2\u00c9\u00ca\7\f\2\2\u00ca\u00ce\b\20\1\2\u00cb\u00cc\7\r\2\2\u00cc"+
		"\u00ce\b\20\1\2\u00cd\u00c4\3\2\2\2\u00cd\u00c7\3\2\2\2\u00cd\u00c9\3"+
		"\2\2\2\u00cd\u00cb\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d0\7\20\2\2\u00d0"+
		"\u00d1\b\20\1\2\u00d1\u00d2\7\21\2\2\u00d2\u00d3\5\n\6\2\u00d3\u00d4\7"+
		"\22\2\2\u00d4\u00d5\b\20\1\2\u00d5\37\3\2\2\2\16+\66EKU[u\u0080\u0090"+
		"\u009e\u00b3\u00cd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}