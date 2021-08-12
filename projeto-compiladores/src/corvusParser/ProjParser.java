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
		T__9=10, T__10=11, T__11=12, WhiteSpace=13, OpenParentheses=14, CloseParentheses=15, 
		OpenBraces=16, CloseBraces=17, Semicolon=18, Colon=19, Operation=20, LogicalOperator=21, 
		Attribute=22, Integer=23, Float=24, String=25, IfSintax=26, ElseSintax=27, 
		WhileSintax=28, Identifier=29, Char=30;
	public static final int
		RULE_prog = 0, RULE_decl = 1, RULE_varDeclaration = 2, RULE_type = 3, 
		RULE_codeBlock = 4, RULE_command = 5, RULE_read = 6, RULE_write = 7, RULE_attribute = 8, 
		RULE_expression = 9, RULE_boolExpression = 10, RULE_termo = 11, RULE_ifCMD = 12, 
		RULE_ifElseCMD = 13, RULE_whileCMD = 14, RULE_forCMD = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "decl", "varDeclaration", "type", "codeBlock", "command", "read", 
			"write", "attribute", "expression", "boolExpression", "termo", "ifCMD", 
			"ifElseCMD", "whileCMD", "forCMD"
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
			setState(32);
			match(T__0);
			setState(33);
			match(OpenBraces);
			setState(34);
			decl();
			setState(35);
			codeBlock();
			setState(36);
			match(CloseBraces);
			setState(37);
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
			setState(41); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(40);
					varDeclaration();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(43); 
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
			setState(45);
			type();

			//            _varType = _input.LT(-1).getText();
			        
			setState(47);
			match(Identifier);

			            _varName = _input.LT(-1).getText();
			            _varValue = null;
			            symbol = new CorvusVariable(_varName,_varValue,_varType);
			            symbolTable.add(symbol);

			//            CommandVariable cmd = new CommandVariable(_varName,_varValue,_varType);
			//            cmdStack.peek().add(cmd);
			        
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Colon) {
				{
				{
				setState(49);
				match(Colon);
				setState(50);
				match(Identifier);

				            _varName = _input.LT(-1).getText();
				            _varValue = null;
				            symbol = new CorvusVariable(_varName,_varValue,_varType);
				            symbolTable.add(symbol);

				//            CommandVariable cmd = new CommandVariable(_varName,_varValue,_varType);
				//            cmdStack.peek().add(cmd);
				        
				}
				}
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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
			setState(69);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(59);
				match(T__2);
				 _varType = CorvusVariable.intVar; 
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				match(T__3);
				 _varType = CorvusVariable.floatVar; 
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 3);
				{
				setState(63);
				match(T__4);
				 _varType = CorvusVariable.stringVar; 
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 4);
				{
				setState(65);
				match(T__5);
				 _varType = CorvusVariable.listVar; 
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 5);
				{
				setState(67);
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
			    
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__11) | (1L << IfSintax) | (1L << WhileSintax) | (1L << Identifier))) != 0)) {
				{
				{
				setState(72);
				command();
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
		public ForCMDContext forCMD() {
			return getRuleContext(ForCMDContext.class,0);
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
			setState(86);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				read();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				write();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(80);
				attribute();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(81);
				ifCMD();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(82);
				ifElseCMD();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(83);
				whileCMD();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(84);
				varDeclaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(85);
				forCMD();
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
			setState(88);
			match(T__7);
			setState(89);
			match(OpenParentheses);
			setState(90);
			match(CloseParentheses);
			setState(92);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(91);
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
			setState(94);
			match(T__8);
			setState(95);
			match(OpenParentheses);
			setState(96);
			termo();

			        _writeId = _input.LT(-1).getText();
			    
			setState(98);
			match(CloseParentheses);
			setState(99);
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
		public BoolExpressionContext boolExpression() {
			return getRuleContext(BoolExpressionContext.class,0);
		}
		public List<TerminalNode> OpenParentheses() { return getTokens(ProjParser.OpenParentheses); }
		public TerminalNode OpenParentheses(int i) {
			return getToken(ProjParser.OpenParentheses, i);
		}
		public List<TerminalNode> CloseParentheses() { return getTokens(ProjParser.CloseParentheses); }
		public TerminalNode CloseParentheses(int i) {
			return getToken(ProjParser.CloseParentheses, i);
		}
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(Identifier);

			      verifyId(_input.LT(-1).getText());
			      _varName = _input.LT(-1).getText();
			      line = _input.LT(-1).getLine();
			      _attrId = _varName;
			      isAttr = true;
			      _attrType = symbolTable.getType(_varName);
			    
			setState(104);
			match(Attribute);

			      _attrContent = "";
			    
			setState(131);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(106);
				expression();

				            CommandAttr cmd = new CommandAttr(_attrId,_attrContent);
				            cmdStack.peek().add(cmd);
				        
				}
				break;
			case 2:
				{
				setState(109);
				read();

				            CommandRead cmdRead = new CommandRead(symbolTable.get(_varName).getTypeString());
				            CommandAttr cmd = new CommandAttr(_attrId,cmdRead.generateJava(0));
				            cmdStack.peek().add(cmd);
				        
				}
				break;
			case 3:
				{
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OpenParentheses) {
					{
					{
					setState(112);
					match(OpenParentheses);
					}
					}
					setState(117);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}

				              verifyType(_attrType,3);
				              isAttr = false;
				            
				setState(119);
				boolExpression();

				             CommandAttr cmd = new CommandAttr(_attrId,_attrContent);
				             cmdStack.peek().add(cmd);

				           
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CloseParentheses) {
					{
					{
					setState(121);
					match(CloseParentheses);
					}
					}
					setState(126);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 4:
				{
				setState(127);
				match(T__9);

				                verifyType(_attrType,3);
				                isAttr = false;
				                CommandAttr cmd = new CommandAttr(_attrId,"false");
				                cmdStack.peek().add(cmd);
				            
				}
				break;
			case 5:
				{
				setState(129);
				match(T__10);

				                verifyType(_attrType,3);
				                isAttr = false;
				                CommandAttr cmd = new CommandAttr(_attrId,"true");
				                cmdStack.peek().add(cmd);
				            
				}
				break;
			}
			setState(133);
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
			setState(136);
			termo();
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Operation) {
				{
				{
				setState(137);
				match(Operation);
				_attrContent += _input.LT(-1).getText();
				setState(139);
				termo();
				}
				}
				setState(144);
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
			setState(145);
			termo();
			{
			setState(146);
			match(LogicalOperator);
			_attrContent += _input.LT(-1).getText();
			setState(148);
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
			setState(158);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(150);
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
				setState(152);
				match(Integer);

				        _attrContent += _input.LT(-1).getText();
				        verifyType(_attrType, 0);
				    
				}
				break;
			case Float:
				enterOuterAlt(_localctx, 3);
				{
				setState(154);
				match(Float);

				        _attrContent += _input.LT(-1).getText();
				        verifyType(_attrType, 4);
				    
				}
				break;
			case String:
				enterOuterAlt(_localctx, 4);
				{
				setState(156);
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
			setState(160);
			match(IfSintax);
			_attrContent = "";
			setState(162);
			match(OpenParentheses);
			setState(172);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(163);
				boolExpression();
				_exprDecision = _attrContent;
				}
				break;
			case 2:
				{
				setState(166);
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
				setState(168);
				match(T__10);
				_exprDecision = "true";
				}
				break;
			case 4:
				{
				setState(170);
				match(T__9);
				_exprDecision = "false";
				}
				break;
			}
			setState(174);
			match(CloseParentheses);

			        conditionStack.push(_exprDecision);
			    
			setState(176);
			match(OpenBraces);
			setState(177);
			codeBlock();
			setState(178);
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
			setState(181);
			match(IfSintax);
			_attrContent = "";
			setState(183);
			match(OpenParentheses);
			setState(193);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(184);
				boolExpression();
				_exprDecision = _attrContent;
				}
				break;
			case 2:
				{
				setState(187);
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
				setState(189);
				match(T__10);
				_exprDecision = "true";
				}
				break;
			case 4:
				{
				setState(191);
				match(T__9);
				_exprDecision = "false";
				}
				break;
			}
			setState(195);
			match(CloseParentheses);

			        conditionStack.push(_exprDecision);
			    
			setState(197);
			match(OpenBraces);
			setState(198);
			codeBlock();
			setState(199);
			match(CloseBraces);

			        cmdTrue = cmdStack.pop();
			    
			setState(201);
			match(ElseSintax);
			setState(202);
			match(OpenBraces);
			setState(203);
			codeBlock();
			setState(204);
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
			setState(207);
			match(WhileSintax);
			setState(208);
			match(OpenParentheses);
			_attrContent = "";
			setState(219);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(210);
				boolExpression();
				_exprDecision = _attrContent;
				}
				break;
			case 2:
				{
				setState(213);
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
				setState(215);
				match(T__10);
				_exprDecision = "true";
				}
				break;
			case 4:
				{
				setState(217);
				match(T__9);
				_exprDecision = "false";
				}
				break;
			}
			setState(221);
			match(CloseParentheses);

			        conditionStack.push(_exprDecision);
			    
			setState(223);
			match(OpenBraces);
			setState(224);
			codeBlock();
			setState(225);
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

	public static class ForCMDContext extends ParserRuleContext {
		public TerminalNode OpenParentheses() { return getToken(ProjParser.OpenParentheses, 0); }
		public TerminalNode Identifier() { return getToken(ProjParser.Identifier, 0); }
		public TerminalNode Attribute() { return getToken(ProjParser.Attribute, 0); }
		public TerminalNode Integer() { return getToken(ProjParser.Integer, 0); }
		public List<TerminalNode> Semicolon() { return getTokens(ProjParser.Semicolon); }
		public TerminalNode Semicolon(int i) {
			return getToken(ProjParser.Semicolon, i);
		}
		public BoolExpressionContext boolExpression() {
			return getRuleContext(BoolExpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CloseParentheses() { return getToken(ProjParser.CloseParentheses, 0); }
		public TerminalNode OpenBraces() { return getToken(ProjParser.OpenBraces, 0); }
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public TerminalNode CloseBraces() { return getToken(ProjParser.CloseBraces, 0); }
		public ForCMDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forCMD; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProjListener ) ((ProjListener)listener).enterForCMD(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProjListener ) ((ProjListener)listener).exitForCMD(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjVisitor ) return ((ProjVisitor<? extends T>)visitor).visitForCMD(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForCMDContext forCMD() throws RecognitionException {
		ForCMDContext _localctx = new ForCMDContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_forCMD);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(T__11);
			setState(229);
			match(OpenParentheses);
			setState(230);
			match(Identifier);

			        _varName = _input.LT(-1).getText();
			        iteratorStack.push(_varName);
			        _varType = symbolTable.getType(_varName);
			        validLoopType(_varType);
			    
			setState(232);
			match(Attribute);
			setState(233);
			match(Integer);

			        symbolTable.setValue(_varName,_input.LT(-1).getText());
			        startValueStack.push(_input.LT(-1).getText());
			    
			setState(235);
			match(Semicolon);
			_attrContent="";
			setState(237);
			boolExpression();

			        _exprDecision = _attrContent;
			        conditionStack.push(_exprDecision);
			    
			setState(239);
			match(Semicolon);
			_attrContent="";
			setState(241);
			expression();

			        incrementStack.push(_attrContent);
			    
			setState(243);
			match(CloseParentheses);
			setState(244);
			match(OpenBraces);
			setState(245);
			codeBlock();
			setState(246);
			match(CloseBraces);

			            cmdFor = cmdStack.pop();
			            CommandFor cmd  = new CommandFor(startValueStack.pop(),iteratorStack.pop(),conditionStack.pop(),incrementStack.pop(),cmdFor);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3 \u00fc\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\3\6\3,\n\3\r\3\16\3-\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\7\4\67\n\4\f\4\16\4:\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\5\5H\n\5\3\6\3\6\7\6L\n\6\f\6\16\6O\13\6\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\5\7Y\n\7\3\b\3\b\3\b\3\b\5\b_\n\b\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\nt\n\n\f\n\16\n"+
		"w\13\n\3\n\3\n\3\n\3\n\7\n}\n\n\f\n\16\n\u0080\13\n\3\n\3\n\3\n\3\n\5"+
		"\n\u0086\n\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\7\13\u008f\n\13\f\13\16\13"+
		"\u0092\13\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00a1"+
		"\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16"+
		"\u00af\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00c4\n\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00de\n\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\2\2\22\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \2\2\2\u010d\2\"\3\2\2\2\4+\3\2\2\2\6/\3\2"+
		"\2\2\bG\3\2\2\2\nI\3\2\2\2\fX\3\2\2\2\16Z\3\2\2\2\20`\3\2\2\2\22h\3\2"+
		"\2\2\24\u008a\3\2\2\2\26\u0093\3\2\2\2\30\u00a0\3\2\2\2\32\u00a2\3\2\2"+
		"\2\34\u00b7\3\2\2\2\36\u00d1\3\2\2\2 \u00e6\3\2\2\2\"#\7\3\2\2#$\7\22"+
		"\2\2$%\5\4\3\2%&\5\n\6\2&\'\7\23\2\2\'(\7\4\2\2()\b\2\1\2)\3\3\2\2\2*"+
		",\5\6\4\2+*\3\2\2\2,-\3\2\2\2-+\3\2\2\2-.\3\2\2\2.\5\3\2\2\2/\60\5\b\5"+
		"\2\60\61\b\4\1\2\61\62\7\37\2\2\628\b\4\1\2\63\64\7\25\2\2\64\65\7\37"+
		"\2\2\65\67\b\4\1\2\66\63\3\2\2\2\67:\3\2\2\28\66\3\2\2\289\3\2\2\29;\3"+
		"\2\2\2:8\3\2\2\2;<\7\24\2\2<\7\3\2\2\2=>\7\5\2\2>H\b\5\1\2?@\7\6\2\2@"+
		"H\b\5\1\2AB\7\7\2\2BH\b\5\1\2CD\7\b\2\2DH\b\5\1\2EF\7\t\2\2FH\b\5\1\2"+
		"G=\3\2\2\2G?\3\2\2\2GA\3\2\2\2GC\3\2\2\2GE\3\2\2\2H\t\3\2\2\2IM\b\6\1"+
		"\2JL\5\f\7\2KJ\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2N\13\3\2\2\2OM\3\2"+
		"\2\2PY\5\16\b\2QY\5\20\t\2RY\5\22\n\2SY\5\32\16\2TY\5\34\17\2UY\5\36\20"+
		"\2VY\5\6\4\2WY\5 \21\2XP\3\2\2\2XQ\3\2\2\2XR\3\2\2\2XS\3\2\2\2XT\3\2\2"+
		"\2XU\3\2\2\2XV\3\2\2\2XW\3\2\2\2Y\r\3\2\2\2Z[\7\n\2\2[\\\7\20\2\2\\^\7"+
		"\21\2\2]_\7\24\2\2^]\3\2\2\2^_\3\2\2\2_\17\3\2\2\2`a\7\13\2\2ab\7\20\2"+
		"\2bc\5\30\r\2cd\b\t\1\2de\7\21\2\2ef\7\24\2\2fg\b\t\1\2g\21\3\2\2\2hi"+
		"\7\37\2\2ij\b\n\1\2jk\7\30\2\2k\u0085\b\n\1\2lm\5\24\13\2mn\b\n\1\2n\u0086"+
		"\3\2\2\2op\5\16\b\2pq\b\n\1\2q\u0086\3\2\2\2rt\7\20\2\2sr\3\2\2\2tw\3"+
		"\2\2\2us\3\2\2\2uv\3\2\2\2vx\3\2\2\2wu\3\2\2\2xy\b\n\1\2yz\5\26\f\2z~"+
		"\b\n\1\2{}\7\21\2\2|{\3\2\2\2}\u0080\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177"+
		"\u0086\3\2\2\2\u0080~\3\2\2\2\u0081\u0082\7\f\2\2\u0082\u0086\b\n\1\2"+
		"\u0083\u0084\7\r\2\2\u0084\u0086\b\n\1\2\u0085l\3\2\2\2\u0085o\3\2\2\2"+
		"\u0085u\3\2\2\2\u0085\u0081\3\2\2\2\u0085\u0083\3\2\2\2\u0086\u0087\3"+
		"\2\2\2\u0087\u0088\7\24\2\2\u0088\u0089\b\n\1\2\u0089\23\3\2\2\2\u008a"+
		"\u0090\5\30\r\2\u008b\u008c\7\26\2\2\u008c\u008d\b\13\1\2\u008d\u008f"+
		"\5\30\r\2\u008e\u008b\3\2\2\2\u008f\u0092\3\2\2\2\u0090\u008e\3\2\2\2"+
		"\u0090\u0091\3\2\2\2\u0091\25\3\2\2\2\u0092\u0090\3\2\2\2\u0093\u0094"+
		"\5\30\r\2\u0094\u0095\7\27\2\2\u0095\u0096\b\f\1\2\u0096\u0097\5\30\r"+
		"\2\u0097\27\3\2\2\2\u0098\u0099\7\37\2\2\u0099\u00a1\b\r\1\2\u009a\u009b"+
		"\7\31\2\2\u009b\u00a1\b\r\1\2\u009c\u009d\7\32\2\2\u009d\u00a1\b\r\1\2"+
		"\u009e\u009f\7\33\2\2\u009f\u00a1\b\r\1\2\u00a0\u0098\3\2\2\2\u00a0\u009a"+
		"\3\2\2\2\u00a0\u009c\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1\31\3\2\2\2\u00a2"+
		"\u00a3\7\34\2\2\u00a3\u00a4\b\16\1\2\u00a4\u00ae\7\20\2\2\u00a5\u00a6"+
		"\5\26\f\2\u00a6\u00a7\b\16\1\2\u00a7\u00af\3\2\2\2\u00a8\u00a9\7\37\2"+
		"\2\u00a9\u00af\b\16\1\2\u00aa\u00ab\7\r\2\2\u00ab\u00af\b\16\1\2\u00ac"+
		"\u00ad\7\f\2\2\u00ad\u00af\b\16\1\2\u00ae\u00a5\3\2\2\2\u00ae\u00a8\3"+
		"\2\2\2\u00ae\u00aa\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0"+
		"\u00b1\7\21\2\2\u00b1\u00b2\b\16\1\2\u00b2\u00b3\7\22\2\2\u00b3\u00b4"+
		"\5\n\6\2\u00b4\u00b5\7\23\2\2\u00b5\u00b6\b\16\1\2\u00b6\33\3\2\2\2\u00b7"+
		"\u00b8\7\34\2\2\u00b8\u00b9\b\17\1\2\u00b9\u00c3\7\20\2\2\u00ba\u00bb"+
		"\5\26\f\2\u00bb\u00bc\b\17\1\2\u00bc\u00c4\3\2\2\2\u00bd\u00be\7\37\2"+
		"\2\u00be\u00c4\b\17\1\2\u00bf\u00c0\7\r\2\2\u00c0\u00c4\b\17\1\2\u00c1"+
		"\u00c2\7\f\2\2\u00c2\u00c4\b\17\1\2\u00c3\u00ba\3\2\2\2\u00c3\u00bd\3"+
		"\2\2\2\u00c3\u00bf\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5"+
		"\u00c6\7\21\2\2\u00c6\u00c7\b\17\1\2\u00c7\u00c8\7\22\2\2\u00c8\u00c9"+
		"\5\n\6\2\u00c9\u00ca\7\23\2\2\u00ca\u00cb\b\17\1\2\u00cb\u00cc\7\35\2"+
		"\2\u00cc\u00cd\7\22\2\2\u00cd\u00ce\5\n\6\2\u00ce\u00cf\7\23\2\2\u00cf"+
		"\u00d0\b\17\1\2\u00d0\35\3\2\2\2\u00d1\u00d2\7\36\2\2\u00d2\u00d3\7\20"+
		"\2\2\u00d3\u00dd\b\20\1\2\u00d4\u00d5\5\26\f\2\u00d5\u00d6\b\20\1\2\u00d6"+
		"\u00de\3\2\2\2\u00d7\u00d8\7\37\2\2\u00d8\u00de\b\20\1\2\u00d9\u00da\7"+
		"\r\2\2\u00da\u00de\b\20\1\2\u00db\u00dc\7\f\2\2\u00dc\u00de\b\20\1\2\u00dd"+
		"\u00d4\3\2\2\2\u00dd\u00d7\3\2\2\2\u00dd\u00d9\3\2\2\2\u00dd\u00db\3\2"+
		"\2\2\u00de\u00df\3\2\2\2\u00df\u00e0\7\21\2\2\u00e0\u00e1\b\20\1\2\u00e1"+
		"\u00e2\7\22\2\2\u00e2\u00e3\5\n\6\2\u00e3\u00e4\7\23\2\2\u00e4\u00e5\b"+
		"\20\1\2\u00e5\37\3\2\2\2\u00e6\u00e7\7\16\2\2\u00e7\u00e8\7\20\2\2\u00e8"+
		"\u00e9\7\37\2\2\u00e9\u00ea\b\21\1\2\u00ea\u00eb\7\30\2\2\u00eb\u00ec"+
		"\7\31\2\2\u00ec\u00ed\b\21\1\2\u00ed\u00ee\7\24\2\2\u00ee\u00ef\b\21\1"+
		"\2\u00ef\u00f0\5\26\f\2\u00f0\u00f1\b\21\1\2\u00f1\u00f2\7\24\2\2\u00f2"+
		"\u00f3\b\21\1\2\u00f3\u00f4\5\24\13\2\u00f4\u00f5\b\21\1\2\u00f5\u00f6"+
		"\7\21\2\2\u00f6\u00f7\7\22\2\2\u00f7\u00f8\5\n\6\2\u00f8\u00f9\7\23\2"+
		"\2\u00f9\u00fa\b\21\1\2\u00fa!\3\2\2\2\20-8GMX^u~\u0085\u0090\u00a0\u00ae"+
		"\u00c3\u00dd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}