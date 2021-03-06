// Generated from c:\Users\crist\Downloads\antlr4\CommonLexerRules.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CommonLexerRules extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MUL=1, DIV=2, ADD=3, SUB=4, EQ=5, APARE=6, FPARE=7, ABCHV=8, FCHV=9, ID=10, 
		INT=11, NEWLINE=12, WS=13, OR=14, AND=15, EQUALS=16, NEQ=17, GT=18, LT=19, 
		GTEQ=20, LTEQ=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"MUL", "DIV", "ADD", "SUB", "EQ", "APARE", "FPARE", "ABCHV", "FCHV", 
			"ID", "INT", "NEWLINE", "WS", "OR", "AND", "EQUALS", "NEQ", "GT", "LT", 
			"GTEQ", "LTEQ"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'*'", "'/'", "'+'", "'-'", "'='", "'('", "')'", "'{'", "'}'", 
			null, null, null, null, "'||'", "'&&'", "'=='", "'!='", "'>'", "'<'", 
			"'>='", "'<='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "MUL", "DIV", "ADD", "SUB", "EQ", "APARE", "FPARE", "ABCHV", "FCHV", 
			"ID", "INT", "NEWLINE", "WS", "OR", "AND", "EQUALS", "NEQ", "GT", "LT", 
			"GTEQ", "LTEQ"
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


	public CommonLexerRules(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CommonLexerRules.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\27k\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3"+
		"\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\6\13A\n\13\r\13\16\13"+
		"B\3\f\6\fF\n\f\r\f\16\fG\3\r\5\rK\n\r\3\r\3\r\3\16\6\16P\n\16\r\16\16"+
		"\16Q\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\2\2\27\3\3\5\4"+
		"\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27\3\2\5\4\2C\\c|\3\2\62;\4\2\13\13\"\"\2n\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3"+
		"\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\3-\3\2\2\2\5/\3\2\2\2\7\61\3"+
		"\2\2\2\t\63\3\2\2\2\13\65\3\2\2\2\r\67\3\2\2\2\179\3\2\2\2\21;\3\2\2\2"+
		"\23=\3\2\2\2\25@\3\2\2\2\27E\3\2\2\2\31J\3\2\2\2\33O\3\2\2\2\35U\3\2\2"+
		"\2\37X\3\2\2\2![\3\2\2\2#^\3\2\2\2%a\3\2\2\2\'c\3\2\2\2)e\3\2\2\2+h\3"+
		"\2\2\2-.\7,\2\2.\4\3\2\2\2/\60\7\61\2\2\60\6\3\2\2\2\61\62\7-\2\2\62\b"+
		"\3\2\2\2\63\64\7/\2\2\64\n\3\2\2\2\65\66\7?\2\2\66\f\3\2\2\2\678\7*\2"+
		"\28\16\3\2\2\29:\7+\2\2:\20\3\2\2\2;<\7}\2\2<\22\3\2\2\2=>\7\177\2\2>"+
		"\24\3\2\2\2?A\t\2\2\2@?\3\2\2\2AB\3\2\2\2B@\3\2\2\2BC\3\2\2\2C\26\3\2"+
		"\2\2DF\t\3\2\2ED\3\2\2\2FG\3\2\2\2GE\3\2\2\2GH\3\2\2\2H\30\3\2\2\2IK\7"+
		"\17\2\2JI\3\2\2\2JK\3\2\2\2KL\3\2\2\2LM\7\f\2\2M\32\3\2\2\2NP\t\4\2\2"+
		"ON\3\2\2\2PQ\3\2\2\2QO\3\2\2\2QR\3\2\2\2RS\3\2\2\2ST\b\16\2\2T\34\3\2"+
		"\2\2UV\7~\2\2VW\7~\2\2W\36\3\2\2\2XY\7(\2\2YZ\7(\2\2Z \3\2\2\2[\\\7?\2"+
		"\2\\]\7?\2\2]\"\3\2\2\2^_\7#\2\2_`\7?\2\2`$\3\2\2\2ab\7@\2\2b&\3\2\2\2"+
		"cd\7>\2\2d(\3\2\2\2ef\7@\2\2fg\7?\2\2g*\3\2\2\2hi\7>\2\2ij\7?\2\2j,\3"+
		"\2\2\2\7\2BGJQ\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}