// Generated from dijeAntlrLexer.g4 by ANTLR 4.5
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class dijeAntlrLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SEPARATORS=1, OPERATORS=2, KEYWORDS=3, ID=4, INT=5, WS=6;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"SEPARATORS", "OPERATORS", "KEYWORDS", "ID", "INT", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SEPARATORS", "OPERATORS", "KEYWORDS", "ID", "INT", "WS"
	};
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


	public dijeAntlrLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "dijeAntlrLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\bf\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\5\3\35\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\5\4L\n\4\3\5\3\5\7\5P\n\5\f\5\16\5S\13\5\3\6\6\6V\n\6\r\6\16\6W\3\6"+
		"\7\6[\n\6\f\6\16\6^\13\6\3\6\5\6a\n\6\3\7\3\7\3\7\3\7\2\2\b\3\3\5\4\7"+
		"\5\t\6\13\7\r\b\3\2\7\6\2*+..\60\60==\6\2,-//\61\61>>\4\2C\\c|\6\2\62"+
		";C\\aac|\5\2\13\f\16\17\"\"y\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\3\17\3\2\2\2\5\34\3\2\2\2\7K\3\2\2\2\t"+
		"M\3\2\2\2\13`\3\2\2\2\rb\3\2\2\2\17\20\t\2\2\2\20\4\3\2\2\2\21\22\7<\2"+
		"\2\22\35\7?\2\2\23\35\t\3\2\2\24\25\7>\2\2\25\35\7?\2\2\26\35\7@\2\2\27"+
		"\30\7@\2\2\30\35\7?\2\2\31\35\7?\2\2\32\33\7>\2\2\33\35\7@\2\2\34\21\3"+
		"\2\2\2\34\23\3\2\2\2\34\24\3\2\2\2\34\26\3\2\2\2\34\27\3\2\2\2\34\31\3"+
		"\2\2\2\34\32\3\2\2\2\35\6\3\2\2\2\36\37\7k\2\2\37L\7h\2\2 !\7v\2\2!\""+
		"\7j\2\2\"#\7g\2\2#L\7p\2\2$%\7y\2\2%&\7j\2\2&\'\7k\2\2\'(\7n\2\2(L\7g"+
		"\2\2)*\7f\2\2*L\7q\2\2+,\7q\2\2,-\7f\2\2-L\7f\2\2./\7e\2\2/\60\7q\2\2"+
		"\60\61\7p\2\2\61\62\7u\2\2\62L\7v\2\2\63\64\7x\2\2\64\65\7c\2\2\65L\7"+
		"t\2\2\66\67\7r\2\2\678\7t\2\289\7q\2\29:\7e\2\2:;\7g\2\2;<\7f\2\2<=\7"+
		"w\2\2=>\7t\2\2>L\7g\2\2?@\7e\2\2@A\7c\2\2AB\7n\2\2BL\7n\2\2CD\7d\2\2D"+
		"E\7g\2\2EF\7i\2\2FG\7k\2\2GL\7p\2\2HI\7g\2\2IJ\7p\2\2JL\7f\2\2K\36\3\2"+
		"\2\2K \3\2\2\2K$\3\2\2\2K)\3\2\2\2K+\3\2\2\2K.\3\2\2\2K\63\3\2\2\2K\66"+
		"\3\2\2\2K?\3\2\2\2KC\3\2\2\2KH\3\2\2\2L\b\3\2\2\2MQ\t\4\2\2NP\t\5\2\2"+
		"ON\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2R\n\3\2\2\2SQ\3\2\2\2TV\4\63;"+
		"\2UT\3\2\2\2VW\3\2\2\2WU\3\2\2\2WX\3\2\2\2X\\\3\2\2\2Y[\7\62\2\2ZY\3\2"+
		"\2\2[^\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]a\3\2\2\2^\\\3\2\2\2_a\7\62\2\2`"+
		"U\3\2\2\2`_\3\2\2\2a\f\3\2\2\2bc\t\6\2\2cd\3\2\2\2de\b\7\2\2e\16\3\2\2"+
		"\2\t\2\34KQW\\`\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}