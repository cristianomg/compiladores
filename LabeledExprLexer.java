// Generated from LabeledExpr.g4 by ANTLR 4.9
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LabeledExprLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, MUL=5, DIV=6, ADD=7, SUB=8, EQ=9, APARE=10, 
		FPARE=11, ABCHV=12, FCHV=13, ID=14, INT=15, NEWLINE=16, WS=17, OR=18, 
		AND=19, EQUALS=20, NEQ=21, GT=22, LT=23, GTEQ=24, LTEQ=25;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "MUL", "DIV", "ADD", "SUB", "EQ", "APARE", 
			"FPARE", "ABCHV", "FCHV", "ID", "INT", "NEWLINE", "WS", "OR", "AND", 
			"EQUALS", "NEQ", "GT", "LT", "GTEQ", "LTEQ"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'println'", "'if'", "'else'", "'while'", "'*'", "'/'", "'+'", 
			"'-'", "'='", "'('", "')'", "'{'", "'}'", null, null, null, null, "'||'", 
			"'&&'", "'=='", "'!='", "'>'", "'<'", "'>='", "'<='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "MUL", "DIV", "ADD", "SUB", "EQ", "APARE", 
			"FPARE", "ABCHV", "FCHV", "ID", "INT", "NEWLINE", "WS", "OR", "AND", 
			"EQUALS", "NEQ", "GT", "LT", "GTEQ", "LTEQ"
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


	public LabeledExprLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LabeledExpr.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\33\u0089\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3"+
		"\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n"+
		"\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\6\17_\n\17\r\17\16\17`\3"+
		"\20\6\20d\n\20\r\20\16\20e\3\21\5\21i\n\21\3\21\3\21\3\22\6\22n\n\22\r"+
		"\22\16\22o\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\2\2\33\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37"+
		"\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\3\2\5\4\2C\\c|\3\2\62"+
		";\4\2\13\13\"\"\2\u008c\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\3\65\3\2\2\2\5=\3\2"+
		"\2\2\7@\3\2\2\2\tE\3\2\2\2\13K\3\2\2\2\rM\3\2\2\2\17O\3\2\2\2\21Q\3\2"+
		"\2\2\23S\3\2\2\2\25U\3\2\2\2\27W\3\2\2\2\31Y\3\2\2\2\33[\3\2\2\2\35^\3"+
		"\2\2\2\37c\3\2\2\2!h\3\2\2\2#m\3\2\2\2%s\3\2\2\2\'v\3\2\2\2)y\3\2\2\2"+
		"+|\3\2\2\2-\177\3\2\2\2/\u0081\3\2\2\2\61\u0083\3\2\2\2\63\u0086\3\2\2"+
		"\2\65\66\7r\2\2\66\67\7t\2\2\678\7k\2\289\7p\2\29:\7v\2\2:;\7n\2\2;<\7"+
		"p\2\2<\4\3\2\2\2=>\7k\2\2>?\7h\2\2?\6\3\2\2\2@A\7g\2\2AB\7n\2\2BC\7u\2"+
		"\2CD\7g\2\2D\b\3\2\2\2EF\7y\2\2FG\7j\2\2GH\7k\2\2HI\7n\2\2IJ\7g\2\2J\n"+
		"\3\2\2\2KL\7,\2\2L\f\3\2\2\2MN\7\61\2\2N\16\3\2\2\2OP\7-\2\2P\20\3\2\2"+
		"\2QR\7/\2\2R\22\3\2\2\2ST\7?\2\2T\24\3\2\2\2UV\7*\2\2V\26\3\2\2\2WX\7"+
		"+\2\2X\30\3\2\2\2YZ\7}\2\2Z\32\3\2\2\2[\\\7\177\2\2\\\34\3\2\2\2]_\t\2"+
		"\2\2^]\3\2\2\2_`\3\2\2\2`^\3\2\2\2`a\3\2\2\2a\36\3\2\2\2bd\t\3\2\2cb\3"+
		"\2\2\2de\3\2\2\2ec\3\2\2\2ef\3\2\2\2f \3\2\2\2gi\7\17\2\2hg\3\2\2\2hi"+
		"\3\2\2\2ij\3\2\2\2jk\7\f\2\2k\"\3\2\2\2ln\t\4\2\2ml\3\2\2\2no\3\2\2\2"+
		"om\3\2\2\2op\3\2\2\2pq\3\2\2\2qr\b\22\2\2r$\3\2\2\2st\7~\2\2tu\7~\2\2"+
		"u&\3\2\2\2vw\7(\2\2wx\7(\2\2x(\3\2\2\2yz\7?\2\2z{\7?\2\2{*\3\2\2\2|}\7"+
		"#\2\2}~\7?\2\2~,\3\2\2\2\177\u0080\7@\2\2\u0080.\3\2\2\2\u0081\u0082\7"+
		">\2\2\u0082\60\3\2\2\2\u0083\u0084\7@\2\2\u0084\u0085\7?\2\2\u0085\62"+
		"\3\2\2\2\u0086\u0087\7>\2\2\u0087\u0088\7?\2\2\u0088\64\3\2\2\2\7\2`e"+
		"ho\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}