// Generated from /Users/insomnia/GitHub/EasyAntlr/src/main/resources/SqlBase.g4 by ANTLR 4.7

package com.rann.basic;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SqlBaseParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, SELECT=11, FROM=12, ADD=13, AS=14, COMMA=15, SINGLEQUOTE=16, 
		LEFTBRACKET=17, RIGHTBRACKET=18, ALL=19, DISTINCT=20, WHERE=21, GROUP=22, 
		SOURCE=23, SINK=24, TMP=25, STREAM=26, BY=27, GROUPING=28, SETS=29, CUBE=30, 
		ROLLUP=31, ORDER=32, HAVING=33, LIMIT=34, AT=35, OR=36, AND=37, IN=38, 
		NOT=39, NO=40, EXISTS=41, BETWEEN=42, LIKE=43, RLIKE=44, IS=45, NULL=46, 
		TRUE=47, FALSE=48, NULLS=49, ASC=50, DESC=51, FOR=52, INTERVAL=53, CASE=54, 
		WHEN=55, THEN=56, ELSE=57, END=58, JOIN=59, CROSS=60, OUTER=61, INNER=62, 
		LEFT=63, SEMI=64, RIGHT=65, FULL=66, NATURAL=67, ON=68, LATERAL=69, WINDOW=70, 
		OVER=71, PARTITION=72, RANGE=73, ROWS=74, UNBOUNDED=75, PRECEDING=76, 
		FOLLOWING=77, CURRENT=78, FIRST=79, AFTER=80, LAST=81, ROW=82, WITH=83, 
		VALUES=84, CREATE=85, TABLE=86, VIEW=87, REPLACE=88, INSERT=89, DELETE=90, 
		INTO=91, MILLISECOND=92, DESCRIBE=93, EXPLAIN=94, FORMAT=95, LOGICAL=96, 
		CODEGEN=97, COST=98, CAST=99, SHOW=100, TABLES=101, COLUMNS=102, COLUMN=103, 
		USE=104, PARTITIONS=105, FUNCTIONS=106, DROP=107, UNION=108, EXCEPT=109, 
		SETMINUS=110, INTERSECT=111, TO=112, TABLESAMPLE=113, STRATIFY=114, ALTER=115, 
		RENAME=116, ARRAY=117, MAP=118, WATERMARK=119, STRUCT=120, MINUTE=121, 
		SECOND=122, HOUR=123, DAY=124, COMMENT=125, SET=126, TIMEMODEL=127, RESET=128, 
		DATA=129, START=130, TRANSACTION=131, COMMIT=132, ROLLBACK=133, MACRO=134, 
		IGNORE=135, IF=136, EQ=137, NSEQ=138, NEQ=139, NEQJ=140, LT=141, LTE=142, 
		GT=143, GTE=144, PLUS=145, MINUS=146, ASTERISK=147, SLASH=148, PERCENT=149, 
		DIV=150, TILDE=151, AMPERSAND=152, PIPE=153, HAT=154, PERCENTLIT=155, 
		BUCKET=156, OUT=157, OF=158, SORT=159, CLUSTER=160, DISTRIBUTE=161, OVERWRITE=162, 
		TRANSFORM=163, REDUCE=164, USING=165, SERDE=166, SERDEPROPERTIES=167, 
		RECORDREADER=168, RECORDWRITER=169, DELIMITED=170, FIELDS=171, TERMINATED=172, 
		COLLECTION=173, ITEMS=174, KEYS=175, ESCAPED=176, LINES=177, SEPARATED=178, 
		FUNCTION=179, EXTENDED=180, REFRESH=181, CLEAR=182, CACHE=183, UNCACHE=184, 
		LAZY=185, FORMATTED=186, GLOBAL=187, TEMPORARY=188, OPTIONS=189, UNSET=190, 
		TBLPROPERTIES=191, DBPROPERTIES=192, BUCKETS=193, SKEWED=194, STORED=195, 
		DIRECTORIES=196, LOCATION=197, EXCHANGE=198, ARCHIVE=199, UNARCHIVE=200, 
		FILEFORMAT=201, TOUCH=202, COMPACT=203, CONCATENATE=204, CHANGE=205, CASCADE=206, 
		RESTRICT=207, CLUSTERED=208, SORTED=209, PURGE=210, INPUTFORMAT=211, OUTPUTFORMAT=212, 
		DATABASE=213, DATABASES=214, DFS=215, TRUNCATE=216, ANALYZE=217, COMPUTE=218, 
		LIST=219, STATISTICS=220, PARTITIONED=221, EXTERNAL=222, DEFINED=223, 
		REVOKE=224, GRANT=225, LOCK=226, UNLOCK=227, MSCK=228, REPAIR=229, RECOVER=230, 
		EXPORT=231, IMPORT=232, LOAD=233, ROLE=234, ROLES=235, COMPACTIONS=236, 
		PRINCIPALS=237, TRANSACTIONS=238, INDEX=239, INDEXES=240, LOCKS=241, OPTION=242, 
		ANTI=243, LOCAL=244, INPATH=245, CURRENT_DATE=246, CURRENT_TIMESTAMP=247, 
		STRING=248, BIGINT_LITERAL=249, SMALLINT_LITERAL=250, TINYINT_LITERAL=251, 
		BYTELENGTH_LITERAL=252, INTEGER_VALUE=253, DECIMAL_VALUE=254, DOUBLE_LITERAL=255, 
		BIGDECIMAL_LITERAL=256, IDENTIFIER=257, BACKQUOTED_IDENTIFIER=258, SIMPLE_COMMENT=259, 
		BRACKETED_EMPTY_COMMENT=260, BRACKETED_COMMENT=261, WS=262, UNRECOGNIZED=263, 
		DELIMITER=264;
	public static final int
		RULE_singleStatement = 0, RULE_singleExpression = 1, RULE_singleTableIdentifier = 2, 
		RULE_singleFunctionIdentifier = 3, RULE_singleDataType = 4, RULE_statement = 5, 
		RULE_types = 6, RULE_sqlText = 7, RULE_comma = 8, RULE_singleQuote = 9, 
		RULE_integerValue = 10, RULE_brackets = 11, RULE_topics = 12, RULE_waterMarkTime = 13, 
		RULE_brokers = 14, RULE_encode = 15, RULE_parallelism = 16, RULE_createTableHeader = 17, 
		RULE_bucketSpec = 18, RULE_skewSpec = 19, RULE_locationSpec = 20, RULE_query = 21, 
		RULE_insertInto = 22, RULE_partitionSpecLocation = 23, RULE_partitionSpec = 24, 
		RULE_partitionVal = 25, RULE_describeFuncName = 26, RULE_describeColName = 27, 
		RULE_ctes = 28, RULE_namedQuery = 29, RULE_tableProvider = 30, RULE_tablePropertyList = 31, 
		RULE_tableProperty = 32, RULE_tablePropertyKey = 33, RULE_tablePropertyValue = 34, 
		RULE_constantList = 35, RULE_nestedConstantList = 36, RULE_createFileFormat = 37, 
		RULE_fileFormat = 38, RULE_storageHandler = 39, RULE_resource = 40, RULE_queryNoWith = 41, 
		RULE_queryOrganization = 42, RULE_multiInsertQueryBody = 43, RULE_queryTerm = 44, 
		RULE_queryPrimary = 45, RULE_sortItem = 46, RULE_querySpecification = 47, 
		RULE_hint = 48, RULE_hintStatement = 49, RULE_fromClause = 50, RULE_aggregation = 51, 
		RULE_groupingSet = 52, RULE_lateralView = 53, RULE_setQuantifier = 54, 
		RULE_relation = 55, RULE_joinRelation = 56, RULE_joinType = 57, RULE_joinCriteria = 58, 
		RULE_sample = 59, RULE_identifierList = 60, RULE_identifierSeq = 61, RULE_orderedIdentifierList = 62, 
		RULE_orderedIdentifier = 63, RULE_identifierCommentList = 64, RULE_identifierComment = 65, 
		RULE_relationPrimary = 66, RULE_inlineTable = 67, RULE_rowFormat = 68, 
		RULE_tableIdentifier = 69, RULE_functionIdentifier = 70, RULE_namedExpression = 71, 
		RULE_namedExpressionSeq = 72, RULE_expression = 73, RULE_booleanExpression = 74, 
		RULE_predicated = 75, RULE_predicate = 76, RULE_valueExpression = 77, 
		RULE_primaryExpression = 78, RULE_constant = 79, RULE_comparisonOperator = 80, 
		RULE_arithmeticOperator = 81, RULE_predicateOperator = 82, RULE_booleanValue = 83, 
		RULE_interval = 84, RULE_intervalField = 85, RULE_intervalValue = 86, 
		RULE_colPosition = 87, RULE_dataType = 88, RULE_colTypeList = 89, RULE_colType = 90, 
		RULE_identifierPath = 91, RULE_offset = 92, RULE_properiteyList = 93, 
		RULE_properitey = 94, RULE_identifierValue = 95, RULE_complexColTypeList = 96, 
		RULE_complexColType = 97, RULE_whenClause = 98, RULE_windows = 99, RULE_namedWindow = 100, 
		RULE_windowSpec = 101, RULE_windowFrame = 102, RULE_frameBound = 103, 
		RULE_qualifiedName = 104, RULE_columnName = 105, RULE_identifier = 106, 
		RULE_strictIdentifier = 107, RULE_quotedIdentifier = 108, RULE_number = 109, 
		RULE_nonReserved = 110;
	public static final String[] ruleNames = {
		"singleStatement", "singleExpression", "singleTableIdentifier", "singleFunctionIdentifier", 
		"singleDataType", "statement", "types", "sqlText", "comma", "singleQuote", 
		"integerValue", "brackets", "topics", "waterMarkTime", "brokers", "encode", 
		"parallelism", "createTableHeader", "bucketSpec", "skewSpec", "locationSpec", 
		"query", "insertInto", "partitionSpecLocation", "partitionSpec", "partitionVal", 
		"describeFuncName", "describeColName", "ctes", "namedQuery", "tableProvider", 
		"tablePropertyList", "tableProperty", "tablePropertyKey", "tablePropertyValue", 
		"constantList", "nestedConstantList", "createFileFormat", "fileFormat", 
		"storageHandler", "resource", "queryNoWith", "queryOrganization", "multiInsertQueryBody", 
		"queryTerm", "queryPrimary", "sortItem", "querySpecification", "hint", 
		"hintStatement", "fromClause", "aggregation", "groupingSet", "lateralView", 
		"setQuantifier", "relation", "joinRelation", "joinType", "joinCriteria", 
		"sample", "identifierList", "identifierSeq", "orderedIdentifierList", 
		"orderedIdentifier", "identifierCommentList", "identifierComment", "relationPrimary", 
		"inlineTable", "rowFormat", "tableIdentifier", "functionIdentifier", "namedExpression", 
		"namedExpressionSeq", "expression", "booleanExpression", "predicated", 
		"predicate", "valueExpression", "primaryExpression", "constant", "comparisonOperator", 
		"arithmeticOperator", "predicateOperator", "booleanValue", "interval", 
		"intervalField", "intervalValue", "colPosition", "dataType", "colTypeList", 
		"colType", "identifierPath", "offset", "properiteyList", "properitey", 
		"identifierValue", "complexColTypeList", "complexColType", "whenClause", 
		"windows", "namedWindow", "windowSpec", "windowFrame", "frameBound", "qualifiedName", 
		"columnName", "identifier", "strictIdentifier", "quotedIdentifier", "number", 
		"nonReserved"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'TIMESTAMP'", "';'", "'.'", "'/*+'", "'*/'", "'['", "']'", "'TO_TIMESTAMP'", 
		"'='", "':'", null, null, "'ADD'", "'AS'", "','", "'''", "'('", "')'", 
		"'ALL'", "'DISTINCT'", "'WHERE'", "'GROUP'", "'SOURCE'", "'SINK'", "'TMP'", 
		"'STREAM'", "'BY'", "'GROUPING'", "'SETS'", "'CUBE'", "'ROLLUP'", "'ORDER'", 
		"'HAVING'", "'LIMIT'", "'AT'", "'OR'", "'AND'", "'IN'", null, "'NO'", 
		"'EXISTS'", "'BETWEEN'", "'LIKE'", null, "'IS'", "'NULL'", "'TRUE'", "'FALSE'", 
		"'NULLS'", "'ASC'", "'DESC'", "'FOR'", "'INTERVAL'", "'CASE'", "'WHEN'", 
		"'THEN'", "'ELSE'", "'END'", "'JOIN'", "'CROSS'", "'OUTER'", "'INNER'", 
		"'LEFT'", "'SEMI'", "'RIGHT'", "'FULL'", "'NATURAL'", "'ON'", "'LATERAL'", 
		"'WINDOW'", "'OVER'", "'PARTITION'", "'RANGE'", "'ROWS'", "'UNBOUNDED'", 
		"'PRECEDING'", "'FOLLOWING'", "'CURRENT'", "'FIRST'", "'AFTER'", "'LAST'", 
		"'ROW'", "'WITH'", "'VALUES'", "'CREATE'", "'TABLE'", "'VIEW'", "'REPLACE'", 
		"'INSERT'", "'DELETE'", "'INTO'", null, "'DESCRIBE'", "'EXPLAIN'", "'FORMAT'", 
		"'LOGICAL'", "'CODEGEN'", "'COST'", "'CAST'", "'SHOW'", "'TABLES'", "'COLUMNS'", 
		"'COLUMN'", "'USE'", "'PARTITIONS'", "'FUNCTIONS'", "'DROP'", "'UNION'", 
		"'EXCEPT'", "'MINUS'", "'INTERSECT'", "'TO'", "'TABLESAMPLE'", "'STRATIFY'", 
		"'ALTER'", "'RENAME'", "'ARRAY'", "'MAP'", "'WATERMARK'", "'STRUCT'", 
		null, null, null, null, "'COMMENT'", "'SET'", "'TIMEMODEL'", "'RESET'", 
		"'DATA'", "'START'", "'TRANSACTION'", "'COMMIT'", "'ROLLBACK'", "'MACRO'", 
		"'IGNORE'", "'IF'", null, "'<=>'", "'<>'", "'!='", "'<'", null, "'>'", 
		null, "'+'", "'-'", "'*'", "'/'", "'%'", "'DIV'", "'~'", "'&'", "'|'", 
		"'^'", "'PERCENT'", "'BUCKET'", "'OUT'", "'OF'", "'SORT'", "'CLUSTER'", 
		"'DISTRIBUTE'", "'OVERWRITE'", "'TRANSFORM'", "'REDUCE'", "'USING'", "'SERDE'", 
		"'SERDEPROPERTIES'", "'RECORDREADER'", "'RECORDWRITER'", "'DELIMITED'", 
		"'FIELDS'", "'TERMINATED'", "'COLLECTION'", "'ITEMS'", "'KEYS'", "'ESCAPED'", 
		"'LINES'", "'SEPARATED'", "'FUNCTION'", "'EXTENDED'", "'REFRESH'", "'CLEAR'", 
		"'CACHE'", "'UNCACHE'", "'LAZY'", "'FORMATTED'", "'GLOBAL'", null, "'OPTIONS'", 
		"'UNSET'", "'TBLPROPERTIES'", "'DBPROPERTIES'", "'BUCKETS'", "'SKEWED'", 
		"'STORED'", "'DIRECTORIES'", "'LOCATION'", "'EXCHANGE'", "'ARCHIVE'", 
		"'UNARCHIVE'", "'FILEFORMAT'", "'TOUCH'", "'COMPACT'", "'CONCATENATE'", 
		"'CHANGE'", "'CASCADE'", "'RESTRICT'", "'CLUSTERED'", "'SORTED'", "'PURGE'", 
		"'INPUTFORMAT'", "'OUTPUTFORMAT'", null, null, "'DFS'", "'TRUNCATE'", 
		"'ANALYZE'", "'COMPUTE'", "'LIST'", "'STATISTICS'", "'PARTITIONED'", "'EXTERNAL'", 
		"'DEFINED'", "'REVOKE'", "'GRANT'", "'LOCK'", "'UNLOCK'", "'MSCK'", "'REPAIR'", 
		"'RECOVER'", "'EXPORT'", "'IMPORT'", "'LOAD'", "'ROLE'", "'ROLES'", "'COMPACTIONS'", 
		"'PRINCIPALS'", "'TRANSACTIONS'", "'INDEX'", "'INDEXES'", "'LOCKS'", "'OPTION'", 
		"'ANTI'", "'LOCAL'", "'INPATH'", "'CURRENT_DATE'", "'CURRENT_TIMESTAMP'", 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"'/**/'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, "SELECT", 
		"FROM", "ADD", "AS", "COMMA", "SINGLEQUOTE", "LEFTBRACKET", "RIGHTBRACKET", 
		"ALL", "DISTINCT", "WHERE", "GROUP", "SOURCE", "SINK", "TMP", "STREAM", 
		"BY", "GROUPING", "SETS", "CUBE", "ROLLUP", "ORDER", "HAVING", "LIMIT", 
		"AT", "OR", "AND", "IN", "NOT", "NO", "EXISTS", "BETWEEN", "LIKE", "RLIKE", 
		"IS", "NULL", "TRUE", "FALSE", "NULLS", "ASC", "DESC", "FOR", "INTERVAL", 
		"CASE", "WHEN", "THEN", "ELSE", "END", "JOIN", "CROSS", "OUTER", "INNER", 
		"LEFT", "SEMI", "RIGHT", "FULL", "NATURAL", "ON", "LATERAL", "WINDOW", 
		"OVER", "PARTITION", "RANGE", "ROWS", "UNBOUNDED", "PRECEDING", "FOLLOWING", 
		"CURRENT", "FIRST", "AFTER", "LAST", "ROW", "WITH", "VALUES", "CREATE", 
		"TABLE", "VIEW", "REPLACE", "INSERT", "DELETE", "INTO", "MILLISECOND", 
		"DESCRIBE", "EXPLAIN", "FORMAT", "LOGICAL", "CODEGEN", "COST", "CAST", 
		"SHOW", "TABLES", "COLUMNS", "COLUMN", "USE", "PARTITIONS", "FUNCTIONS", 
		"DROP", "UNION", "EXCEPT", "SETMINUS", "INTERSECT", "TO", "TABLESAMPLE", 
		"STRATIFY", "ALTER", "RENAME", "ARRAY", "MAP", "WATERMARK", "STRUCT", 
		"MINUTE", "SECOND", "HOUR", "DAY", "COMMENT", "SET", "TIMEMODEL", "RESET", 
		"DATA", "START", "TRANSACTION", "COMMIT", "ROLLBACK", "MACRO", "IGNORE", 
		"IF", "EQ", "NSEQ", "NEQ", "NEQJ", "LT", "LTE", "GT", "GTE", "PLUS", "MINUS", 
		"ASTERISK", "SLASH", "PERCENT", "DIV", "TILDE", "AMPERSAND", "PIPE", "HAT", 
		"PERCENTLIT", "BUCKET", "OUT", "OF", "SORT", "CLUSTER", "DISTRIBUTE", 
		"OVERWRITE", "TRANSFORM", "REDUCE", "USING", "SERDE", "SERDEPROPERTIES", 
		"RECORDREADER", "RECORDWRITER", "DELIMITED", "FIELDS", "TERMINATED", "COLLECTION", 
		"ITEMS", "KEYS", "ESCAPED", "LINES", "SEPARATED", "FUNCTION", "EXTENDED", 
		"REFRESH", "CLEAR", "CACHE", "UNCACHE", "LAZY", "FORMATTED", "GLOBAL", 
		"TEMPORARY", "OPTIONS", "UNSET", "TBLPROPERTIES", "DBPROPERTIES", "BUCKETS", 
		"SKEWED", "STORED", "DIRECTORIES", "LOCATION", "EXCHANGE", "ARCHIVE", 
		"UNARCHIVE", "FILEFORMAT", "TOUCH", "COMPACT", "CONCATENATE", "CHANGE", 
		"CASCADE", "RESTRICT", "CLUSTERED", "SORTED", "PURGE", "INPUTFORMAT", 
		"OUTPUTFORMAT", "DATABASE", "DATABASES", "DFS", "TRUNCATE", "ANALYZE", 
		"COMPUTE", "LIST", "STATISTICS", "PARTITIONED", "EXTERNAL", "DEFINED", 
		"REVOKE", "GRANT", "LOCK", "UNLOCK", "MSCK", "REPAIR", "RECOVER", "EXPORT", 
		"IMPORT", "LOAD", "ROLE", "ROLES", "COMPACTIONS", "PRINCIPALS", "TRANSACTIONS", 
		"INDEX", "INDEXES", "LOCKS", "OPTION", "ANTI", "LOCAL", "INPATH", "CURRENT_DATE", 
		"CURRENT_TIMESTAMP", "STRING", "BIGINT_LITERAL", "SMALLINT_LITERAL", "TINYINT_LITERAL", 
		"BYTELENGTH_LITERAL", "INTEGER_VALUE", "DECIMAL_VALUE", "DOUBLE_LITERAL", 
		"BIGDECIMAL_LITERAL", "IDENTIFIER", "BACKQUOTED_IDENTIFIER", "SIMPLE_COMMENT", 
		"BRACKETED_EMPTY_COMMENT", "BRACKETED_COMMENT", "WS", "UNRECOGNIZED", 
		"DELIMITER"
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

	@Override
	public String getGrammarFileName() { return "SqlBase.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	  /**
	   * Verify whether current token is a valid decimal token (which contains dot).
	   * Returns true if the character that follows the token is not a digit or letter or underscore.
	   *
	   * For example:
	   * For char stream "2.3", "2." is not a valid decimal token, because it is followed by digit '3'.
	   * For char stream "2.3_", "2.3" is not a valid decimal token, because it is followed by '_'.
	   * For char stream "2.3W", "2.3" is not a valid decimal token, because it is followed by 'W'.
	   * For char stream "12.0D 34.E2+0.12 "  12.0D is a valid decimal token because it is folllowed
	   * by a space. 34.E2 is a valid decimal token because it is followed by symbol '+'
	   * which is not a digit or letter or underscore.
	   */
	  public boolean isValidDecimal() {
	    int nextChar = _input.LA(1);
	    if (nextChar >= 'A' && nextChar <= 'Z' || nextChar >= '0' && nextChar <= '9' ||
	      nextChar == '_') {
	      return false;
	    } else {
	      return true;
	    }
	  }

	public SqlBaseParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class SingleStatementContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SqlBaseParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public SingleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSingleStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSingleStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSingleStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleStatementContext singleStatement() throws RecognitionException {
		SingleStatementContext _localctx = new SingleStatementContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_singleStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(222);
				statement();
				}
				}
				setState(225); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SELECT) | (1L << FROM) | (1L << LEFTBRACKET))) != 0) || ((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & ((1L << (WITH - 83)) | (1L << (VALUES - 83)) | (1L << (CREATE - 83)) | (1L << (TABLE - 83)) | (1L << (INSERT - 83)) | (1L << (MAP - 83)) | (1L << (SET - 83)))) != 0) || _la==REDUCE );
			setState(227);
			match(EOF);
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

	public static class SingleExpressionContext extends ParserRuleContext {
		public NamedExpressionContext namedExpression() {
			return getRuleContext(NamedExpressionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SqlBaseParser.EOF, 0); }
		public SingleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSingleExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSingleExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSingleExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleExpressionContext singleExpression() throws RecognitionException {
		SingleExpressionContext _localctx = new SingleExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_singleExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			namedExpression();
			setState(230);
			match(EOF);
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

	public static class SingleTableIdentifierContext extends ParserRuleContext {
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SqlBaseParser.EOF, 0); }
		public SingleTableIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleTableIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSingleTableIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSingleTableIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSingleTableIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleTableIdentifierContext singleTableIdentifier() throws RecognitionException {
		SingleTableIdentifierContext _localctx = new SingleTableIdentifierContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_singleTableIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			tableIdentifier();
			setState(233);
			match(EOF);
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

	public static class SingleFunctionIdentifierContext extends ParserRuleContext {
		public FunctionIdentifierContext functionIdentifier() {
			return getRuleContext(FunctionIdentifierContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SqlBaseParser.EOF, 0); }
		public SingleFunctionIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleFunctionIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSingleFunctionIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSingleFunctionIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSingleFunctionIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleFunctionIdentifierContext singleFunctionIdentifier() throws RecognitionException {
		SingleFunctionIdentifierContext _localctx = new SingleFunctionIdentifierContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_singleFunctionIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			functionIdentifier();
			setState(236);
			match(EOF);
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

	public static class SingleDataTypeContext extends ParserRuleContext {
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SqlBaseParser.EOF, 0); }
		public SingleDataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleDataType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSingleDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSingleDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSingleDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleDataTypeContext singleDataType() throws RecognitionException {
		SingleDataTypeContext _localctx = new SingleDataTypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_singleDataType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			dataType();
			setState(239);
			match(EOF);
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

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CreateInsertIntoContext extends StatementContext {
		public TerminalNode INSERT() { return getToken(SqlBaseParser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(SqlBaseParser.INTO, 0); }
		public List<TableIdentifierContext> tableIdentifier() {
			return getRuleContexts(TableIdentifierContext.class);
		}
		public TableIdentifierContext tableIdentifier(int i) {
			return getRuleContext(TableIdentifierContext.class,i);
		}
		public List<SqlTextContext> sqlText() {
			return getRuleContexts(SqlTextContext.class);
		}
		public SqlTextContext sqlText(int i) {
			return getRuleContext(SqlTextContext.class,i);
		}
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public CreateInsertIntoContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateInsertInto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateInsertInto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateInsertInto(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatementDefaultContext extends StatementContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public StatementDefaultContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterStatementDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitStatementDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitStatementDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateSourceStreamContext extends StatementContext {
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode STREAM() { return getToken(SqlBaseParser.STREAM, 0); }
		public TerminalNode SOURCE() { return getToken(SqlBaseParser.SOURCE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
		}
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public ProperiteyListContext properiteyList() {
			return getRuleContext(ProperiteyListContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public CreateSourceStreamContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateSourceStream(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateSourceStream(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateSourceStream(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetWaterMarkContext extends StatementContext {
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode WATERMARK() { return getToken(SqlBaseParser.WATERMARK, 0); }
		public TerminalNode RANGE() { return getToken(SqlBaseParser.RANGE, 0); }
		public List<TerminalNode> INTERVAL() { return getTokens(SqlBaseParser.INTERVAL); }
		public TerminalNode INTERVAL(int i) {
			return getToken(SqlBaseParser.INTERVAL, i);
		}
		public List<TerminalNode> INTEGER_VALUE() { return getTokens(SqlBaseParser.INTEGER_VALUE); }
		public TerminalNode INTEGER_VALUE(int i) {
			return getToken(SqlBaseParser.INTEGER_VALUE, i);
		}
		public List<WaterMarkTimeContext> waterMarkTime() {
			return getRuleContexts(WaterMarkTimeContext.class);
		}
		public WaterMarkTimeContext waterMarkTime(int i) {
			return getRuleContext(WaterMarkTimeContext.class,i);
		}
		public SetWaterMarkContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSetWaterMark(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSetWaterMark(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSetWaterMark(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateTmpStreamContext extends StatementContext {
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode STREAM() { return getToken(SqlBaseParser.STREAM, 0); }
		public TerminalNode TMP() { return getToken(SqlBaseParser.TMP, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
		}
		public CreateTmpStreamContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateTmpStream(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateTmpStream(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateTmpStream(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateSinkStreamContext extends StatementContext {
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode STREAM() { return getToken(SqlBaseParser.STREAM, 0); }
		public TerminalNode SINK() { return getToken(SqlBaseParser.SINK, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public ProperiteyListContext properiteyList() {
			return getRuleContext(ProperiteyListContext.class,0);
		}
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
		}
		public CreateSinkStreamContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateSinkStream(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateSinkStream(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateSinkStream(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetTimeModelContext extends StatementContext {
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode TIMEMODEL() { return getToken(SqlBaseParser.TIMEMODEL, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public SetTimeModelContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSetTimeModel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSetTimeModel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSetTimeModel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_statement);
		int _la;
		try {
			setState(315);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new StatementDefaultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(241);
				query();
				}
				break;
			case 2:
				_localctx = new CreateSourceStreamContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(242);
				match(CREATE);
				setState(243);
				match(STREAM);
				setState(244);
				match(SOURCE);
				setState(245);
				tableIdentifier();
				setState(246);
				match(LEFTBRACKET);
				setState(247);
				colTypeList();
				setState(248);
				match(RIGHTBRACKET);
				setState(249);
				match(WITH);
				setState(250);
				match(LEFTBRACKET);
				setState(251);
				properiteyList();
				setState(252);
				match(RIGHTBRACKET);
				setState(256);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(253);
					match(T__0);
					setState(254);
					match(BY);
					setState(255);
					identifier();
					}
				}

				setState(258);
				match(T__1);
				}
				break;
			case 3:
				_localctx = new CreateSinkStreamContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(260);
				match(CREATE);
				setState(261);
				match(STREAM);
				setState(262);
				match(SINK);
				setState(263);
				tableIdentifier();
				setState(268);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFTBRACKET) {
					{
					setState(264);
					match(LEFTBRACKET);
					setState(265);
					colTypeList();
					setState(266);
					match(RIGHTBRACKET);
					}
				}

				setState(270);
				match(WITH);
				setState(271);
				match(LEFTBRACKET);
				setState(272);
				properiteyList();
				setState(273);
				match(RIGHTBRACKET);
				setState(274);
				match(T__1);
				}
				break;
			case 4:
				_localctx = new CreateTmpStreamContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(276);
				match(CREATE);
				setState(277);
				match(STREAM);
				setState(278);
				match(TMP);
				setState(279);
				tableIdentifier();
				setState(280);
				match(LEFTBRACKET);
				setState(281);
				colTypeList();
				setState(282);
				match(RIGHTBRACKET);
				setState(283);
				match(T__1);
				}
				break;
			case 5:
				_localctx = new CreateInsertIntoContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(285);
				match(INSERT);
				setState(286);
				match(INTO);
				setState(287);
				tableIdentifier();
				setState(288);
				sqlText();
				setState(289);
				match(FROM);
				setState(290);
				tableIdentifier();
				setState(292);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 11)) & ~0x3f) == 0 && ((1L << (_la - 11)) & ((1L << (SELECT - 11)) | (1L << (FROM - 11)) | (1L << (ADD - 11)) | (1L << (AS - 11)) | (1L << (COMMA - 11)) | (1L << (LEFTBRACKET - 11)) | (1L << (RIGHTBRACKET - 11)) | (1L << (ALL - 11)) | (1L << (DISTINCT - 11)) | (1L << (WHERE - 11)) | (1L << (GROUP - 11)) | (1L << (BY - 11)) | (1L << (GROUPING - 11)) | (1L << (SETS - 11)) | (1L << (CUBE - 11)) | (1L << (ROLLUP - 11)) | (1L << (ORDER - 11)) | (1L << (HAVING - 11)) | (1L << (LIMIT - 11)) | (1L << (AT - 11)) | (1L << (OR - 11)) | (1L << (AND - 11)) | (1L << (IN - 11)) | (1L << (NOT - 11)) | (1L << (NO - 11)) | (1L << (EXISTS - 11)) | (1L << (BETWEEN - 11)) | (1L << (LIKE - 11)) | (1L << (RLIKE - 11)) | (1L << (IS - 11)) | (1L << (NULL - 11)) | (1L << (TRUE - 11)) | (1L << (FALSE - 11)) | (1L << (NULLS - 11)) | (1L << (ASC - 11)) | (1L << (DESC - 11)) | (1L << (FOR - 11)) | (1L << (INTERVAL - 11)) | (1L << (CASE - 11)) | (1L << (WHEN - 11)) | (1L << (THEN - 11)) | (1L << (ELSE - 11)) | (1L << (END - 11)) | (1L << (JOIN - 11)) | (1L << (CROSS - 11)) | (1L << (OUTER - 11)) | (1L << (INNER - 11)) | (1L << (LEFT - 11)) | (1L << (SEMI - 11)) | (1L << (RIGHT - 11)) | (1L << (FULL - 11)) | (1L << (NATURAL - 11)) | (1L << (ON - 11)) | (1L << (LATERAL - 11)) | (1L << (WINDOW - 11)) | (1L << (OVER - 11)) | (1L << (PARTITION - 11)) | (1L << (RANGE - 11)) | (1L << (ROWS - 11)))) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (UNBOUNDED - 75)) | (1L << (PRECEDING - 75)) | (1L << (FOLLOWING - 75)) | (1L << (CURRENT - 75)) | (1L << (FIRST - 75)) | (1L << (AFTER - 75)) | (1L << (LAST - 75)) | (1L << (ROW - 75)) | (1L << (WITH - 75)) | (1L << (VALUES - 75)) | (1L << (CREATE - 75)) | (1L << (TABLE - 75)) | (1L << (VIEW - 75)) | (1L << (REPLACE - 75)) | (1L << (INSERT - 75)) | (1L << (DELETE - 75)) | (1L << (INTO - 75)) | (1L << (MILLISECOND - 75)) | (1L << (DESCRIBE - 75)) | (1L << (EXPLAIN - 75)) | (1L << (FORMAT - 75)) | (1L << (LOGICAL - 75)) | (1L << (CODEGEN - 75)) | (1L << (COST - 75)) | (1L << (CAST - 75)) | (1L << (SHOW - 75)) | (1L << (TABLES - 75)) | (1L << (COLUMNS - 75)) | (1L << (COLUMN - 75)) | (1L << (USE - 75)) | (1L << (PARTITIONS - 75)) | (1L << (FUNCTIONS - 75)) | (1L << (DROP - 75)) | (1L << (UNION - 75)) | (1L << (EXCEPT - 75)) | (1L << (SETMINUS - 75)) | (1L << (INTERSECT - 75)) | (1L << (TO - 75)) | (1L << (TABLESAMPLE - 75)) | (1L << (STRATIFY - 75)) | (1L << (ALTER - 75)) | (1L << (RENAME - 75)) | (1L << (ARRAY - 75)) | (1L << (MAP - 75)) | (1L << (STRUCT - 75)) | (1L << (MINUTE - 75)) | (1L << (SECOND - 75)) | (1L << (HOUR - 75)) | (1L << (DAY - 75)) | (1L << (COMMENT - 75)) | (1L << (SET - 75)) | (1L << (RESET - 75)) | (1L << (DATA - 75)) | (1L << (START - 75)) | (1L << (TRANSACTION - 75)) | (1L << (COMMIT - 75)) | (1L << (ROLLBACK - 75)) | (1L << (MACRO - 75)) | (1L << (IGNORE - 75)) | (1L << (IF - 75)))) != 0) || ((((_la - 147)) & ~0x3f) == 0 && ((1L << (_la - 147)) & ((1L << (ASTERISK - 147)) | (1L << (DIV - 147)) | (1L << (PERCENTLIT - 147)) | (1L << (BUCKET - 147)) | (1L << (OUT - 147)) | (1L << (OF - 147)) | (1L << (SORT - 147)) | (1L << (CLUSTER - 147)) | (1L << (DISTRIBUTE - 147)) | (1L << (OVERWRITE - 147)) | (1L << (TRANSFORM - 147)) | (1L << (REDUCE - 147)) | (1L << (USING - 147)) | (1L << (SERDE - 147)) | (1L << (SERDEPROPERTIES - 147)) | (1L << (RECORDREADER - 147)) | (1L << (RECORDWRITER - 147)) | (1L << (DELIMITED - 147)) | (1L << (FIELDS - 147)) | (1L << (TERMINATED - 147)) | (1L << (COLLECTION - 147)) | (1L << (ITEMS - 147)) | (1L << (KEYS - 147)) | (1L << (ESCAPED - 147)) | (1L << (LINES - 147)) | (1L << (SEPARATED - 147)) | (1L << (FUNCTION - 147)) | (1L << (EXTENDED - 147)) | (1L << (REFRESH - 147)) | (1L << (CLEAR - 147)) | (1L << (CACHE - 147)) | (1L << (UNCACHE - 147)) | (1L << (LAZY - 147)) | (1L << (FORMATTED - 147)) | (1L << (GLOBAL - 147)) | (1L << (TEMPORARY - 147)) | (1L << (OPTIONS - 147)) | (1L << (UNSET - 147)) | (1L << (TBLPROPERTIES - 147)) | (1L << (DBPROPERTIES - 147)) | (1L << (BUCKETS - 147)) | (1L << (SKEWED - 147)) | (1L << (STORED - 147)) | (1L << (DIRECTORIES - 147)) | (1L << (LOCATION - 147)) | (1L << (EXCHANGE - 147)) | (1L << (ARCHIVE - 147)) | (1L << (UNARCHIVE - 147)) | (1L << (FILEFORMAT - 147)) | (1L << (TOUCH - 147)) | (1L << (COMPACT - 147)) | (1L << (CONCATENATE - 147)) | (1L << (CHANGE - 147)) | (1L << (CASCADE - 147)) | (1L << (RESTRICT - 147)) | (1L << (CLUSTERED - 147)) | (1L << (SORTED - 147)) | (1L << (PURGE - 147)))) != 0) || ((((_la - 211)) & ~0x3f) == 0 && ((1L << (_la - 211)) & ((1L << (INPUTFORMAT - 211)) | (1L << (OUTPUTFORMAT - 211)) | (1L << (DATABASE - 211)) | (1L << (DATABASES - 211)) | (1L << (DFS - 211)) | (1L << (TRUNCATE - 211)) | (1L << (ANALYZE - 211)) | (1L << (COMPUTE - 211)) | (1L << (LIST - 211)) | (1L << (STATISTICS - 211)) | (1L << (PARTITIONED - 211)) | (1L << (EXTERNAL - 211)) | (1L << (DEFINED - 211)) | (1L << (REVOKE - 211)) | (1L << (GRANT - 211)) | (1L << (LOCK - 211)) | (1L << (UNLOCK - 211)) | (1L << (MSCK - 211)) | (1L << (REPAIR - 211)) | (1L << (RECOVER - 211)) | (1L << (EXPORT - 211)) | (1L << (IMPORT - 211)) | (1L << (LOAD - 211)) | (1L << (ROLE - 211)) | (1L << (ROLES - 211)) | (1L << (COMPACTIONS - 211)) | (1L << (PRINCIPALS - 211)) | (1L << (TRANSACTIONS - 211)) | (1L << (INDEX - 211)) | (1L << (INDEXES - 211)) | (1L << (LOCKS - 211)) | (1L << (OPTION - 211)) | (1L << (ANTI - 211)) | (1L << (LOCAL - 211)) | (1L << (INPATH - 211)) | (1L << (CURRENT_DATE - 211)) | (1L << (CURRENT_TIMESTAMP - 211)) | (1L << (STRING - 211)) | (1L << (INTEGER_VALUE - 211)) | (1L << (IDENTIFIER - 211)) | (1L << (BACKQUOTED_IDENTIFIER - 211)))) != 0)) {
					{
					setState(291);
					sqlText();
					}
				}

				setState(294);
				match(T__1);
				}
				break;
			case 6:
				_localctx = new SetTimeModelContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(296);
				match(SET);
				setState(297);
				match(TIMEMODEL);
				setState(298);
				identifier();
				setState(299);
				match(T__1);
				}
				break;
			case 7:
				_localctx = new SetWaterMarkContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(301);
				match(SET);
				setState(302);
				match(WATERMARK);
				setState(303);
				match(LEFTBRACKET);
				setState(304);
				match(RANGE);
				setState(305);
				match(INTERVAL);
				setState(306);
				match(INTEGER_VALUE);
				setState(307);
				waterMarkTime();
				setState(308);
				match(COMMA);
				setState(309);
				match(INTERVAL);
				setState(310);
				match(INTEGER_VALUE);
				setState(311);
				waterMarkTime();
				setState(312);
				match(RIGHTBRACKET);
				setState(313);
				match(T__1);
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

	public static class TypesContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_types; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTypes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTypes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTypes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypesContext types() throws RecognitionException {
		TypesContext _localctx = new TypesContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_types);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			identifier();
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

	public static class SqlTextContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<CommaContext> comma() {
			return getRuleContexts(CommaContext.class);
		}
		public CommaContext comma(int i) {
			return getRuleContext(CommaContext.class,i);
		}
		public List<BracketsContext> brackets() {
			return getRuleContexts(BracketsContext.class);
		}
		public BracketsContext brackets(int i) {
			return getRuleContext(BracketsContext.class,i);
		}
		public List<SingleQuoteContext> singleQuote() {
			return getRuleContexts(SingleQuoteContext.class);
		}
		public SingleQuoteContext singleQuote(int i) {
			return getRuleContext(SingleQuoteContext.class,i);
		}
		public List<IntegerValueContext> integerValue() {
			return getRuleContexts(IntegerValueContext.class);
		}
		public IntegerValueContext integerValue(int i) {
			return getRuleContext(IntegerValueContext.class,i);
		}
		public List<WaterMarkTimeContext> waterMarkTime() {
			return getRuleContexts(WaterMarkTimeContext.class);
		}
		public WaterMarkTimeContext waterMarkTime(int i) {
			return getRuleContext(WaterMarkTimeContext.class,i);
		}
		public SqlTextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlText; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSqlText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSqlText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSqlText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlTextContext sqlText() throws RecognitionException {
		SqlTextContext _localctx = new SqlTextContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_sqlText);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(325); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(325);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						setState(319);
						identifier();
						}
						break;
					case 2:
						{
						setState(320);
						comma();
						}
						break;
					case 3:
						{
						setState(321);
						brackets();
						}
						break;
					case 4:
						{
						setState(322);
						singleQuote();
						}
						break;
					case 5:
						{
						setState(323);
						integerValue();
						}
						break;
					case 6:
						{
						setState(324);
						waterMarkTime();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(327); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

	public static class CommaContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(SqlBaseParser.COMMA, 0); }
		public CommaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterComma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitComma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitComma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommaContext comma() throws RecognitionException {
		CommaContext _localctx = new CommaContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_comma);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			_la = _input.LA(1);
			if ( !(_la==COMMA || _la==ASTERISK) ) {
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

	public static class SingleQuoteContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public SingleQuoteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleQuote; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSingleQuote(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSingleQuote(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSingleQuote(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleQuoteContext singleQuote() throws RecognitionException {
		SingleQuoteContext _localctx = new SingleQuoteContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_singleQuote);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			match(STRING);
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

	public static class IntegerValueContext extends ParserRuleContext {
		public TerminalNode INTEGER_VALUE() { return getToken(SqlBaseParser.INTEGER_VALUE, 0); }
		public IntegerValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIntegerValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIntegerValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitIntegerValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerValueContext integerValue() throws RecognitionException {
		IntegerValueContext _localctx = new IntegerValueContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_integerValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			match(INTEGER_VALUE);
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

	public static class BracketsContext extends ParserRuleContext {
		public TerminalNode LEFTBRACKET() { return getToken(SqlBaseParser.LEFTBRACKET, 0); }
		public TerminalNode RIGHTBRACKET() { return getToken(SqlBaseParser.RIGHTBRACKET, 0); }
		public BracketsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_brackets; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterBrackets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitBrackets(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitBrackets(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BracketsContext brackets() throws RecognitionException {
		BracketsContext _localctx = new BracketsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_brackets);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			_la = _input.LA(1);
			if ( !(_la==LEFTBRACKET || _la==RIGHTBRACKET) ) {
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

	public static class TopicsContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TopicsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topics; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTopics(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTopics(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTopics(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TopicsContext topics() throws RecognitionException {
		TopicsContext _localctx = new TopicsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_topics);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			identifier();
			setState(342);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(338);
				match(COMMA);
				setState(339);
				identifier();
				}
				}
				setState(344);
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

	public static class WaterMarkTimeContext extends ParserRuleContext {
		public TerminalNode MINUTE() { return getToken(SqlBaseParser.MINUTE, 0); }
		public TerminalNode MILLISECOND() { return getToken(SqlBaseParser.MILLISECOND, 0); }
		public TerminalNode SECOND() { return getToken(SqlBaseParser.SECOND, 0); }
		public TerminalNode HOUR() { return getToken(SqlBaseParser.HOUR, 0); }
		public TerminalNode DAY() { return getToken(SqlBaseParser.DAY, 0); }
		public WaterMarkTimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_waterMarkTime; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterWaterMarkTime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitWaterMarkTime(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitWaterMarkTime(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WaterMarkTimeContext waterMarkTime() throws RecognitionException {
		WaterMarkTimeContext _localctx = new WaterMarkTimeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_waterMarkTime);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			_la = _input.LA(1);
			if ( !(((((_la - 92)) & ~0x3f) == 0 && ((1L << (_la - 92)) & ((1L << (MILLISECOND - 92)) | (1L << (MINUTE - 92)) | (1L << (SECOND - 92)) | (1L << (HOUR - 92)) | (1L << (DAY - 92)))) != 0)) ) {
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

	public static class BrokersContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public BrokersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_brokers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterBrokers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitBrokers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitBrokers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BrokersContext brokers() throws RecognitionException {
		BrokersContext _localctx = new BrokersContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_brokers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			identifier();
			setState(352);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(348);
				match(COMMA);
				setState(349);
				identifier();
				}
				}
				setState(354);
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

	public static class EncodeContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public EncodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_encode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterEncode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitEncode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitEncode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EncodeContext encode() throws RecognitionException {
		EncodeContext _localctx = new EncodeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_encode);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			identifier();
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

	public static class ParallelismContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ParallelismContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parallelism; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterParallelism(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitParallelism(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitParallelism(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParallelismContext parallelism() throws RecognitionException {
		ParallelismContext _localctx = new ParallelismContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_parallelism);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			identifier();
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

	public static class CreateTableHeaderContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode TEMPORARY() { return getToken(SqlBaseParser.TEMPORARY, 0); }
		public TerminalNode EXTERNAL() { return getToken(SqlBaseParser.EXTERNAL, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public CreateTableHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTableHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateTableHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateTableHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateTableHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateTableHeaderContext createTableHeader() throws RecognitionException {
		CreateTableHeaderContext _localctx = new CreateTableHeaderContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_createTableHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			match(CREATE);
			setState(361);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TEMPORARY) {
				{
				setState(360);
				match(TEMPORARY);
				}
			}

			setState(364);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTERNAL) {
				{
				setState(363);
				match(EXTERNAL);
				}
			}

			setState(366);
			match(TABLE);
			setState(370);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(367);
				match(IF);
				setState(368);
				match(NOT);
				setState(369);
				match(EXISTS);
				}
				break;
			}
			setState(372);
			tableIdentifier();
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

	public static class BucketSpecContext extends ParserRuleContext {
		public TerminalNode CLUSTERED() { return getToken(SqlBaseParser.CLUSTERED, 0); }
		public List<TerminalNode> BY() { return getTokens(SqlBaseParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(SqlBaseParser.BY, i);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode INTO() { return getToken(SqlBaseParser.INTO, 0); }
		public TerminalNode INTEGER_VALUE() { return getToken(SqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode BUCKETS() { return getToken(SqlBaseParser.BUCKETS, 0); }
		public TerminalNode SORTED() { return getToken(SqlBaseParser.SORTED, 0); }
		public OrderedIdentifierListContext orderedIdentifierList() {
			return getRuleContext(OrderedIdentifierListContext.class,0);
		}
		public BucketSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bucketSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterBucketSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitBucketSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitBucketSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BucketSpecContext bucketSpec() throws RecognitionException {
		BucketSpecContext _localctx = new BucketSpecContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_bucketSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			match(CLUSTERED);
			setState(375);
			match(BY);
			setState(376);
			identifierList();
			setState(380);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SORTED) {
				{
				setState(377);
				match(SORTED);
				setState(378);
				match(BY);
				setState(379);
				orderedIdentifierList();
				}
			}

			setState(382);
			match(INTO);
			setState(383);
			match(INTEGER_VALUE);
			setState(384);
			match(BUCKETS);
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

	public static class SkewSpecContext extends ParserRuleContext {
		public TerminalNode SKEWED() { return getToken(SqlBaseParser.SKEWED, 0); }
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public ConstantListContext constantList() {
			return getRuleContext(ConstantListContext.class,0);
		}
		public NestedConstantListContext nestedConstantList() {
			return getRuleContext(NestedConstantListContext.class,0);
		}
		public TerminalNode STORED() { return getToken(SqlBaseParser.STORED, 0); }
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public TerminalNode DIRECTORIES() { return getToken(SqlBaseParser.DIRECTORIES, 0); }
		public SkewSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_skewSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSkewSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSkewSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSkewSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SkewSpecContext skewSpec() throws RecognitionException {
		SkewSpecContext _localctx = new SkewSpecContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_skewSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			match(SKEWED);
			setState(387);
			match(BY);
			setState(388);
			identifierList();
			setState(389);
			match(ON);
			setState(392);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(390);
				constantList();
				}
				break;
			case 2:
				{
				setState(391);
				nestedConstantList();
				}
				break;
			}
			setState(397);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STORED) {
				{
				setState(394);
				match(STORED);
				setState(395);
				match(AS);
				setState(396);
				match(DIRECTORIES);
				}
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

	public static class LocationSpecContext extends ParserRuleContext {
		public TerminalNode LOCATION() { return getToken(SqlBaseParser.LOCATION, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public LocationSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_locationSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterLocationSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitLocationSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitLocationSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocationSpecContext locationSpec() throws RecognitionException {
		LocationSpecContext _localctx = new LocationSpecContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_locationSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
			match(LOCATION);
			setState(400);
			match(STRING);
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

	public static class QueryContext extends ParserRuleContext {
		public QueryNoWithContext queryNoWith() {
			return getRuleContext(QueryNoWithContext.class,0);
		}
		public CtesContext ctes() {
			return getRuleContext(CtesContext.class,0);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_query);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(402);
				ctes();
				}
			}

			setState(405);
			queryNoWith();
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

	public static class InsertIntoContext extends ParserRuleContext {
		public TerminalNode INSERT() { return getToken(SqlBaseParser.INSERT, 0); }
		public TerminalNode OVERWRITE() { return getToken(SqlBaseParser.OVERWRITE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TerminalNode INTO() { return getToken(SqlBaseParser.INTO, 0); }
		public InsertIntoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertInto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterInsertInto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitInsertInto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitInsertInto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsertIntoContext insertInto() throws RecognitionException {
		InsertIntoContext _localctx = new InsertIntoContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_insertInto);
		int _la;
		try {
			setState(427);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(407);
				match(INSERT);
				setState(408);
				match(OVERWRITE);
				setState(409);
				match(TABLE);
				setState(410);
				tableIdentifier();
				setState(417);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(411);
					partitionSpec();
					setState(415);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==IF) {
						{
						setState(412);
						match(IF);
						setState(413);
						match(NOT);
						setState(414);
						match(EXISTS);
						}
					}

					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(419);
				match(INSERT);
				setState(420);
				match(INTO);
				setState(422);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(421);
					match(TABLE);
					}
					break;
				}
				setState(425);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(424);
					tableIdentifier();
					}
					break;
				}
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

	public static class PartitionSpecLocationContext extends ParserRuleContext {
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public LocationSpecContext locationSpec() {
			return getRuleContext(LocationSpecContext.class,0);
		}
		public PartitionSpecLocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionSpecLocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPartitionSpecLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPartitionSpecLocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPartitionSpecLocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartitionSpecLocationContext partitionSpecLocation() throws RecognitionException {
		PartitionSpecLocationContext _localctx = new PartitionSpecLocationContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_partitionSpecLocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			partitionSpec();
			setState(431);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LOCATION) {
				{
				setState(430);
				locationSpec();
				}
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

	public static class PartitionSpecContext extends ParserRuleContext {
		public TerminalNode PARTITION() { return getToken(SqlBaseParser.PARTITION, 0); }
		public List<PartitionValContext> partitionVal() {
			return getRuleContexts(PartitionValContext.class);
		}
		public PartitionValContext partitionVal(int i) {
			return getRuleContext(PartitionValContext.class,i);
		}
		public PartitionSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPartitionSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPartitionSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPartitionSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartitionSpecContext partitionSpec() throws RecognitionException {
		PartitionSpecContext _localctx = new PartitionSpecContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_partitionSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
			match(PARTITION);
			setState(434);
			match(LEFTBRACKET);
			setState(435);
			partitionVal();
			setState(440);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(436);
				match(COMMA);
				setState(437);
				partitionVal();
				}
				}
				setState(442);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(443);
			match(RIGHTBRACKET);
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

	public static class PartitionValContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode EQ() { return getToken(SqlBaseParser.EQ, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public PartitionValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionVal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPartitionVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPartitionVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPartitionVal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartitionValContext partitionVal() throws RecognitionException {
		PartitionValContext _localctx = new PartitionValContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_partitionVal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			identifier();
			setState(448);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(446);
				match(EQ);
				setState(447);
				constant();
				}
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

	public static class DescribeFuncNameContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public ArithmeticOperatorContext arithmeticOperator() {
			return getRuleContext(ArithmeticOperatorContext.class,0);
		}
		public PredicateOperatorContext predicateOperator() {
			return getRuleContext(PredicateOperatorContext.class,0);
		}
		public DescribeFuncNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_describeFuncName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDescribeFuncName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDescribeFuncName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDescribeFuncName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DescribeFuncNameContext describeFuncName() throws RecognitionException {
		DescribeFuncNameContext _localctx = new DescribeFuncNameContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_describeFuncName);
		try {
			setState(455);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(450);
				qualifiedName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(451);
				match(STRING);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(452);
				comparisonOperator();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(453);
				arithmeticOperator();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(454);
				predicateOperator();
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

	public static class DescribeColNameContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> STRING() { return getTokens(SqlBaseParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(SqlBaseParser.STRING, i);
		}
		public DescribeColNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_describeColName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDescribeColName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDescribeColName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDescribeColName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DescribeColNameContext describeColName() throws RecognitionException {
		DescribeColNameContext _localctx = new DescribeColNameContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_describeColName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
			identifier();
			setState(465);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(458);
				match(T__2);
				setState(461);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SELECT:
				case FROM:
				case ADD:
				case AS:
				case ALL:
				case DISTINCT:
				case WHERE:
				case GROUP:
				case BY:
				case GROUPING:
				case SETS:
				case CUBE:
				case ROLLUP:
				case ORDER:
				case HAVING:
				case LIMIT:
				case AT:
				case OR:
				case AND:
				case IN:
				case NOT:
				case NO:
				case EXISTS:
				case BETWEEN:
				case LIKE:
				case RLIKE:
				case IS:
				case NULL:
				case TRUE:
				case FALSE:
				case NULLS:
				case ASC:
				case DESC:
				case FOR:
				case INTERVAL:
				case CASE:
				case WHEN:
				case THEN:
				case ELSE:
				case END:
				case JOIN:
				case CROSS:
				case OUTER:
				case INNER:
				case LEFT:
				case SEMI:
				case RIGHT:
				case FULL:
				case NATURAL:
				case ON:
				case LATERAL:
				case WINDOW:
				case OVER:
				case PARTITION:
				case RANGE:
				case ROWS:
				case UNBOUNDED:
				case PRECEDING:
				case FOLLOWING:
				case CURRENT:
				case FIRST:
				case AFTER:
				case LAST:
				case ROW:
				case WITH:
				case VALUES:
				case CREATE:
				case TABLE:
				case VIEW:
				case REPLACE:
				case INSERT:
				case DELETE:
				case INTO:
				case DESCRIBE:
				case EXPLAIN:
				case FORMAT:
				case LOGICAL:
				case CODEGEN:
				case COST:
				case CAST:
				case SHOW:
				case TABLES:
				case COLUMNS:
				case COLUMN:
				case USE:
				case PARTITIONS:
				case FUNCTIONS:
				case DROP:
				case UNION:
				case EXCEPT:
				case SETMINUS:
				case INTERSECT:
				case TO:
				case TABLESAMPLE:
				case STRATIFY:
				case ALTER:
				case RENAME:
				case ARRAY:
				case MAP:
				case STRUCT:
				case COMMENT:
				case SET:
				case RESET:
				case DATA:
				case START:
				case TRANSACTION:
				case COMMIT:
				case ROLLBACK:
				case MACRO:
				case IGNORE:
				case IF:
				case DIV:
				case PERCENTLIT:
				case BUCKET:
				case OUT:
				case OF:
				case SORT:
				case CLUSTER:
				case DISTRIBUTE:
				case OVERWRITE:
				case TRANSFORM:
				case REDUCE:
				case USING:
				case SERDE:
				case SERDEPROPERTIES:
				case RECORDREADER:
				case RECORDWRITER:
				case DELIMITED:
				case FIELDS:
				case TERMINATED:
				case COLLECTION:
				case ITEMS:
				case KEYS:
				case ESCAPED:
				case LINES:
				case SEPARATED:
				case FUNCTION:
				case EXTENDED:
				case REFRESH:
				case CLEAR:
				case CACHE:
				case UNCACHE:
				case LAZY:
				case FORMATTED:
				case GLOBAL:
				case TEMPORARY:
				case OPTIONS:
				case UNSET:
				case TBLPROPERTIES:
				case DBPROPERTIES:
				case BUCKETS:
				case SKEWED:
				case STORED:
				case DIRECTORIES:
				case LOCATION:
				case EXCHANGE:
				case ARCHIVE:
				case UNARCHIVE:
				case FILEFORMAT:
				case TOUCH:
				case COMPACT:
				case CONCATENATE:
				case CHANGE:
				case CASCADE:
				case RESTRICT:
				case CLUSTERED:
				case SORTED:
				case PURGE:
				case INPUTFORMAT:
				case OUTPUTFORMAT:
				case DATABASE:
				case DATABASES:
				case DFS:
				case TRUNCATE:
				case ANALYZE:
				case COMPUTE:
				case LIST:
				case STATISTICS:
				case PARTITIONED:
				case EXTERNAL:
				case DEFINED:
				case REVOKE:
				case GRANT:
				case LOCK:
				case UNLOCK:
				case MSCK:
				case REPAIR:
				case RECOVER:
				case EXPORT:
				case IMPORT:
				case LOAD:
				case ROLE:
				case ROLES:
				case COMPACTIONS:
				case PRINCIPALS:
				case TRANSACTIONS:
				case INDEX:
				case INDEXES:
				case LOCKS:
				case OPTION:
				case ANTI:
				case LOCAL:
				case INPATH:
				case CURRENT_DATE:
				case CURRENT_TIMESTAMP:
				case INTEGER_VALUE:
				case IDENTIFIER:
				case BACKQUOTED_IDENTIFIER:
					{
					setState(459);
					identifier();
					}
					break;
				case STRING:
					{
					setState(460);
					match(STRING);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(467);
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

	public static class CtesContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public List<NamedQueryContext> namedQuery() {
			return getRuleContexts(NamedQueryContext.class);
		}
		public NamedQueryContext namedQuery(int i) {
			return getRuleContext(NamedQueryContext.class,i);
		}
		public CtesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ctes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCtes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCtes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCtes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CtesContext ctes() throws RecognitionException {
		CtesContext _localctx = new CtesContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_ctes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(468);
			match(WITH);
			setState(469);
			namedQuery();
			setState(474);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(470);
				match(COMMA);
				setState(471);
				namedQuery();
				}
				}
				setState(476);
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

	public static class NamedQueryContext extends ParserRuleContext {
		public IdentifierContext name;
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public NamedQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNamedQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNamedQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNamedQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedQueryContext namedQuery() throws RecognitionException {
		NamedQueryContext _localctx = new NamedQueryContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_namedQuery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(477);
			((NamedQueryContext)_localctx).name = identifier();
			setState(479);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(478);
				match(AS);
				}
			}

			setState(481);
			match(LEFTBRACKET);
			setState(482);
			query();
			setState(483);
			match(RIGHTBRACKET);
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

	public static class TableProviderContext extends ParserRuleContext {
		public TerminalNode USING() { return getToken(SqlBaseParser.USING, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TableProviderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableProvider; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTableProvider(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTableProvider(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTableProvider(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableProviderContext tableProvider() throws RecognitionException {
		TableProviderContext _localctx = new TableProviderContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_tableProvider);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(485);
			match(USING);
			setState(486);
			qualifiedName();
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

	public static class TablePropertyListContext extends ParserRuleContext {
		public List<TablePropertyContext> tableProperty() {
			return getRuleContexts(TablePropertyContext.class);
		}
		public TablePropertyContext tableProperty(int i) {
			return getRuleContext(TablePropertyContext.class,i);
		}
		public TablePropertyListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablePropertyList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTablePropertyList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTablePropertyList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTablePropertyList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablePropertyListContext tablePropertyList() throws RecognitionException {
		TablePropertyListContext _localctx = new TablePropertyListContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_tablePropertyList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(488);
			match(LEFTBRACKET);
			setState(489);
			tableProperty();
			setState(494);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(490);
				match(COMMA);
				setState(491);
				tableProperty();
				}
				}
				setState(496);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(497);
			match(RIGHTBRACKET);
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

	public static class TablePropertyContext extends ParserRuleContext {
		public TablePropertyKeyContext key;
		public TablePropertyValueContext value;
		public TablePropertyKeyContext tablePropertyKey() {
			return getRuleContext(TablePropertyKeyContext.class,0);
		}
		public TablePropertyValueContext tablePropertyValue() {
			return getRuleContext(TablePropertyValueContext.class,0);
		}
		public TerminalNode EQ() { return getToken(SqlBaseParser.EQ, 0); }
		public TablePropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTableProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTableProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTableProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablePropertyContext tableProperty() throws RecognitionException {
		TablePropertyContext _localctx = new TablePropertyContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_tableProperty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(499);
			((TablePropertyContext)_localctx).key = tablePropertyKey();
			setState(504);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TRUE || _la==FALSE || _la==EQ || ((((_la - 248)) & ~0x3f) == 0 && ((1L << (_la - 248)) & ((1L << (STRING - 248)) | (1L << (INTEGER_VALUE - 248)) | (1L << (DECIMAL_VALUE - 248)))) != 0)) {
				{
				setState(501);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ) {
					{
					setState(500);
					match(EQ);
					}
				}

				setState(503);
				((TablePropertyContext)_localctx).value = tablePropertyValue();
				}
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

	public static class TablePropertyKeyContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TablePropertyKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablePropertyKey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTablePropertyKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTablePropertyKey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTablePropertyKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablePropertyKeyContext tablePropertyKey() throws RecognitionException {
		TablePropertyKeyContext _localctx = new TablePropertyKeyContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_tablePropertyKey);
		int _la;
		try {
			setState(515);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
			case FROM:
			case ADD:
			case AS:
			case ALL:
			case DISTINCT:
			case WHERE:
			case GROUP:
			case BY:
			case GROUPING:
			case SETS:
			case CUBE:
			case ROLLUP:
			case ORDER:
			case HAVING:
			case LIMIT:
			case AT:
			case OR:
			case AND:
			case IN:
			case NOT:
			case NO:
			case EXISTS:
			case BETWEEN:
			case LIKE:
			case RLIKE:
			case IS:
			case NULL:
			case TRUE:
			case FALSE:
			case NULLS:
			case ASC:
			case DESC:
			case FOR:
			case INTERVAL:
			case CASE:
			case WHEN:
			case THEN:
			case ELSE:
			case END:
			case JOIN:
			case CROSS:
			case OUTER:
			case INNER:
			case LEFT:
			case SEMI:
			case RIGHT:
			case FULL:
			case NATURAL:
			case ON:
			case LATERAL:
			case WINDOW:
			case OVER:
			case PARTITION:
			case RANGE:
			case ROWS:
			case UNBOUNDED:
			case PRECEDING:
			case FOLLOWING:
			case CURRENT:
			case FIRST:
			case AFTER:
			case LAST:
			case ROW:
			case WITH:
			case VALUES:
			case CREATE:
			case TABLE:
			case VIEW:
			case REPLACE:
			case INSERT:
			case DELETE:
			case INTO:
			case DESCRIBE:
			case EXPLAIN:
			case FORMAT:
			case LOGICAL:
			case CODEGEN:
			case COST:
			case CAST:
			case SHOW:
			case TABLES:
			case COLUMNS:
			case COLUMN:
			case USE:
			case PARTITIONS:
			case FUNCTIONS:
			case DROP:
			case UNION:
			case EXCEPT:
			case SETMINUS:
			case INTERSECT:
			case TO:
			case TABLESAMPLE:
			case STRATIFY:
			case ALTER:
			case RENAME:
			case ARRAY:
			case MAP:
			case STRUCT:
			case COMMENT:
			case SET:
			case RESET:
			case DATA:
			case START:
			case TRANSACTION:
			case COMMIT:
			case ROLLBACK:
			case MACRO:
			case IGNORE:
			case IF:
			case DIV:
			case PERCENTLIT:
			case BUCKET:
			case OUT:
			case OF:
			case SORT:
			case CLUSTER:
			case DISTRIBUTE:
			case OVERWRITE:
			case TRANSFORM:
			case REDUCE:
			case USING:
			case SERDE:
			case SERDEPROPERTIES:
			case RECORDREADER:
			case RECORDWRITER:
			case DELIMITED:
			case FIELDS:
			case TERMINATED:
			case COLLECTION:
			case ITEMS:
			case KEYS:
			case ESCAPED:
			case LINES:
			case SEPARATED:
			case FUNCTION:
			case EXTENDED:
			case REFRESH:
			case CLEAR:
			case CACHE:
			case UNCACHE:
			case LAZY:
			case FORMATTED:
			case GLOBAL:
			case TEMPORARY:
			case OPTIONS:
			case UNSET:
			case TBLPROPERTIES:
			case DBPROPERTIES:
			case BUCKETS:
			case SKEWED:
			case STORED:
			case DIRECTORIES:
			case LOCATION:
			case EXCHANGE:
			case ARCHIVE:
			case UNARCHIVE:
			case FILEFORMAT:
			case TOUCH:
			case COMPACT:
			case CONCATENATE:
			case CHANGE:
			case CASCADE:
			case RESTRICT:
			case CLUSTERED:
			case SORTED:
			case PURGE:
			case INPUTFORMAT:
			case OUTPUTFORMAT:
			case DATABASE:
			case DATABASES:
			case DFS:
			case TRUNCATE:
			case ANALYZE:
			case COMPUTE:
			case LIST:
			case STATISTICS:
			case PARTITIONED:
			case EXTERNAL:
			case DEFINED:
			case REVOKE:
			case GRANT:
			case LOCK:
			case UNLOCK:
			case MSCK:
			case REPAIR:
			case RECOVER:
			case EXPORT:
			case IMPORT:
			case LOAD:
			case ROLE:
			case ROLES:
			case COMPACTIONS:
			case PRINCIPALS:
			case TRANSACTIONS:
			case INDEX:
			case INDEXES:
			case LOCKS:
			case OPTION:
			case ANTI:
			case LOCAL:
			case INPATH:
			case CURRENT_DATE:
			case CURRENT_TIMESTAMP:
			case INTEGER_VALUE:
			case IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(506);
				identifier();
				setState(511);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(507);
					match(T__2);
					setState(508);
					identifier();
					}
					}
					setState(513);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(514);
				match(STRING);
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

	public static class TablePropertyValueContext extends ParserRuleContext {
		public TerminalNode INTEGER_VALUE() { return getToken(SqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode DECIMAL_VALUE() { return getToken(SqlBaseParser.DECIMAL_VALUE, 0); }
		public BooleanValueContext booleanValue() {
			return getRuleContext(BooleanValueContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TablePropertyValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablePropertyValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTablePropertyValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTablePropertyValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTablePropertyValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablePropertyValueContext tablePropertyValue() throws RecognitionException {
		TablePropertyValueContext _localctx = new TablePropertyValueContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_tablePropertyValue);
		try {
			setState(521);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_VALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(517);
				match(INTEGER_VALUE);
				}
				break;
			case DECIMAL_VALUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(518);
				match(DECIMAL_VALUE);
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(519);
				booleanValue();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(520);
				match(STRING);
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

	public static class ConstantListContext extends ParserRuleContext {
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public ConstantListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterConstantList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitConstantList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitConstantList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantListContext constantList() throws RecognitionException {
		ConstantListContext _localctx = new ConstantListContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_constantList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(523);
			match(LEFTBRACKET);
			setState(524);
			constant();
			setState(529);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(525);
				match(COMMA);
				setState(526);
				constant();
				}
				}
				setState(531);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(532);
			match(RIGHTBRACKET);
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

	public static class NestedConstantListContext extends ParserRuleContext {
		public List<ConstantListContext> constantList() {
			return getRuleContexts(ConstantListContext.class);
		}
		public ConstantListContext constantList(int i) {
			return getRuleContext(ConstantListContext.class,i);
		}
		public NestedConstantListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nestedConstantList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNestedConstantList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNestedConstantList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNestedConstantList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NestedConstantListContext nestedConstantList() throws RecognitionException {
		NestedConstantListContext _localctx = new NestedConstantListContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_nestedConstantList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(534);
			match(LEFTBRACKET);
			setState(535);
			constantList();
			setState(540);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(536);
				match(COMMA);
				setState(537);
				constantList();
				}
				}
				setState(542);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(543);
			match(RIGHTBRACKET);
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

	public static class CreateFileFormatContext extends ParserRuleContext {
		public TerminalNode STORED() { return getToken(SqlBaseParser.STORED, 0); }
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public FileFormatContext fileFormat() {
			return getRuleContext(FileFormatContext.class,0);
		}
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public StorageHandlerContext storageHandler() {
			return getRuleContext(StorageHandlerContext.class,0);
		}
		public CreateFileFormatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createFileFormat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateFileFormat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateFileFormat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateFileFormat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateFileFormatContext createFileFormat() throws RecognitionException {
		CreateFileFormatContext _localctx = new CreateFileFormatContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_createFileFormat);
		try {
			setState(551);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(545);
				match(STORED);
				setState(546);
				match(AS);
				setState(547);
				fileFormat();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(548);
				match(STORED);
				setState(549);
				match(BY);
				setState(550);
				storageHandler();
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

	public static class FileFormatContext extends ParserRuleContext {
		public FileFormatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileFormat; }
	 
		public FileFormatContext() { }
		public void copyFrom(FileFormatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TableFileFormatContext extends FileFormatContext {
		public Token inFmt;
		public Token outFmt;
		public TerminalNode INPUTFORMAT() { return getToken(SqlBaseParser.INPUTFORMAT, 0); }
		public TerminalNode OUTPUTFORMAT() { return getToken(SqlBaseParser.OUTPUTFORMAT, 0); }
		public List<TerminalNode> STRING() { return getTokens(SqlBaseParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(SqlBaseParser.STRING, i);
		}
		public TableFileFormatContext(FileFormatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTableFileFormat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTableFileFormat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTableFileFormat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GenericFileFormatContext extends FileFormatContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public GenericFileFormatContext(FileFormatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterGenericFileFormat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitGenericFileFormat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitGenericFileFormat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileFormatContext fileFormat() throws RecognitionException {
		FileFormatContext _localctx = new FileFormatContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_fileFormat);
		try {
			setState(558);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				_localctx = new TableFileFormatContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(553);
				match(INPUTFORMAT);
				setState(554);
				((TableFileFormatContext)_localctx).inFmt = match(STRING);
				setState(555);
				match(OUTPUTFORMAT);
				setState(556);
				((TableFileFormatContext)_localctx).outFmt = match(STRING);
				}
				break;
			case 2:
				_localctx = new GenericFileFormatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(557);
				identifier();
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

	public static class StorageHandlerContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public TerminalNode SERDEPROPERTIES() { return getToken(SqlBaseParser.SERDEPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public StorageHandlerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storageHandler; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterStorageHandler(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitStorageHandler(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitStorageHandler(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StorageHandlerContext storageHandler() throws RecognitionException {
		StorageHandlerContext _localctx = new StorageHandlerContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_storageHandler);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(560);
			match(STRING);
			setState(564);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(561);
				match(WITH);
				setState(562);
				match(SERDEPROPERTIES);
				setState(563);
				tablePropertyList();
				}
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

	public static class ResourceContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public ResourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitResource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitResource(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResourceContext resource() throws RecognitionException {
		ResourceContext _localctx = new ResourceContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_resource);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(566);
			identifier();
			setState(567);
			match(STRING);
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

	public static class QueryNoWithContext extends ParserRuleContext {
		public QueryNoWithContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryNoWith; }
	 
		public QueryNoWithContext() { }
		public void copyFrom(QueryNoWithContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SingleInsertQueryContext extends QueryNoWithContext {
		public QueryTermContext queryTerm() {
			return getRuleContext(QueryTermContext.class,0);
		}
		public QueryOrganizationContext queryOrganization() {
			return getRuleContext(QueryOrganizationContext.class,0);
		}
		public InsertIntoContext insertInto() {
			return getRuleContext(InsertIntoContext.class,0);
		}
		public SingleInsertQueryContext(QueryNoWithContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSingleInsertQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSingleInsertQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSingleInsertQuery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiInsertQueryContext extends QueryNoWithContext {
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public List<MultiInsertQueryBodyContext> multiInsertQueryBody() {
			return getRuleContexts(MultiInsertQueryBodyContext.class);
		}
		public MultiInsertQueryBodyContext multiInsertQueryBody(int i) {
			return getRuleContext(MultiInsertQueryBodyContext.class,i);
		}
		public MultiInsertQueryContext(QueryNoWithContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterMultiInsertQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitMultiInsertQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitMultiInsertQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryNoWithContext queryNoWith() throws RecognitionException {
		QueryNoWithContext _localctx = new QueryNoWithContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_queryNoWith);
		int _la;
		try {
			int _alt;
			setState(581);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				_localctx = new SingleInsertQueryContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(570);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INSERT) {
					{
					setState(569);
					insertInto();
					}
				}

				setState(572);
				queryTerm(0);
				setState(573);
				queryOrganization();
				}
				break;
			case 2:
				_localctx = new MultiInsertQueryContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(575);
				fromClause();
				setState(577); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(576);
						multiInsertQueryBody();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(579); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class QueryOrganizationContext extends ParserRuleContext {
		public SortItemContext sortItem;
		public List<SortItemContext> order = new ArrayList<SortItemContext>();
		public ExpressionContext expression;
		public List<ExpressionContext> clusterBy = new ArrayList<ExpressionContext>();
		public List<ExpressionContext> distributeBy = new ArrayList<ExpressionContext>();
		public List<SortItemContext> sort = new ArrayList<SortItemContext>();
		public ExpressionContext limit;
		public TerminalNode ORDER() { return getToken(SqlBaseParser.ORDER, 0); }
		public List<TerminalNode> BY() { return getTokens(SqlBaseParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(SqlBaseParser.BY, i);
		}
		public TerminalNode CLUSTER() { return getToken(SqlBaseParser.CLUSTER, 0); }
		public TerminalNode DISTRIBUTE() { return getToken(SqlBaseParser.DISTRIBUTE, 0); }
		public TerminalNode SORT() { return getToken(SqlBaseParser.SORT, 0); }
		public WindowsContext windows() {
			return getRuleContext(WindowsContext.class,0);
		}
		public TerminalNode LIMIT() { return getToken(SqlBaseParser.LIMIT, 0); }
		public List<SortItemContext> sortItem() {
			return getRuleContexts(SortItemContext.class);
		}
		public SortItemContext sortItem(int i) {
			return getRuleContext(SortItemContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public QueryOrganizationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryOrganization; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQueryOrganization(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQueryOrganization(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQueryOrganization(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryOrganizationContext queryOrganization() throws RecognitionException {
		QueryOrganizationContext _localctx = new QueryOrganizationContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_queryOrganization);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(593);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(583);
				match(ORDER);
				setState(584);
				match(BY);
				setState(585);
				((QueryOrganizationContext)_localctx).sortItem = sortItem();
				((QueryOrganizationContext)_localctx).order.add(((QueryOrganizationContext)_localctx).sortItem);
				setState(590);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(586);
					match(COMMA);
					setState(587);
					((QueryOrganizationContext)_localctx).sortItem = sortItem();
					((QueryOrganizationContext)_localctx).order.add(((QueryOrganizationContext)_localctx).sortItem);
					}
					}
					setState(592);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(605);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CLUSTER) {
				{
				setState(595);
				match(CLUSTER);
				setState(596);
				match(BY);
				setState(597);
				((QueryOrganizationContext)_localctx).expression = expression();
				((QueryOrganizationContext)_localctx).clusterBy.add(((QueryOrganizationContext)_localctx).expression);
				setState(602);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(598);
					match(COMMA);
					setState(599);
					((QueryOrganizationContext)_localctx).expression = expression();
					((QueryOrganizationContext)_localctx).clusterBy.add(((QueryOrganizationContext)_localctx).expression);
					}
					}
					setState(604);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(617);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DISTRIBUTE) {
				{
				setState(607);
				match(DISTRIBUTE);
				setState(608);
				match(BY);
				setState(609);
				((QueryOrganizationContext)_localctx).expression = expression();
				((QueryOrganizationContext)_localctx).distributeBy.add(((QueryOrganizationContext)_localctx).expression);
				setState(614);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(610);
					match(COMMA);
					setState(611);
					((QueryOrganizationContext)_localctx).expression = expression();
					((QueryOrganizationContext)_localctx).distributeBy.add(((QueryOrganizationContext)_localctx).expression);
					}
					}
					setState(616);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(629);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SORT) {
				{
				setState(619);
				match(SORT);
				setState(620);
				match(BY);
				setState(621);
				((QueryOrganizationContext)_localctx).sortItem = sortItem();
				((QueryOrganizationContext)_localctx).sort.add(((QueryOrganizationContext)_localctx).sortItem);
				setState(626);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(622);
					match(COMMA);
					setState(623);
					((QueryOrganizationContext)_localctx).sortItem = sortItem();
					((QueryOrganizationContext)_localctx).sort.add(((QueryOrganizationContext)_localctx).sortItem);
					}
					}
					setState(628);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(632);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WINDOW) {
				{
				setState(631);
				windows();
				}
			}

			setState(636);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(634);
				match(LIMIT);
				setState(635);
				((QueryOrganizationContext)_localctx).limit = expression();
				}
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

	public static class MultiInsertQueryBodyContext extends ParserRuleContext {
		public QuerySpecificationContext querySpecification() {
			return getRuleContext(QuerySpecificationContext.class,0);
		}
		public QueryOrganizationContext queryOrganization() {
			return getRuleContext(QueryOrganizationContext.class,0);
		}
		public InsertIntoContext insertInto() {
			return getRuleContext(InsertIntoContext.class,0);
		}
		public MultiInsertQueryBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiInsertQueryBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterMultiInsertQueryBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitMultiInsertQueryBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitMultiInsertQueryBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiInsertQueryBodyContext multiInsertQueryBody() throws RecognitionException {
		MultiInsertQueryBodyContext _localctx = new MultiInsertQueryBodyContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_multiInsertQueryBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(639);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INSERT) {
				{
				setState(638);
				insertInto();
				}
			}

			setState(641);
			querySpecification();
			setState(642);
			queryOrganization();
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

	public static class QueryTermContext extends ParserRuleContext {
		public QueryTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryTerm; }
	 
		public QueryTermContext() { }
		public void copyFrom(QueryTermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class QueryTermDefaultContext extends QueryTermContext {
		public QueryPrimaryContext queryPrimary() {
			return getRuleContext(QueryPrimaryContext.class,0);
		}
		public QueryTermDefaultContext(QueryTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQueryTermDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQueryTermDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQueryTermDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetOperationContext extends QueryTermContext {
		public QueryTermContext left;
		public Token operator;
		public QueryTermContext right;
		public List<QueryTermContext> queryTerm() {
			return getRuleContexts(QueryTermContext.class);
		}
		public QueryTermContext queryTerm(int i) {
			return getRuleContext(QueryTermContext.class,i);
		}
		public TerminalNode INTERSECT() { return getToken(SqlBaseParser.INTERSECT, 0); }
		public TerminalNode UNION() { return getToken(SqlBaseParser.UNION, 0); }
		public TerminalNode EXCEPT() { return getToken(SqlBaseParser.EXCEPT, 0); }
		public TerminalNode SETMINUS() { return getToken(SqlBaseParser.SETMINUS, 0); }
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public SetOperationContext(QueryTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSetOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSetOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSetOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryTermContext queryTerm() throws RecognitionException {
		return queryTerm(0);
	}

	private QueryTermContext queryTerm(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		QueryTermContext _localctx = new QueryTermContext(_ctx, _parentState);
		QueryTermContext _prevctx = _localctx;
		int _startState = 88;
		enterRecursionRule(_localctx, 88, RULE_queryTerm, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new QueryTermDefaultContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(645);
			queryPrimary();
			}
			_ctx.stop = _input.LT(-1);
			setState(655);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SetOperationContext(new QueryTermContext(_parentctx, _parentState));
					((SetOperationContext)_localctx).left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_queryTerm);
					setState(647);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(648);
					((SetOperationContext)_localctx).operator = _input.LT(1);
					_la = _input.LA(1);
					if ( !(((((_la - 108)) & ~0x3f) == 0 && ((1L << (_la - 108)) & ((1L << (UNION - 108)) | (1L << (EXCEPT - 108)) | (1L << (SETMINUS - 108)) | (1L << (INTERSECT - 108)))) != 0)) ) {
						((SetOperationContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(650);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ALL || _la==DISTINCT) {
						{
						setState(649);
						setQuantifier();
						}
					}

					setState(652);
					((SetOperationContext)_localctx).right = queryTerm(2);
					}
					} 
				}
				setState(657);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class QueryPrimaryContext extends ParserRuleContext {
		public QueryPrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryPrimary; }
	 
		public QueryPrimaryContext() { }
		public void copyFrom(QueryPrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SubqueryContext extends QueryPrimaryContext {
		public QueryNoWithContext queryNoWith() {
			return getRuleContext(QueryNoWithContext.class,0);
		}
		public SubqueryContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSubquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSubquery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSubquery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class QueryPrimaryDefaultContext extends QueryPrimaryContext {
		public QuerySpecificationContext querySpecification() {
			return getRuleContext(QuerySpecificationContext.class,0);
		}
		public QueryPrimaryDefaultContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQueryPrimaryDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQueryPrimaryDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQueryPrimaryDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InlineTableDefault1Context extends QueryPrimaryContext {
		public InlineTableContext inlineTable() {
			return getRuleContext(InlineTableContext.class,0);
		}
		public InlineTableDefault1Context(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterInlineTableDefault1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitInlineTableDefault1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitInlineTableDefault1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TableContext extends QueryPrimaryContext {
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TableContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryPrimaryContext queryPrimary() throws RecognitionException {
		QueryPrimaryContext _localctx = new QueryPrimaryContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_queryPrimary);
		try {
			setState(666);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
			case FROM:
			case MAP:
			case REDUCE:
				_localctx = new QueryPrimaryDefaultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(658);
				querySpecification();
				}
				break;
			case TABLE:
				_localctx = new TableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(659);
				match(TABLE);
				setState(660);
				tableIdentifier();
				}
				break;
			case VALUES:
				_localctx = new InlineTableDefault1Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(661);
				inlineTable();
				}
				break;
			case LEFTBRACKET:
				_localctx = new SubqueryContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(662);
				match(LEFTBRACKET);
				setState(663);
				queryNoWith();
				setState(664);
				match(RIGHTBRACKET);
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

	public static class SortItemContext extends ParserRuleContext {
		public Token ordering;
		public Token nullOrder;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NULLS() { return getToken(SqlBaseParser.NULLS, 0); }
		public TerminalNode ASC() { return getToken(SqlBaseParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public TerminalNode LAST() { return getToken(SqlBaseParser.LAST, 0); }
		public TerminalNode FIRST() { return getToken(SqlBaseParser.FIRST, 0); }
		public SortItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sortItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSortItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSortItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSortItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SortItemContext sortItem() throws RecognitionException {
		SortItemContext _localctx = new SortItemContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_sortItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(668);
			expression();
			setState(670);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(669);
				((SortItemContext)_localctx).ordering = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
					((SortItemContext)_localctx).ordering = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(674);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NULLS) {
				{
				setState(672);
				match(NULLS);
				setState(673);
				((SortItemContext)_localctx).nullOrder = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==FIRST || _la==LAST) ) {
					((SortItemContext)_localctx).nullOrder = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
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

	public static class QuerySpecificationContext extends ParserRuleContext {
		public Token kind;
		public RowFormatContext inRowFormat;
		public Token recordWriter;
		public Token script;
		public RowFormatContext outRowFormat;
		public Token recordReader;
		public BooleanExpressionContext where;
		public HintContext hint;
		public List<HintContext> hints = new ArrayList<HintContext>();
		public BooleanExpressionContext having;
		public TerminalNode USING() { return getToken(SqlBaseParser.USING, 0); }
		public List<TerminalNode> STRING() { return getTokens(SqlBaseParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(SqlBaseParser.STRING, i);
		}
		public TerminalNode RECORDWRITER() { return getToken(SqlBaseParser.RECORDWRITER, 0); }
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public TerminalNode RECORDREADER() { return getToken(SqlBaseParser.RECORDREADER, 0); }
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public TerminalNode WHERE() { return getToken(SqlBaseParser.WHERE, 0); }
		public TerminalNode SELECT() { return getToken(SqlBaseParser.SELECT, 0); }
		public NamedExpressionSeqContext namedExpressionSeq() {
			return getRuleContext(NamedExpressionSeqContext.class,0);
		}
		public List<RowFormatContext> rowFormat() {
			return getRuleContexts(RowFormatContext.class);
		}
		public RowFormatContext rowFormat(int i) {
			return getRuleContext(RowFormatContext.class,i);
		}
		public List<BooleanExpressionContext> booleanExpression() {
			return getRuleContexts(BooleanExpressionContext.class);
		}
		public BooleanExpressionContext booleanExpression(int i) {
			return getRuleContext(BooleanExpressionContext.class,i);
		}
		public TerminalNode TRANSFORM() { return getToken(SqlBaseParser.TRANSFORM, 0); }
		public TerminalNode MAP() { return getToken(SqlBaseParser.MAP, 0); }
		public TerminalNode REDUCE() { return getToken(SqlBaseParser.REDUCE, 0); }
		public IdentifierSeqContext identifierSeq() {
			return getRuleContext(IdentifierSeqContext.class,0);
		}
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
		}
		public List<LateralViewContext> lateralView() {
			return getRuleContexts(LateralViewContext.class);
		}
		public LateralViewContext lateralView(int i) {
			return getRuleContext(LateralViewContext.class,i);
		}
		public AggregationContext aggregation() {
			return getRuleContext(AggregationContext.class,0);
		}
		public TerminalNode HAVING() { return getToken(SqlBaseParser.HAVING, 0); }
		public WindowsContext windows() {
			return getRuleContext(WindowsContext.class,0);
		}
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public List<HintContext> hint() {
			return getRuleContexts(HintContext.class);
		}
		public HintContext hint(int i) {
			return getRuleContext(HintContext.class,i);
		}
		public QuerySpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_querySpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQuerySpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQuerySpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQuerySpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuerySpecificationContext querySpecification() throws RecognitionException {
		QuerySpecificationContext _localctx = new QuerySpecificationContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_querySpecification);
		int _la;
		try {
			int _alt;
			setState(769);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				{
				setState(686);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SELECT:
					{
					setState(676);
					match(SELECT);
					setState(677);
					((QuerySpecificationContext)_localctx).kind = match(TRANSFORM);
					setState(678);
					match(LEFTBRACKET);
					setState(679);
					namedExpressionSeq();
					setState(680);
					match(RIGHTBRACKET);
					}
					break;
				case MAP:
					{
					setState(682);
					((QuerySpecificationContext)_localctx).kind = match(MAP);
					setState(683);
					namedExpressionSeq();
					}
					break;
				case REDUCE:
					{
					setState(684);
					((QuerySpecificationContext)_localctx).kind = match(REDUCE);
					setState(685);
					namedExpressionSeq();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(689);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ROW) {
					{
					setState(688);
					((QuerySpecificationContext)_localctx).inRowFormat = rowFormat();
					}
				}

				setState(693);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RECORDWRITER) {
					{
					setState(691);
					match(RECORDWRITER);
					setState(692);
					((QuerySpecificationContext)_localctx).recordWriter = match(STRING);
					}
				}

				setState(695);
				match(USING);
				setState(696);
				((QuerySpecificationContext)_localctx).script = match(STRING);
				setState(709);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
				case 1:
					{
					setState(697);
					match(AS);
					setState(707);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
					case 1:
						{
						setState(698);
						identifierSeq();
						}
						break;
					case 2:
						{
						setState(699);
						colTypeList();
						}
						break;
					case 3:
						{
						{
						setState(700);
						match(LEFTBRACKET);
						setState(703);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
						case 1:
							{
							setState(701);
							identifierSeq();
							}
							break;
						case 2:
							{
							setState(702);
							colTypeList();
							}
							break;
						}
						setState(705);
						match(RIGHTBRACKET);
						}
						}
						break;
					}
					}
					break;
				}
				setState(712);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
				case 1:
					{
					setState(711);
					((QuerySpecificationContext)_localctx).outRowFormat = rowFormat();
					}
					break;
				}
				setState(716);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
				case 1:
					{
					setState(714);
					match(RECORDREADER);
					setState(715);
					((QuerySpecificationContext)_localctx).recordReader = match(STRING);
					}
					break;
				}
				setState(719);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
				case 1:
					{
					setState(718);
					fromClause();
					}
					break;
				}
				setState(723);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
				case 1:
					{
					setState(721);
					match(WHERE);
					setState(722);
					((QuerySpecificationContext)_localctx).where = booleanExpression(0);
					}
					break;
				}
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(747);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SELECT:
					{
					setState(725);
					((QuerySpecificationContext)_localctx).kind = match(SELECT);
					setState(729);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(726);
						((QuerySpecificationContext)_localctx).hint = hint();
						((QuerySpecificationContext)_localctx).hints.add(((QuerySpecificationContext)_localctx).hint);
						}
						}
						setState(731);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(733);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
					case 1:
						{
						setState(732);
						setQuantifier();
						}
						break;
					}
					setState(735);
					namedExpressionSeq();
					setState(737);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
					case 1:
						{
						setState(736);
						fromClause();
						}
						break;
					}
					}
					break;
				case FROM:
					{
					setState(739);
					fromClause();
					setState(745);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
					case 1:
						{
						setState(740);
						((QuerySpecificationContext)_localctx).kind = match(SELECT);
						setState(742);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
						case 1:
							{
							setState(741);
							setQuantifier();
							}
							break;
						}
						setState(744);
						namedExpressionSeq();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(752);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(749);
						lateralView();
						}
						} 
					}
					setState(754);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
				}
				setState(757);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
				case 1:
					{
					setState(755);
					match(WHERE);
					setState(756);
					((QuerySpecificationContext)_localctx).where = booleanExpression(0);
					}
					break;
				}
				setState(760);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
				case 1:
					{
					setState(759);
					aggregation();
					}
					break;
				}
				setState(764);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
				case 1:
					{
					setState(762);
					match(HAVING);
					setState(763);
					((QuerySpecificationContext)_localctx).having = booleanExpression(0);
					}
					break;
				}
				setState(767);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
				case 1:
					{
					setState(766);
					windows();
					}
					break;
				}
				}
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

	public static class HintContext extends ParserRuleContext {
		public HintStatementContext hintStatement;
		public List<HintStatementContext> hintStatements = new ArrayList<HintStatementContext>();
		public List<HintStatementContext> hintStatement() {
			return getRuleContexts(HintStatementContext.class);
		}
		public HintStatementContext hintStatement(int i) {
			return getRuleContext(HintStatementContext.class,i);
		}
		public HintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterHint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitHint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitHint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HintContext hint() throws RecognitionException {
		HintContext _localctx = new HintContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_hint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(771);
			match(T__3);
			setState(772);
			((HintContext)_localctx).hintStatement = hintStatement();
			((HintContext)_localctx).hintStatements.add(((HintContext)_localctx).hintStatement);
			setState(779);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 11)) & ~0x3f) == 0 && ((1L << (_la - 11)) & ((1L << (SELECT - 11)) | (1L << (FROM - 11)) | (1L << (ADD - 11)) | (1L << (AS - 11)) | (1L << (COMMA - 11)) | (1L << (ALL - 11)) | (1L << (DISTINCT - 11)) | (1L << (WHERE - 11)) | (1L << (GROUP - 11)) | (1L << (BY - 11)) | (1L << (GROUPING - 11)) | (1L << (SETS - 11)) | (1L << (CUBE - 11)) | (1L << (ROLLUP - 11)) | (1L << (ORDER - 11)) | (1L << (HAVING - 11)) | (1L << (LIMIT - 11)) | (1L << (AT - 11)) | (1L << (OR - 11)) | (1L << (AND - 11)) | (1L << (IN - 11)) | (1L << (NOT - 11)) | (1L << (NO - 11)) | (1L << (EXISTS - 11)) | (1L << (BETWEEN - 11)) | (1L << (LIKE - 11)) | (1L << (RLIKE - 11)) | (1L << (IS - 11)) | (1L << (NULL - 11)) | (1L << (TRUE - 11)) | (1L << (FALSE - 11)) | (1L << (NULLS - 11)) | (1L << (ASC - 11)) | (1L << (DESC - 11)) | (1L << (FOR - 11)) | (1L << (INTERVAL - 11)) | (1L << (CASE - 11)) | (1L << (WHEN - 11)) | (1L << (THEN - 11)) | (1L << (ELSE - 11)) | (1L << (END - 11)) | (1L << (JOIN - 11)) | (1L << (CROSS - 11)) | (1L << (OUTER - 11)) | (1L << (INNER - 11)) | (1L << (LEFT - 11)) | (1L << (SEMI - 11)) | (1L << (RIGHT - 11)) | (1L << (FULL - 11)) | (1L << (NATURAL - 11)) | (1L << (ON - 11)) | (1L << (LATERAL - 11)) | (1L << (WINDOW - 11)) | (1L << (OVER - 11)) | (1L << (PARTITION - 11)) | (1L << (RANGE - 11)) | (1L << (ROWS - 11)))) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (UNBOUNDED - 75)) | (1L << (PRECEDING - 75)) | (1L << (FOLLOWING - 75)) | (1L << (CURRENT - 75)) | (1L << (FIRST - 75)) | (1L << (AFTER - 75)) | (1L << (LAST - 75)) | (1L << (ROW - 75)) | (1L << (WITH - 75)) | (1L << (VALUES - 75)) | (1L << (CREATE - 75)) | (1L << (TABLE - 75)) | (1L << (VIEW - 75)) | (1L << (REPLACE - 75)) | (1L << (INSERT - 75)) | (1L << (DELETE - 75)) | (1L << (INTO - 75)) | (1L << (DESCRIBE - 75)) | (1L << (EXPLAIN - 75)) | (1L << (FORMAT - 75)) | (1L << (LOGICAL - 75)) | (1L << (CODEGEN - 75)) | (1L << (COST - 75)) | (1L << (CAST - 75)) | (1L << (SHOW - 75)) | (1L << (TABLES - 75)) | (1L << (COLUMNS - 75)) | (1L << (COLUMN - 75)) | (1L << (USE - 75)) | (1L << (PARTITIONS - 75)) | (1L << (FUNCTIONS - 75)) | (1L << (DROP - 75)) | (1L << (UNION - 75)) | (1L << (EXCEPT - 75)) | (1L << (SETMINUS - 75)) | (1L << (INTERSECT - 75)) | (1L << (TO - 75)) | (1L << (TABLESAMPLE - 75)) | (1L << (STRATIFY - 75)) | (1L << (ALTER - 75)) | (1L << (RENAME - 75)) | (1L << (ARRAY - 75)) | (1L << (MAP - 75)) | (1L << (STRUCT - 75)) | (1L << (COMMENT - 75)) | (1L << (SET - 75)) | (1L << (RESET - 75)) | (1L << (DATA - 75)) | (1L << (START - 75)) | (1L << (TRANSACTION - 75)) | (1L << (COMMIT - 75)) | (1L << (ROLLBACK - 75)) | (1L << (MACRO - 75)) | (1L << (IGNORE - 75)) | (1L << (IF - 75)))) != 0) || ((((_la - 150)) & ~0x3f) == 0 && ((1L << (_la - 150)) & ((1L << (DIV - 150)) | (1L << (PERCENTLIT - 150)) | (1L << (BUCKET - 150)) | (1L << (OUT - 150)) | (1L << (OF - 150)) | (1L << (SORT - 150)) | (1L << (CLUSTER - 150)) | (1L << (DISTRIBUTE - 150)) | (1L << (OVERWRITE - 150)) | (1L << (TRANSFORM - 150)) | (1L << (REDUCE - 150)) | (1L << (USING - 150)) | (1L << (SERDE - 150)) | (1L << (SERDEPROPERTIES - 150)) | (1L << (RECORDREADER - 150)) | (1L << (RECORDWRITER - 150)) | (1L << (DELIMITED - 150)) | (1L << (FIELDS - 150)) | (1L << (TERMINATED - 150)) | (1L << (COLLECTION - 150)) | (1L << (ITEMS - 150)) | (1L << (KEYS - 150)) | (1L << (ESCAPED - 150)) | (1L << (LINES - 150)) | (1L << (SEPARATED - 150)) | (1L << (FUNCTION - 150)) | (1L << (EXTENDED - 150)) | (1L << (REFRESH - 150)) | (1L << (CLEAR - 150)) | (1L << (CACHE - 150)) | (1L << (UNCACHE - 150)) | (1L << (LAZY - 150)) | (1L << (FORMATTED - 150)) | (1L << (GLOBAL - 150)) | (1L << (TEMPORARY - 150)) | (1L << (OPTIONS - 150)) | (1L << (UNSET - 150)) | (1L << (TBLPROPERTIES - 150)) | (1L << (DBPROPERTIES - 150)) | (1L << (BUCKETS - 150)) | (1L << (SKEWED - 150)) | (1L << (STORED - 150)) | (1L << (DIRECTORIES - 150)) | (1L << (LOCATION - 150)) | (1L << (EXCHANGE - 150)) | (1L << (ARCHIVE - 150)) | (1L << (UNARCHIVE - 150)) | (1L << (FILEFORMAT - 150)) | (1L << (TOUCH - 150)) | (1L << (COMPACT - 150)) | (1L << (CONCATENATE - 150)) | (1L << (CHANGE - 150)) | (1L << (CASCADE - 150)) | (1L << (RESTRICT - 150)) | (1L << (CLUSTERED - 150)) | (1L << (SORTED - 150)) | (1L << (PURGE - 150)) | (1L << (INPUTFORMAT - 150)) | (1L << (OUTPUTFORMAT - 150)) | (1L << (DATABASE - 150)))) != 0) || ((((_la - 214)) & ~0x3f) == 0 && ((1L << (_la - 214)) & ((1L << (DATABASES - 214)) | (1L << (DFS - 214)) | (1L << (TRUNCATE - 214)) | (1L << (ANALYZE - 214)) | (1L << (COMPUTE - 214)) | (1L << (LIST - 214)) | (1L << (STATISTICS - 214)) | (1L << (PARTITIONED - 214)) | (1L << (EXTERNAL - 214)) | (1L << (DEFINED - 214)) | (1L << (REVOKE - 214)) | (1L << (GRANT - 214)) | (1L << (LOCK - 214)) | (1L << (UNLOCK - 214)) | (1L << (MSCK - 214)) | (1L << (REPAIR - 214)) | (1L << (RECOVER - 214)) | (1L << (EXPORT - 214)) | (1L << (IMPORT - 214)) | (1L << (LOAD - 214)) | (1L << (ROLE - 214)) | (1L << (ROLES - 214)) | (1L << (COMPACTIONS - 214)) | (1L << (PRINCIPALS - 214)) | (1L << (TRANSACTIONS - 214)) | (1L << (INDEX - 214)) | (1L << (INDEXES - 214)) | (1L << (LOCKS - 214)) | (1L << (OPTION - 214)) | (1L << (ANTI - 214)) | (1L << (LOCAL - 214)) | (1L << (INPATH - 214)) | (1L << (CURRENT_DATE - 214)) | (1L << (CURRENT_TIMESTAMP - 214)) | (1L << (INTEGER_VALUE - 214)) | (1L << (IDENTIFIER - 214)) | (1L << (BACKQUOTED_IDENTIFIER - 214)))) != 0)) {
				{
				{
				setState(774);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(773);
					match(COMMA);
					}
				}

				setState(776);
				((HintContext)_localctx).hintStatement = hintStatement();
				((HintContext)_localctx).hintStatements.add(((HintContext)_localctx).hintStatement);
				}
				}
				setState(781);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(782);
			match(T__4);
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

	public static class HintStatementContext extends ParserRuleContext {
		public IdentifierContext hintName;
		public PrimaryExpressionContext primaryExpression;
		public List<PrimaryExpressionContext> parameters = new ArrayList<PrimaryExpressionContext>();
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<PrimaryExpressionContext> primaryExpression() {
			return getRuleContexts(PrimaryExpressionContext.class);
		}
		public PrimaryExpressionContext primaryExpression(int i) {
			return getRuleContext(PrimaryExpressionContext.class,i);
		}
		public HintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hintStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterHintStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitHintStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitHintStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HintStatementContext hintStatement() throws RecognitionException {
		HintStatementContext _localctx = new HintStatementContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_hintStatement);
		int _la;
		try {
			setState(797);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(784);
				((HintStatementContext)_localctx).hintName = identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(785);
				((HintStatementContext)_localctx).hintName = identifier();
				setState(786);
				match(LEFTBRACKET);
				setState(787);
				((HintStatementContext)_localctx).primaryExpression = primaryExpression(0);
				((HintStatementContext)_localctx).parameters.add(((HintStatementContext)_localctx).primaryExpression);
				setState(792);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(788);
					match(COMMA);
					setState(789);
					((HintStatementContext)_localctx).primaryExpression = primaryExpression(0);
					((HintStatementContext)_localctx).parameters.add(((HintStatementContext)_localctx).primaryExpression);
					}
					}
					setState(794);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(795);
				match(RIGHTBRACKET);
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

	public static class FromClauseContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public List<RelationContext> relation() {
			return getRuleContexts(RelationContext.class);
		}
		public RelationContext relation(int i) {
			return getRuleContext(RelationContext.class,i);
		}
		public List<LateralViewContext> lateralView() {
			return getRuleContexts(LateralViewContext.class);
		}
		public LateralViewContext lateralView(int i) {
			return getRuleContext(LateralViewContext.class,i);
		}
		public FromClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterFromClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitFromClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitFromClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromClauseContext fromClause() throws RecognitionException {
		FromClauseContext _localctx = new FromClauseContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_fromClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(799);
			match(FROM);
			setState(800);
			relation();
			setState(805);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(801);
					match(COMMA);
					setState(802);
					relation();
					}
					} 
				}
				setState(807);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
			}
			setState(811);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(808);
					lateralView();
					}
					} 
				}
				setState(813);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
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

	public static class AggregationContext extends ParserRuleContext {
		public ExpressionContext expression;
		public List<ExpressionContext> groupingExpressions = new ArrayList<ExpressionContext>();
		public Token kind;
		public TerminalNode GROUP() { return getToken(SqlBaseParser.GROUP, 0); }
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public TerminalNode SETS() { return getToken(SqlBaseParser.SETS, 0); }
		public List<GroupingSetContext> groupingSet() {
			return getRuleContexts(GroupingSetContext.class);
		}
		public GroupingSetContext groupingSet(int i) {
			return getRuleContext(GroupingSetContext.class,i);
		}
		public TerminalNode ROLLUP() { return getToken(SqlBaseParser.ROLLUP, 0); }
		public TerminalNode CUBE() { return getToken(SqlBaseParser.CUBE, 0); }
		public TerminalNode GROUPING() { return getToken(SqlBaseParser.GROUPING, 0); }
		public AggregationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAggregation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAggregation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAggregation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AggregationContext aggregation() throws RecognitionException {
		AggregationContext _localctx = new AggregationContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_aggregation);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(814);
			match(GROUP);
			setState(815);
			match(BY);
			setState(816);
			((AggregationContext)_localctx).expression = expression();
			((AggregationContext)_localctx).groupingExpressions.add(((AggregationContext)_localctx).expression);
			setState(821);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(817);
					match(COMMA);
					setState(818);
					((AggregationContext)_localctx).expression = expression();
					((AggregationContext)_localctx).groupingExpressions.add(((AggregationContext)_localctx).expression);
					}
					} 
				}
				setState(823);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
			}
			setState(841);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				{
				setState(824);
				match(WITH);
				setState(825);
				((AggregationContext)_localctx).kind = match(ROLLUP);
				}
				break;
			case 2:
				{
				setState(826);
				match(WITH);
				setState(827);
				((AggregationContext)_localctx).kind = match(CUBE);
				}
				break;
			case 3:
				{
				setState(828);
				((AggregationContext)_localctx).kind = match(GROUPING);
				setState(829);
				match(SETS);
				setState(830);
				match(LEFTBRACKET);
				setState(831);
				groupingSet();
				setState(836);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(832);
					match(COMMA);
					setState(833);
					groupingSet();
					}
					}
					setState(838);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(839);
				match(RIGHTBRACKET);
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

	public static class GroupingSetContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public GroupingSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupingSet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterGroupingSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitGroupingSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitGroupingSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupingSetContext groupingSet() throws RecognitionException {
		GroupingSetContext _localctx = new GroupingSetContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_groupingSet);
		int _la;
		try {
			setState(856);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(843);
				match(LEFTBRACKET);
				setState(852);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 11)) & ~0x3f) == 0 && ((1L << (_la - 11)) & ((1L << (SELECT - 11)) | (1L << (FROM - 11)) | (1L << (ADD - 11)) | (1L << (AS - 11)) | (1L << (LEFTBRACKET - 11)) | (1L << (ALL - 11)) | (1L << (DISTINCT - 11)) | (1L << (WHERE - 11)) | (1L << (GROUP - 11)) | (1L << (BY - 11)) | (1L << (GROUPING - 11)) | (1L << (SETS - 11)) | (1L << (CUBE - 11)) | (1L << (ROLLUP - 11)) | (1L << (ORDER - 11)) | (1L << (HAVING - 11)) | (1L << (LIMIT - 11)) | (1L << (AT - 11)) | (1L << (OR - 11)) | (1L << (AND - 11)) | (1L << (IN - 11)) | (1L << (NOT - 11)) | (1L << (NO - 11)) | (1L << (EXISTS - 11)) | (1L << (BETWEEN - 11)) | (1L << (LIKE - 11)) | (1L << (RLIKE - 11)) | (1L << (IS - 11)) | (1L << (NULL - 11)) | (1L << (TRUE - 11)) | (1L << (FALSE - 11)) | (1L << (NULLS - 11)) | (1L << (ASC - 11)) | (1L << (DESC - 11)) | (1L << (FOR - 11)) | (1L << (INTERVAL - 11)) | (1L << (CASE - 11)) | (1L << (WHEN - 11)) | (1L << (THEN - 11)) | (1L << (ELSE - 11)) | (1L << (END - 11)) | (1L << (JOIN - 11)) | (1L << (CROSS - 11)) | (1L << (OUTER - 11)) | (1L << (INNER - 11)) | (1L << (LEFT - 11)) | (1L << (SEMI - 11)) | (1L << (RIGHT - 11)) | (1L << (FULL - 11)) | (1L << (NATURAL - 11)) | (1L << (ON - 11)) | (1L << (LATERAL - 11)) | (1L << (WINDOW - 11)) | (1L << (OVER - 11)) | (1L << (PARTITION - 11)) | (1L << (RANGE - 11)) | (1L << (ROWS - 11)))) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (UNBOUNDED - 75)) | (1L << (PRECEDING - 75)) | (1L << (FOLLOWING - 75)) | (1L << (CURRENT - 75)) | (1L << (FIRST - 75)) | (1L << (AFTER - 75)) | (1L << (LAST - 75)) | (1L << (ROW - 75)) | (1L << (WITH - 75)) | (1L << (VALUES - 75)) | (1L << (CREATE - 75)) | (1L << (TABLE - 75)) | (1L << (VIEW - 75)) | (1L << (REPLACE - 75)) | (1L << (INSERT - 75)) | (1L << (DELETE - 75)) | (1L << (INTO - 75)) | (1L << (DESCRIBE - 75)) | (1L << (EXPLAIN - 75)) | (1L << (FORMAT - 75)) | (1L << (LOGICAL - 75)) | (1L << (CODEGEN - 75)) | (1L << (COST - 75)) | (1L << (CAST - 75)) | (1L << (SHOW - 75)) | (1L << (TABLES - 75)) | (1L << (COLUMNS - 75)) | (1L << (COLUMN - 75)) | (1L << (USE - 75)) | (1L << (PARTITIONS - 75)) | (1L << (FUNCTIONS - 75)) | (1L << (DROP - 75)) | (1L << (UNION - 75)) | (1L << (EXCEPT - 75)) | (1L << (SETMINUS - 75)) | (1L << (INTERSECT - 75)) | (1L << (TO - 75)) | (1L << (TABLESAMPLE - 75)) | (1L << (STRATIFY - 75)) | (1L << (ALTER - 75)) | (1L << (RENAME - 75)) | (1L << (ARRAY - 75)) | (1L << (MAP - 75)) | (1L << (STRUCT - 75)) | (1L << (COMMENT - 75)) | (1L << (SET - 75)) | (1L << (RESET - 75)) | (1L << (DATA - 75)) | (1L << (START - 75)) | (1L << (TRANSACTION - 75)) | (1L << (COMMIT - 75)) | (1L << (ROLLBACK - 75)) | (1L << (MACRO - 75)) | (1L << (IGNORE - 75)) | (1L << (IF - 75)))) != 0) || ((((_la - 145)) & ~0x3f) == 0 && ((1L << (_la - 145)) & ((1L << (PLUS - 145)) | (1L << (MINUS - 145)) | (1L << (ASTERISK - 145)) | (1L << (DIV - 145)) | (1L << (TILDE - 145)) | (1L << (PERCENTLIT - 145)) | (1L << (BUCKET - 145)) | (1L << (OUT - 145)) | (1L << (OF - 145)) | (1L << (SORT - 145)) | (1L << (CLUSTER - 145)) | (1L << (DISTRIBUTE - 145)) | (1L << (OVERWRITE - 145)) | (1L << (TRANSFORM - 145)) | (1L << (REDUCE - 145)) | (1L << (USING - 145)) | (1L << (SERDE - 145)) | (1L << (SERDEPROPERTIES - 145)) | (1L << (RECORDREADER - 145)) | (1L << (RECORDWRITER - 145)) | (1L << (DELIMITED - 145)) | (1L << (FIELDS - 145)) | (1L << (TERMINATED - 145)) | (1L << (COLLECTION - 145)) | (1L << (ITEMS - 145)) | (1L << (KEYS - 145)) | (1L << (ESCAPED - 145)) | (1L << (LINES - 145)) | (1L << (SEPARATED - 145)) | (1L << (FUNCTION - 145)) | (1L << (EXTENDED - 145)) | (1L << (REFRESH - 145)) | (1L << (CLEAR - 145)) | (1L << (CACHE - 145)) | (1L << (UNCACHE - 145)) | (1L << (LAZY - 145)) | (1L << (FORMATTED - 145)) | (1L << (GLOBAL - 145)) | (1L << (TEMPORARY - 145)) | (1L << (OPTIONS - 145)) | (1L << (UNSET - 145)) | (1L << (TBLPROPERTIES - 145)) | (1L << (DBPROPERTIES - 145)) | (1L << (BUCKETS - 145)) | (1L << (SKEWED - 145)) | (1L << (STORED - 145)) | (1L << (DIRECTORIES - 145)) | (1L << (LOCATION - 145)) | (1L << (EXCHANGE - 145)) | (1L << (ARCHIVE - 145)) | (1L << (UNARCHIVE - 145)) | (1L << (FILEFORMAT - 145)) | (1L << (TOUCH - 145)) | (1L << (COMPACT - 145)) | (1L << (CONCATENATE - 145)) | (1L << (CHANGE - 145)) | (1L << (CASCADE - 145)) | (1L << (RESTRICT - 145)) | (1L << (CLUSTERED - 145)))) != 0) || ((((_la - 209)) & ~0x3f) == 0 && ((1L << (_la - 209)) & ((1L << (SORTED - 209)) | (1L << (PURGE - 209)) | (1L << (INPUTFORMAT - 209)) | (1L << (OUTPUTFORMAT - 209)) | (1L << (DATABASE - 209)) | (1L << (DATABASES - 209)) | (1L << (DFS - 209)) | (1L << (TRUNCATE - 209)) | (1L << (ANALYZE - 209)) | (1L << (COMPUTE - 209)) | (1L << (LIST - 209)) | (1L << (STATISTICS - 209)) | (1L << (PARTITIONED - 209)) | (1L << (EXTERNAL - 209)) | (1L << (DEFINED - 209)) | (1L << (REVOKE - 209)) | (1L << (GRANT - 209)) | (1L << (LOCK - 209)) | (1L << (UNLOCK - 209)) | (1L << (MSCK - 209)) | (1L << (REPAIR - 209)) | (1L << (RECOVER - 209)) | (1L << (EXPORT - 209)) | (1L << (IMPORT - 209)) | (1L << (LOAD - 209)) | (1L << (ROLE - 209)) | (1L << (ROLES - 209)) | (1L << (COMPACTIONS - 209)) | (1L << (PRINCIPALS - 209)) | (1L << (TRANSACTIONS - 209)) | (1L << (INDEX - 209)) | (1L << (INDEXES - 209)) | (1L << (LOCKS - 209)) | (1L << (OPTION - 209)) | (1L << (ANTI - 209)) | (1L << (LOCAL - 209)) | (1L << (INPATH - 209)) | (1L << (CURRENT_DATE - 209)) | (1L << (CURRENT_TIMESTAMP - 209)) | (1L << (STRING - 209)) | (1L << (BIGINT_LITERAL - 209)) | (1L << (SMALLINT_LITERAL - 209)) | (1L << (TINYINT_LITERAL - 209)) | (1L << (INTEGER_VALUE - 209)) | (1L << (DECIMAL_VALUE - 209)) | (1L << (DOUBLE_LITERAL - 209)) | (1L << (BIGDECIMAL_LITERAL - 209)) | (1L << (IDENTIFIER - 209)) | (1L << (BACKQUOTED_IDENTIFIER - 209)))) != 0)) {
					{
					setState(844);
					expression();
					setState(849);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(845);
						match(COMMA);
						setState(846);
						expression();
						}
						}
						setState(851);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(854);
				match(RIGHTBRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(855);
				expression();
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

	public static class LateralViewContext extends ParserRuleContext {
		public IdentifierContext tblName;
		public IdentifierContext identifier;
		public List<IdentifierContext> colName = new ArrayList<IdentifierContext>();
		public TerminalNode LATERAL() { return getToken(SqlBaseParser.LATERAL, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode OUTER() { return getToken(SqlBaseParser.OUTER, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public LateralViewContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lateralView; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterLateralView(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitLateralView(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitLateralView(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LateralViewContext lateralView() throws RecognitionException {
		LateralViewContext _localctx = new LateralViewContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_lateralView);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(858);
			match(LATERAL);
			setState(859);
			match(VIEW);
			setState(861);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				{
				setState(860);
				match(OUTER);
				}
				break;
			}
			setState(863);
			qualifiedName();
			setState(864);
			match(LEFTBRACKET);
			setState(873);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 11)) & ~0x3f) == 0 && ((1L << (_la - 11)) & ((1L << (SELECT - 11)) | (1L << (FROM - 11)) | (1L << (ADD - 11)) | (1L << (AS - 11)) | (1L << (LEFTBRACKET - 11)) | (1L << (ALL - 11)) | (1L << (DISTINCT - 11)) | (1L << (WHERE - 11)) | (1L << (GROUP - 11)) | (1L << (BY - 11)) | (1L << (GROUPING - 11)) | (1L << (SETS - 11)) | (1L << (CUBE - 11)) | (1L << (ROLLUP - 11)) | (1L << (ORDER - 11)) | (1L << (HAVING - 11)) | (1L << (LIMIT - 11)) | (1L << (AT - 11)) | (1L << (OR - 11)) | (1L << (AND - 11)) | (1L << (IN - 11)) | (1L << (NOT - 11)) | (1L << (NO - 11)) | (1L << (EXISTS - 11)) | (1L << (BETWEEN - 11)) | (1L << (LIKE - 11)) | (1L << (RLIKE - 11)) | (1L << (IS - 11)) | (1L << (NULL - 11)) | (1L << (TRUE - 11)) | (1L << (FALSE - 11)) | (1L << (NULLS - 11)) | (1L << (ASC - 11)) | (1L << (DESC - 11)) | (1L << (FOR - 11)) | (1L << (INTERVAL - 11)) | (1L << (CASE - 11)) | (1L << (WHEN - 11)) | (1L << (THEN - 11)) | (1L << (ELSE - 11)) | (1L << (END - 11)) | (1L << (JOIN - 11)) | (1L << (CROSS - 11)) | (1L << (OUTER - 11)) | (1L << (INNER - 11)) | (1L << (LEFT - 11)) | (1L << (SEMI - 11)) | (1L << (RIGHT - 11)) | (1L << (FULL - 11)) | (1L << (NATURAL - 11)) | (1L << (ON - 11)) | (1L << (LATERAL - 11)) | (1L << (WINDOW - 11)) | (1L << (OVER - 11)) | (1L << (PARTITION - 11)) | (1L << (RANGE - 11)) | (1L << (ROWS - 11)))) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (UNBOUNDED - 75)) | (1L << (PRECEDING - 75)) | (1L << (FOLLOWING - 75)) | (1L << (CURRENT - 75)) | (1L << (FIRST - 75)) | (1L << (AFTER - 75)) | (1L << (LAST - 75)) | (1L << (ROW - 75)) | (1L << (WITH - 75)) | (1L << (VALUES - 75)) | (1L << (CREATE - 75)) | (1L << (TABLE - 75)) | (1L << (VIEW - 75)) | (1L << (REPLACE - 75)) | (1L << (INSERT - 75)) | (1L << (DELETE - 75)) | (1L << (INTO - 75)) | (1L << (DESCRIBE - 75)) | (1L << (EXPLAIN - 75)) | (1L << (FORMAT - 75)) | (1L << (LOGICAL - 75)) | (1L << (CODEGEN - 75)) | (1L << (COST - 75)) | (1L << (CAST - 75)) | (1L << (SHOW - 75)) | (1L << (TABLES - 75)) | (1L << (COLUMNS - 75)) | (1L << (COLUMN - 75)) | (1L << (USE - 75)) | (1L << (PARTITIONS - 75)) | (1L << (FUNCTIONS - 75)) | (1L << (DROP - 75)) | (1L << (UNION - 75)) | (1L << (EXCEPT - 75)) | (1L << (SETMINUS - 75)) | (1L << (INTERSECT - 75)) | (1L << (TO - 75)) | (1L << (TABLESAMPLE - 75)) | (1L << (STRATIFY - 75)) | (1L << (ALTER - 75)) | (1L << (RENAME - 75)) | (1L << (ARRAY - 75)) | (1L << (MAP - 75)) | (1L << (STRUCT - 75)) | (1L << (COMMENT - 75)) | (1L << (SET - 75)) | (1L << (RESET - 75)) | (1L << (DATA - 75)) | (1L << (START - 75)) | (1L << (TRANSACTION - 75)) | (1L << (COMMIT - 75)) | (1L << (ROLLBACK - 75)) | (1L << (MACRO - 75)) | (1L << (IGNORE - 75)) | (1L << (IF - 75)))) != 0) || ((((_la - 145)) & ~0x3f) == 0 && ((1L << (_la - 145)) & ((1L << (PLUS - 145)) | (1L << (MINUS - 145)) | (1L << (ASTERISK - 145)) | (1L << (DIV - 145)) | (1L << (TILDE - 145)) | (1L << (PERCENTLIT - 145)) | (1L << (BUCKET - 145)) | (1L << (OUT - 145)) | (1L << (OF - 145)) | (1L << (SORT - 145)) | (1L << (CLUSTER - 145)) | (1L << (DISTRIBUTE - 145)) | (1L << (OVERWRITE - 145)) | (1L << (TRANSFORM - 145)) | (1L << (REDUCE - 145)) | (1L << (USING - 145)) | (1L << (SERDE - 145)) | (1L << (SERDEPROPERTIES - 145)) | (1L << (RECORDREADER - 145)) | (1L << (RECORDWRITER - 145)) | (1L << (DELIMITED - 145)) | (1L << (FIELDS - 145)) | (1L << (TERMINATED - 145)) | (1L << (COLLECTION - 145)) | (1L << (ITEMS - 145)) | (1L << (KEYS - 145)) | (1L << (ESCAPED - 145)) | (1L << (LINES - 145)) | (1L << (SEPARATED - 145)) | (1L << (FUNCTION - 145)) | (1L << (EXTENDED - 145)) | (1L << (REFRESH - 145)) | (1L << (CLEAR - 145)) | (1L << (CACHE - 145)) | (1L << (UNCACHE - 145)) | (1L << (LAZY - 145)) | (1L << (FORMATTED - 145)) | (1L << (GLOBAL - 145)) | (1L << (TEMPORARY - 145)) | (1L << (OPTIONS - 145)) | (1L << (UNSET - 145)) | (1L << (TBLPROPERTIES - 145)) | (1L << (DBPROPERTIES - 145)) | (1L << (BUCKETS - 145)) | (1L << (SKEWED - 145)) | (1L << (STORED - 145)) | (1L << (DIRECTORIES - 145)) | (1L << (LOCATION - 145)) | (1L << (EXCHANGE - 145)) | (1L << (ARCHIVE - 145)) | (1L << (UNARCHIVE - 145)) | (1L << (FILEFORMAT - 145)) | (1L << (TOUCH - 145)) | (1L << (COMPACT - 145)) | (1L << (CONCATENATE - 145)) | (1L << (CHANGE - 145)) | (1L << (CASCADE - 145)) | (1L << (RESTRICT - 145)) | (1L << (CLUSTERED - 145)))) != 0) || ((((_la - 209)) & ~0x3f) == 0 && ((1L << (_la - 209)) & ((1L << (SORTED - 209)) | (1L << (PURGE - 209)) | (1L << (INPUTFORMAT - 209)) | (1L << (OUTPUTFORMAT - 209)) | (1L << (DATABASE - 209)) | (1L << (DATABASES - 209)) | (1L << (DFS - 209)) | (1L << (TRUNCATE - 209)) | (1L << (ANALYZE - 209)) | (1L << (COMPUTE - 209)) | (1L << (LIST - 209)) | (1L << (STATISTICS - 209)) | (1L << (PARTITIONED - 209)) | (1L << (EXTERNAL - 209)) | (1L << (DEFINED - 209)) | (1L << (REVOKE - 209)) | (1L << (GRANT - 209)) | (1L << (LOCK - 209)) | (1L << (UNLOCK - 209)) | (1L << (MSCK - 209)) | (1L << (REPAIR - 209)) | (1L << (RECOVER - 209)) | (1L << (EXPORT - 209)) | (1L << (IMPORT - 209)) | (1L << (LOAD - 209)) | (1L << (ROLE - 209)) | (1L << (ROLES - 209)) | (1L << (COMPACTIONS - 209)) | (1L << (PRINCIPALS - 209)) | (1L << (TRANSACTIONS - 209)) | (1L << (INDEX - 209)) | (1L << (INDEXES - 209)) | (1L << (LOCKS - 209)) | (1L << (OPTION - 209)) | (1L << (ANTI - 209)) | (1L << (LOCAL - 209)) | (1L << (INPATH - 209)) | (1L << (CURRENT_DATE - 209)) | (1L << (CURRENT_TIMESTAMP - 209)) | (1L << (STRING - 209)) | (1L << (BIGINT_LITERAL - 209)) | (1L << (SMALLINT_LITERAL - 209)) | (1L << (TINYINT_LITERAL - 209)) | (1L << (INTEGER_VALUE - 209)) | (1L << (DECIMAL_VALUE - 209)) | (1L << (DOUBLE_LITERAL - 209)) | (1L << (BIGDECIMAL_LITERAL - 209)) | (1L << (IDENTIFIER - 209)) | (1L << (BACKQUOTED_IDENTIFIER - 209)))) != 0)) {
				{
				setState(865);
				expression();
				setState(870);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(866);
					match(COMMA);
					setState(867);
					expression();
					}
					}
					setState(872);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(875);
			match(RIGHTBRACKET);
			setState(876);
			((LateralViewContext)_localctx).tblName = identifier();
			setState(888);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				{
				setState(878);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
				case 1:
					{
					setState(877);
					match(AS);
					}
					break;
				}
				setState(880);
				((LateralViewContext)_localctx).identifier = identifier();
				((LateralViewContext)_localctx).colName.add(((LateralViewContext)_localctx).identifier);
				setState(885);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(881);
						match(COMMA);
						setState(882);
						((LateralViewContext)_localctx).identifier = identifier();
						((LateralViewContext)_localctx).colName.add(((LateralViewContext)_localctx).identifier);
						}
						} 
					}
					setState(887);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
				}
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

	public static class SetQuantifierContext extends ParserRuleContext {
		public TerminalNode DISTINCT() { return getToken(SqlBaseParser.DISTINCT, 0); }
		public TerminalNode ALL() { return getToken(SqlBaseParser.ALL, 0); }
		public SetQuantifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setQuantifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSetQuantifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSetQuantifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSetQuantifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetQuantifierContext setQuantifier() throws RecognitionException {
		SetQuantifierContext _localctx = new SetQuantifierContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_setQuantifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(890);
			_la = _input.LA(1);
			if ( !(_la==ALL || _la==DISTINCT) ) {
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

	public static class RelationContext extends ParserRuleContext {
		public RelationPrimaryContext relationPrimary() {
			return getRuleContext(RelationPrimaryContext.class,0);
		}
		public List<JoinRelationContext> joinRelation() {
			return getRuleContexts(JoinRelationContext.class);
		}
		public JoinRelationContext joinRelation(int i) {
			return getRuleContext(JoinRelationContext.class,i);
		}
		public RelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRelation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationContext relation() throws RecognitionException {
		RelationContext _localctx = new RelationContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_relation);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(892);
			relationPrimary();
			setState(896);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,99,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(893);
					joinRelation();
					}
					} 
				}
				setState(898);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,99,_ctx);
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

	public static class JoinRelationContext extends ParserRuleContext {
		public RelationPrimaryContext right;
		public TerminalNode JOIN() { return getToken(SqlBaseParser.JOIN, 0); }
		public RelationPrimaryContext relationPrimary() {
			return getRuleContext(RelationPrimaryContext.class,0);
		}
		public JoinTypeContext joinType() {
			return getRuleContext(JoinTypeContext.class,0);
		}
		public JoinCriteriaContext joinCriteria() {
			return getRuleContext(JoinCriteriaContext.class,0);
		}
		public TerminalNode NATURAL() { return getToken(SqlBaseParser.NATURAL, 0); }
		public JoinRelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinRelation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterJoinRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitJoinRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitJoinRelation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinRelationContext joinRelation() throws RecognitionException {
		JoinRelationContext _localctx = new JoinRelationContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_joinRelation);
		try {
			setState(910);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JOIN:
			case CROSS:
			case INNER:
			case LEFT:
			case RIGHT:
			case FULL:
			case ANTI:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(899);
				joinType();
				}
				setState(900);
				match(JOIN);
				setState(901);
				((JoinRelationContext)_localctx).right = relationPrimary();
				setState(903);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
				case 1:
					{
					setState(902);
					joinCriteria();
					}
					break;
				}
				}
				break;
			case NATURAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(905);
				match(NATURAL);
				setState(906);
				joinType();
				setState(907);
				match(JOIN);
				setState(908);
				((JoinRelationContext)_localctx).right = relationPrimary();
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

	public static class JoinTypeContext extends ParserRuleContext {
		public TerminalNode INNER() { return getToken(SqlBaseParser.INNER, 0); }
		public TerminalNode CROSS() { return getToken(SqlBaseParser.CROSS, 0); }
		public TerminalNode LEFT() { return getToken(SqlBaseParser.LEFT, 0); }
		public TerminalNode OUTER() { return getToken(SqlBaseParser.OUTER, 0); }
		public TerminalNode SEMI() { return getToken(SqlBaseParser.SEMI, 0); }
		public TerminalNode RIGHT() { return getToken(SqlBaseParser.RIGHT, 0); }
		public TerminalNode FULL() { return getToken(SqlBaseParser.FULL, 0); }
		public TerminalNode ANTI() { return getToken(SqlBaseParser.ANTI, 0); }
		public JoinTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterJoinType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitJoinType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitJoinType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinTypeContext joinType() throws RecognitionException {
		JoinTypeContext _localctx = new JoinTypeContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_joinType);
		int _la;
		try {
			setState(934);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(913);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INNER) {
					{
					setState(912);
					match(INNER);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(915);
				match(CROSS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(916);
				match(LEFT);
				setState(918);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(917);
					match(OUTER);
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(920);
				match(LEFT);
				setState(921);
				match(SEMI);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(922);
				match(RIGHT);
				setState(924);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(923);
					match(OUTER);
					}
				}

				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(926);
				match(FULL);
				setState(928);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(927);
					match(OUTER);
					}
				}

				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(931);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFT) {
					{
					setState(930);
					match(LEFT);
					}
				}

				setState(933);
				match(ANTI);
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

	public static class JoinCriteriaContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public TerminalNode USING() { return getToken(SqlBaseParser.USING, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public JoinCriteriaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinCriteria; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterJoinCriteria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitJoinCriteria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitJoinCriteria(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinCriteriaContext joinCriteria() throws RecognitionException {
		JoinCriteriaContext _localctx = new JoinCriteriaContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_joinCriteria);
		int _la;
		try {
			setState(950);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ON:
				enterOuterAlt(_localctx, 1);
				{
				setState(936);
				match(ON);
				setState(937);
				booleanExpression(0);
				}
				break;
			case USING:
				enterOuterAlt(_localctx, 2);
				{
				setState(938);
				match(USING);
				setState(939);
				match(LEFTBRACKET);
				setState(940);
				identifier();
				setState(945);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(941);
					match(COMMA);
					setState(942);
					identifier();
					}
					}
					setState(947);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(948);
				match(RIGHTBRACKET);
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

	public static class SampleContext extends ParserRuleContext {
		public Token percentage;
		public Token sampleType;
		public Token numerator;
		public Token denominator;
		public TerminalNode TABLESAMPLE() { return getToken(SqlBaseParser.TABLESAMPLE, 0); }
		public TerminalNode BYTELENGTH_LITERAL() { return getToken(SqlBaseParser.BYTELENGTH_LITERAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode OUT() { return getToken(SqlBaseParser.OUT, 0); }
		public TerminalNode OF() { return getToken(SqlBaseParser.OF, 0); }
		public TerminalNode PERCENTLIT() { return getToken(SqlBaseParser.PERCENTLIT, 0); }
		public TerminalNode ROWS() { return getToken(SqlBaseParser.ROWS, 0); }
		public TerminalNode BUCKET() { return getToken(SqlBaseParser.BUCKET, 0); }
		public List<TerminalNode> INTEGER_VALUE() { return getTokens(SqlBaseParser.INTEGER_VALUE); }
		public TerminalNode INTEGER_VALUE(int i) {
			return getToken(SqlBaseParser.INTEGER_VALUE, i);
		}
		public TerminalNode DECIMAL_VALUE() { return getToken(SqlBaseParser.DECIMAL_VALUE, 0); }
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public SampleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sample; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSample(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSample(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSample(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SampleContext sample() throws RecognitionException {
		SampleContext _localctx = new SampleContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_sample);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(952);
			match(TABLESAMPLE);
			setState(953);
			match(LEFTBRACKET);
			setState(975);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
			case 1:
				{
				{
				setState(954);
				((SampleContext)_localctx).percentage = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==INTEGER_VALUE || _la==DECIMAL_VALUE) ) {
					((SampleContext)_localctx).percentage = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(955);
				((SampleContext)_localctx).sampleType = match(PERCENTLIT);
				}
				}
				break;
			case 2:
				{
				{
				setState(956);
				expression();
				setState(957);
				((SampleContext)_localctx).sampleType = match(ROWS);
				}
				}
				break;
			case 3:
				{
				setState(959);
				((SampleContext)_localctx).sampleType = match(BYTELENGTH_LITERAL);
				}
				break;
			case 4:
				{
				{
				setState(960);
				((SampleContext)_localctx).sampleType = match(BUCKET);
				setState(961);
				((SampleContext)_localctx).numerator = match(INTEGER_VALUE);
				setState(962);
				match(OUT);
				setState(963);
				match(OF);
				setState(964);
				((SampleContext)_localctx).denominator = match(INTEGER_VALUE);
				setState(973);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(965);
					match(ON);
					setState(971);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
					case 1:
						{
						setState(966);
						identifier();
						}
						break;
					case 2:
						{
						setState(967);
						qualifiedName();
						setState(968);
						match(LEFTBRACKET);
						setState(969);
						match(RIGHTBRACKET);
						}
						break;
					}
					}
				}

				}
				}
				break;
			}
			setState(977);
			match(RIGHTBRACKET);
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

	public static class IdentifierListContext extends ParserRuleContext {
		public IdentifierSeqContext identifierSeq() {
			return getRuleContext(IdentifierSeqContext.class,0);
		}
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIdentifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitIdentifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_identifierList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(979);
			match(LEFTBRACKET);
			setState(980);
			identifierSeq();
			setState(981);
			match(RIGHTBRACKET);
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

	public static class IdentifierSeqContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public IdentifierSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierSeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIdentifierSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIdentifierSeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitIdentifierSeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierSeqContext identifierSeq() throws RecognitionException {
		IdentifierSeqContext _localctx = new IdentifierSeqContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_identifierSeq);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(983);
			identifier();
			setState(988);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,113,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(984);
					match(COMMA);
					setState(985);
					identifier();
					}
					} 
				}
				setState(990);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,113,_ctx);
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

	public static class OrderedIdentifierListContext extends ParserRuleContext {
		public List<OrderedIdentifierContext> orderedIdentifier() {
			return getRuleContexts(OrderedIdentifierContext.class);
		}
		public OrderedIdentifierContext orderedIdentifier(int i) {
			return getRuleContext(OrderedIdentifierContext.class,i);
		}
		public OrderedIdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderedIdentifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterOrderedIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitOrderedIdentifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitOrderedIdentifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderedIdentifierListContext orderedIdentifierList() throws RecognitionException {
		OrderedIdentifierListContext _localctx = new OrderedIdentifierListContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_orderedIdentifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(991);
			match(LEFTBRACKET);
			setState(992);
			orderedIdentifier();
			setState(997);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(993);
				match(COMMA);
				setState(994);
				orderedIdentifier();
				}
				}
				setState(999);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1000);
			match(RIGHTBRACKET);
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

	public static class OrderedIdentifierContext extends ParserRuleContext {
		public Token ordering;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ASC() { return getToken(SqlBaseParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public OrderedIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderedIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterOrderedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitOrderedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitOrderedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderedIdentifierContext orderedIdentifier() throws RecognitionException {
		OrderedIdentifierContext _localctx = new OrderedIdentifierContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_orderedIdentifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1002);
			identifier();
			setState(1004);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(1003);
				((OrderedIdentifierContext)_localctx).ordering = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
					((OrderedIdentifierContext)_localctx).ordering = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
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

	public static class IdentifierCommentListContext extends ParserRuleContext {
		public List<IdentifierCommentContext> identifierComment() {
			return getRuleContexts(IdentifierCommentContext.class);
		}
		public IdentifierCommentContext identifierComment(int i) {
			return getRuleContext(IdentifierCommentContext.class,i);
		}
		public IdentifierCommentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierCommentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIdentifierCommentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIdentifierCommentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitIdentifierCommentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierCommentListContext identifierCommentList() throws RecognitionException {
		IdentifierCommentListContext _localctx = new IdentifierCommentListContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_identifierCommentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1006);
			match(LEFTBRACKET);
			setState(1007);
			identifierComment();
			setState(1012);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1008);
				match(COMMA);
				setState(1009);
				identifierComment();
				}
				}
				setState(1014);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1015);
			match(RIGHTBRACKET);
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

	public static class IdentifierCommentContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(SqlBaseParser.COMMENT, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public IdentifierCommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierComment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIdentifierComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIdentifierComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitIdentifierComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierCommentContext identifierComment() throws RecognitionException {
		IdentifierCommentContext _localctx = new IdentifierCommentContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_identifierComment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1017);
			identifier();
			setState(1020);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(1018);
				match(COMMENT);
				setState(1019);
				match(STRING);
				}
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

	public static class RelationPrimaryContext extends ParserRuleContext {
		public RelationPrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationPrimary; }
	 
		public RelationPrimaryContext() { }
		public void copyFrom(RelationPrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TableValuedFunctionContext extends RelationPrimaryContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TableValuedFunctionContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTableValuedFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTableValuedFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTableValuedFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InlineTableDefault2Context extends RelationPrimaryContext {
		public InlineTableContext inlineTable() {
			return getRuleContext(InlineTableContext.class,0);
		}
		public InlineTableDefault2Context(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterInlineTableDefault2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitInlineTableDefault2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitInlineTableDefault2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AliasedRelationContext extends RelationPrimaryContext {
		public RelationContext relation() {
			return getRuleContext(RelationContext.class,0);
		}
		public SampleContext sample() {
			return getRuleContext(SampleContext.class,0);
		}
		public StrictIdentifierContext strictIdentifier() {
			return getRuleContext(StrictIdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public AliasedRelationContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAliasedRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAliasedRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAliasedRelation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AliasedQueryContext extends RelationPrimaryContext {
		public QueryNoWithContext queryNoWith() {
			return getRuleContext(QueryNoWithContext.class,0);
		}
		public SampleContext sample() {
			return getRuleContext(SampleContext.class,0);
		}
		public StrictIdentifierContext strictIdentifier() {
			return getRuleContext(StrictIdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public AliasedQueryContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAliasedQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAliasedQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAliasedQuery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TableNameContext extends RelationPrimaryContext {
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public SampleContext sample() {
			return getRuleContext(SampleContext.class,0);
		}
		public StrictIdentifierContext strictIdentifier() {
			return getRuleContext(StrictIdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public TableNameContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTableName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationPrimaryContext relationPrimary() throws RecognitionException {
		RelationPrimaryContext _localctx = new RelationPrimaryContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_relationPrimary);
		int _la;
		try {
			setState(1071);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
			case 1:
				_localctx = new TableNameContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1022);
				tableIdentifier();
				setState(1024);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
				case 1:
					{
					setState(1023);
					sample();
					}
					break;
				}
				setState(1030);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
				case 1:
					{
					setState(1027);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
					case 1:
						{
						setState(1026);
						match(AS);
						}
						break;
					}
					setState(1029);
					strictIdentifier();
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new AliasedQueryContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1032);
				match(LEFTBRACKET);
				setState(1033);
				queryNoWith();
				setState(1034);
				match(RIGHTBRACKET);
				setState(1036);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
				case 1:
					{
					setState(1035);
					sample();
					}
					break;
				}
				setState(1042);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
				case 1:
					{
					setState(1039);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
					case 1:
						{
						setState(1038);
						match(AS);
						}
						break;
					}
					setState(1041);
					strictIdentifier();
					}
					break;
				}
				}
				break;
			case 3:
				_localctx = new AliasedRelationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1044);
				match(LEFTBRACKET);
				setState(1045);
				relation();
				setState(1046);
				match(RIGHTBRACKET);
				setState(1048);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
				case 1:
					{
					setState(1047);
					sample();
					}
					break;
				}
				setState(1054);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
				case 1:
					{
					setState(1051);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
					case 1:
						{
						setState(1050);
						match(AS);
						}
						break;
					}
					setState(1053);
					strictIdentifier();
					}
					break;
				}
				}
				break;
			case 4:
				_localctx = new InlineTableDefault2Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1056);
				inlineTable();
				}
				break;
			case 5:
				_localctx = new TableValuedFunctionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1057);
				identifier();
				setState(1058);
				match(LEFTBRACKET);
				setState(1067);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 11)) & ~0x3f) == 0 && ((1L << (_la - 11)) & ((1L << (SELECT - 11)) | (1L << (FROM - 11)) | (1L << (ADD - 11)) | (1L << (AS - 11)) | (1L << (LEFTBRACKET - 11)) | (1L << (ALL - 11)) | (1L << (DISTINCT - 11)) | (1L << (WHERE - 11)) | (1L << (GROUP - 11)) | (1L << (BY - 11)) | (1L << (GROUPING - 11)) | (1L << (SETS - 11)) | (1L << (CUBE - 11)) | (1L << (ROLLUP - 11)) | (1L << (ORDER - 11)) | (1L << (HAVING - 11)) | (1L << (LIMIT - 11)) | (1L << (AT - 11)) | (1L << (OR - 11)) | (1L << (AND - 11)) | (1L << (IN - 11)) | (1L << (NOT - 11)) | (1L << (NO - 11)) | (1L << (EXISTS - 11)) | (1L << (BETWEEN - 11)) | (1L << (LIKE - 11)) | (1L << (RLIKE - 11)) | (1L << (IS - 11)) | (1L << (NULL - 11)) | (1L << (TRUE - 11)) | (1L << (FALSE - 11)) | (1L << (NULLS - 11)) | (1L << (ASC - 11)) | (1L << (DESC - 11)) | (1L << (FOR - 11)) | (1L << (INTERVAL - 11)) | (1L << (CASE - 11)) | (1L << (WHEN - 11)) | (1L << (THEN - 11)) | (1L << (ELSE - 11)) | (1L << (END - 11)) | (1L << (JOIN - 11)) | (1L << (CROSS - 11)) | (1L << (OUTER - 11)) | (1L << (INNER - 11)) | (1L << (LEFT - 11)) | (1L << (SEMI - 11)) | (1L << (RIGHT - 11)) | (1L << (FULL - 11)) | (1L << (NATURAL - 11)) | (1L << (ON - 11)) | (1L << (LATERAL - 11)) | (1L << (WINDOW - 11)) | (1L << (OVER - 11)) | (1L << (PARTITION - 11)) | (1L << (RANGE - 11)) | (1L << (ROWS - 11)))) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (UNBOUNDED - 75)) | (1L << (PRECEDING - 75)) | (1L << (FOLLOWING - 75)) | (1L << (CURRENT - 75)) | (1L << (FIRST - 75)) | (1L << (AFTER - 75)) | (1L << (LAST - 75)) | (1L << (ROW - 75)) | (1L << (WITH - 75)) | (1L << (VALUES - 75)) | (1L << (CREATE - 75)) | (1L << (TABLE - 75)) | (1L << (VIEW - 75)) | (1L << (REPLACE - 75)) | (1L << (INSERT - 75)) | (1L << (DELETE - 75)) | (1L << (INTO - 75)) | (1L << (DESCRIBE - 75)) | (1L << (EXPLAIN - 75)) | (1L << (FORMAT - 75)) | (1L << (LOGICAL - 75)) | (1L << (CODEGEN - 75)) | (1L << (COST - 75)) | (1L << (CAST - 75)) | (1L << (SHOW - 75)) | (1L << (TABLES - 75)) | (1L << (COLUMNS - 75)) | (1L << (COLUMN - 75)) | (1L << (USE - 75)) | (1L << (PARTITIONS - 75)) | (1L << (FUNCTIONS - 75)) | (1L << (DROP - 75)) | (1L << (UNION - 75)) | (1L << (EXCEPT - 75)) | (1L << (SETMINUS - 75)) | (1L << (INTERSECT - 75)) | (1L << (TO - 75)) | (1L << (TABLESAMPLE - 75)) | (1L << (STRATIFY - 75)) | (1L << (ALTER - 75)) | (1L << (RENAME - 75)) | (1L << (ARRAY - 75)) | (1L << (MAP - 75)) | (1L << (STRUCT - 75)) | (1L << (COMMENT - 75)) | (1L << (SET - 75)) | (1L << (RESET - 75)) | (1L << (DATA - 75)) | (1L << (START - 75)) | (1L << (TRANSACTION - 75)) | (1L << (COMMIT - 75)) | (1L << (ROLLBACK - 75)) | (1L << (MACRO - 75)) | (1L << (IGNORE - 75)) | (1L << (IF - 75)))) != 0) || ((((_la - 145)) & ~0x3f) == 0 && ((1L << (_la - 145)) & ((1L << (PLUS - 145)) | (1L << (MINUS - 145)) | (1L << (ASTERISK - 145)) | (1L << (DIV - 145)) | (1L << (TILDE - 145)) | (1L << (PERCENTLIT - 145)) | (1L << (BUCKET - 145)) | (1L << (OUT - 145)) | (1L << (OF - 145)) | (1L << (SORT - 145)) | (1L << (CLUSTER - 145)) | (1L << (DISTRIBUTE - 145)) | (1L << (OVERWRITE - 145)) | (1L << (TRANSFORM - 145)) | (1L << (REDUCE - 145)) | (1L << (USING - 145)) | (1L << (SERDE - 145)) | (1L << (SERDEPROPERTIES - 145)) | (1L << (RECORDREADER - 145)) | (1L << (RECORDWRITER - 145)) | (1L << (DELIMITED - 145)) | (1L << (FIELDS - 145)) | (1L << (TERMINATED - 145)) | (1L << (COLLECTION - 145)) | (1L << (ITEMS - 145)) | (1L << (KEYS - 145)) | (1L << (ESCAPED - 145)) | (1L << (LINES - 145)) | (1L << (SEPARATED - 145)) | (1L << (FUNCTION - 145)) | (1L << (EXTENDED - 145)) | (1L << (REFRESH - 145)) | (1L << (CLEAR - 145)) | (1L << (CACHE - 145)) | (1L << (UNCACHE - 145)) | (1L << (LAZY - 145)) | (1L << (FORMATTED - 145)) | (1L << (GLOBAL - 145)) | (1L << (TEMPORARY - 145)) | (1L << (OPTIONS - 145)) | (1L << (UNSET - 145)) | (1L << (TBLPROPERTIES - 145)) | (1L << (DBPROPERTIES - 145)) | (1L << (BUCKETS - 145)) | (1L << (SKEWED - 145)) | (1L << (STORED - 145)) | (1L << (DIRECTORIES - 145)) | (1L << (LOCATION - 145)) | (1L << (EXCHANGE - 145)) | (1L << (ARCHIVE - 145)) | (1L << (UNARCHIVE - 145)) | (1L << (FILEFORMAT - 145)) | (1L << (TOUCH - 145)) | (1L << (COMPACT - 145)) | (1L << (CONCATENATE - 145)) | (1L << (CHANGE - 145)) | (1L << (CASCADE - 145)) | (1L << (RESTRICT - 145)) | (1L << (CLUSTERED - 145)))) != 0) || ((((_la - 209)) & ~0x3f) == 0 && ((1L << (_la - 209)) & ((1L << (SORTED - 209)) | (1L << (PURGE - 209)) | (1L << (INPUTFORMAT - 209)) | (1L << (OUTPUTFORMAT - 209)) | (1L << (DATABASE - 209)) | (1L << (DATABASES - 209)) | (1L << (DFS - 209)) | (1L << (TRUNCATE - 209)) | (1L << (ANALYZE - 209)) | (1L << (COMPUTE - 209)) | (1L << (LIST - 209)) | (1L << (STATISTICS - 209)) | (1L << (PARTITIONED - 209)) | (1L << (EXTERNAL - 209)) | (1L << (DEFINED - 209)) | (1L << (REVOKE - 209)) | (1L << (GRANT - 209)) | (1L << (LOCK - 209)) | (1L << (UNLOCK - 209)) | (1L << (MSCK - 209)) | (1L << (REPAIR - 209)) | (1L << (RECOVER - 209)) | (1L << (EXPORT - 209)) | (1L << (IMPORT - 209)) | (1L << (LOAD - 209)) | (1L << (ROLE - 209)) | (1L << (ROLES - 209)) | (1L << (COMPACTIONS - 209)) | (1L << (PRINCIPALS - 209)) | (1L << (TRANSACTIONS - 209)) | (1L << (INDEX - 209)) | (1L << (INDEXES - 209)) | (1L << (LOCKS - 209)) | (1L << (OPTION - 209)) | (1L << (ANTI - 209)) | (1L << (LOCAL - 209)) | (1L << (INPATH - 209)) | (1L << (CURRENT_DATE - 209)) | (1L << (CURRENT_TIMESTAMP - 209)) | (1L << (STRING - 209)) | (1L << (BIGINT_LITERAL - 209)) | (1L << (SMALLINT_LITERAL - 209)) | (1L << (TINYINT_LITERAL - 209)) | (1L << (INTEGER_VALUE - 209)) | (1L << (DECIMAL_VALUE - 209)) | (1L << (DOUBLE_LITERAL - 209)) | (1L << (BIGDECIMAL_LITERAL - 209)) | (1L << (IDENTIFIER - 209)) | (1L << (BACKQUOTED_IDENTIFIER - 209)))) != 0)) {
					{
					setState(1059);
					expression();
					setState(1064);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1060);
						match(COMMA);
						setState(1061);
						expression();
						}
						}
						setState(1066);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1069);
				match(RIGHTBRACKET);
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

	public static class InlineTableContext extends ParserRuleContext {
		public TerminalNode VALUES() { return getToken(SqlBaseParser.VALUES, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public InlineTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlineTable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterInlineTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitInlineTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitInlineTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InlineTableContext inlineTable() throws RecognitionException {
		InlineTableContext _localctx = new InlineTableContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_inlineTable);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1073);
			match(VALUES);
			setState(1074);
			expression();
			setState(1079);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,130,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1075);
					match(COMMA);
					setState(1076);
					expression();
					}
					} 
				}
				setState(1081);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,130,_ctx);
			}
			setState(1089);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
			case 1:
				{
				setState(1083);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
				case 1:
					{
					setState(1082);
					match(AS);
					}
					break;
				}
				setState(1085);
				identifier();
				setState(1087);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
				case 1:
					{
					setState(1086);
					identifierList();
					}
					break;
				}
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

	public static class RowFormatContext extends ParserRuleContext {
		public RowFormatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rowFormat; }
	 
		public RowFormatContext() { }
		public void copyFrom(RowFormatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RowFormatSerdeContext extends RowFormatContext {
		public Token name;
		public TablePropertyListContext props;
		public TerminalNode ROW() { return getToken(SqlBaseParser.ROW, 0); }
		public TerminalNode FORMAT() { return getToken(SqlBaseParser.FORMAT, 0); }
		public TerminalNode SERDE() { return getToken(SqlBaseParser.SERDE, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public TerminalNode SERDEPROPERTIES() { return getToken(SqlBaseParser.SERDEPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public RowFormatSerdeContext(RowFormatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRowFormatSerde(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRowFormatSerde(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRowFormatSerde(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RowFormatDelimitedContext extends RowFormatContext {
		public Token fieldsTerminatedBy;
		public Token escapedBy;
		public Token collectionItemsTerminatedBy;
		public Token keysTerminatedBy;
		public Token linesSeparatedBy;
		public Token nullDefinedAs;
		public TerminalNode ROW() { return getToken(SqlBaseParser.ROW, 0); }
		public TerminalNode FORMAT() { return getToken(SqlBaseParser.FORMAT, 0); }
		public TerminalNode DELIMITED() { return getToken(SqlBaseParser.DELIMITED, 0); }
		public TerminalNode FIELDS() { return getToken(SqlBaseParser.FIELDS, 0); }
		public List<TerminalNode> TERMINATED() { return getTokens(SqlBaseParser.TERMINATED); }
		public TerminalNode TERMINATED(int i) {
			return getToken(SqlBaseParser.TERMINATED, i);
		}
		public List<TerminalNode> BY() { return getTokens(SqlBaseParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(SqlBaseParser.BY, i);
		}
		public TerminalNode COLLECTION() { return getToken(SqlBaseParser.COLLECTION, 0); }
		public TerminalNode ITEMS() { return getToken(SqlBaseParser.ITEMS, 0); }
		public TerminalNode MAP() { return getToken(SqlBaseParser.MAP, 0); }
		public TerminalNode KEYS() { return getToken(SqlBaseParser.KEYS, 0); }
		public TerminalNode LINES() { return getToken(SqlBaseParser.LINES, 0); }
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public TerminalNode DEFINED() { return getToken(SqlBaseParser.DEFINED, 0); }
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public List<TerminalNode> STRING() { return getTokens(SqlBaseParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(SqlBaseParser.STRING, i);
		}
		public TerminalNode ESCAPED() { return getToken(SqlBaseParser.ESCAPED, 0); }
		public RowFormatDelimitedContext(RowFormatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRowFormatDelimited(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRowFormatDelimited(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRowFormatDelimited(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RowFormatContext rowFormat() throws RecognitionException {
		RowFormatContext _localctx = new RowFormatContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_rowFormat);
		try {
			setState(1140);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
			case 1:
				_localctx = new RowFormatSerdeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1091);
				match(ROW);
				setState(1092);
				match(FORMAT);
				setState(1093);
				match(SERDE);
				setState(1094);
				((RowFormatSerdeContext)_localctx).name = match(STRING);
				setState(1098);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
				case 1:
					{
					setState(1095);
					match(WITH);
					setState(1096);
					match(SERDEPROPERTIES);
					setState(1097);
					((RowFormatSerdeContext)_localctx).props = tablePropertyList();
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new RowFormatDelimitedContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1100);
				match(ROW);
				setState(1101);
				match(FORMAT);
				setState(1102);
				match(DELIMITED);
				setState(1112);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
				case 1:
					{
					setState(1103);
					match(FIELDS);
					setState(1104);
					match(TERMINATED);
					setState(1105);
					match(BY);
					setState(1106);
					((RowFormatDelimitedContext)_localctx).fieldsTerminatedBy = match(STRING);
					setState(1110);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
					case 1:
						{
						setState(1107);
						match(ESCAPED);
						setState(1108);
						match(BY);
						setState(1109);
						((RowFormatDelimitedContext)_localctx).escapedBy = match(STRING);
						}
						break;
					}
					}
					break;
				}
				setState(1119);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
				case 1:
					{
					setState(1114);
					match(COLLECTION);
					setState(1115);
					match(ITEMS);
					setState(1116);
					match(TERMINATED);
					setState(1117);
					match(BY);
					setState(1118);
					((RowFormatDelimitedContext)_localctx).collectionItemsTerminatedBy = match(STRING);
					}
					break;
				}
				setState(1126);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
				case 1:
					{
					setState(1121);
					match(MAP);
					setState(1122);
					match(KEYS);
					setState(1123);
					match(TERMINATED);
					setState(1124);
					match(BY);
					setState(1125);
					((RowFormatDelimitedContext)_localctx).keysTerminatedBy = match(STRING);
					}
					break;
				}
				setState(1132);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
				case 1:
					{
					setState(1128);
					match(LINES);
					setState(1129);
					match(TERMINATED);
					setState(1130);
					match(BY);
					setState(1131);
					((RowFormatDelimitedContext)_localctx).linesSeparatedBy = match(STRING);
					}
					break;
				}
				setState(1138);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
				case 1:
					{
					setState(1134);
					match(NULL);
					setState(1135);
					match(DEFINED);
					setState(1136);
					match(AS);
					setState(1137);
					((RowFormatDelimitedContext)_localctx).nullDefinedAs = match(STRING);
					}
					break;
				}
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

	public static class TableIdentifierContext extends ParserRuleContext {
		public IdentifierContext db;
		public IdentifierContext table;
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TableIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTableIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTableIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTableIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableIdentifierContext tableIdentifier() throws RecognitionException {
		TableIdentifierContext _localctx = new TableIdentifierContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_tableIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
			case 1:
				{
				setState(1142);
				((TableIdentifierContext)_localctx).db = identifier();
				setState(1143);
				match(T__2);
				}
				break;
			}
			setState(1147);
			((TableIdentifierContext)_localctx).table = identifier();
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

	public static class FunctionIdentifierContext extends ParserRuleContext {
		public IdentifierContext db;
		public IdentifierContext function;
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public FunctionIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterFunctionIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitFunctionIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitFunctionIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionIdentifierContext functionIdentifier() throws RecognitionException {
		FunctionIdentifierContext _localctx = new FunctionIdentifierContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_functionIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1152);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
			case 1:
				{
				setState(1149);
				((FunctionIdentifierContext)_localctx).db = identifier();
				setState(1150);
				match(T__2);
				}
				break;
			}
			setState(1154);
			((FunctionIdentifierContext)_localctx).function = identifier();
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

	public static class NamedExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public NamedExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNamedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNamedExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNamedExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedExpressionContext namedExpression() throws RecognitionException {
		NamedExpressionContext _localctx = new NamedExpressionContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_namedExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1156);
			expression();
			setState(1164);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
			case 1:
				{
				setState(1158);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
				case 1:
					{
					setState(1157);
					match(AS);
					}
					break;
				}
				setState(1162);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SELECT:
				case FROM:
				case ADD:
				case AS:
				case ALL:
				case DISTINCT:
				case WHERE:
				case GROUP:
				case BY:
				case GROUPING:
				case SETS:
				case CUBE:
				case ROLLUP:
				case ORDER:
				case HAVING:
				case LIMIT:
				case AT:
				case OR:
				case AND:
				case IN:
				case NOT:
				case NO:
				case EXISTS:
				case BETWEEN:
				case LIKE:
				case RLIKE:
				case IS:
				case NULL:
				case TRUE:
				case FALSE:
				case NULLS:
				case ASC:
				case DESC:
				case FOR:
				case INTERVAL:
				case CASE:
				case WHEN:
				case THEN:
				case ELSE:
				case END:
				case JOIN:
				case CROSS:
				case OUTER:
				case INNER:
				case LEFT:
				case SEMI:
				case RIGHT:
				case FULL:
				case NATURAL:
				case ON:
				case LATERAL:
				case WINDOW:
				case OVER:
				case PARTITION:
				case RANGE:
				case ROWS:
				case UNBOUNDED:
				case PRECEDING:
				case FOLLOWING:
				case CURRENT:
				case FIRST:
				case AFTER:
				case LAST:
				case ROW:
				case WITH:
				case VALUES:
				case CREATE:
				case TABLE:
				case VIEW:
				case REPLACE:
				case INSERT:
				case DELETE:
				case INTO:
				case DESCRIBE:
				case EXPLAIN:
				case FORMAT:
				case LOGICAL:
				case CODEGEN:
				case COST:
				case CAST:
				case SHOW:
				case TABLES:
				case COLUMNS:
				case COLUMN:
				case USE:
				case PARTITIONS:
				case FUNCTIONS:
				case DROP:
				case UNION:
				case EXCEPT:
				case SETMINUS:
				case INTERSECT:
				case TO:
				case TABLESAMPLE:
				case STRATIFY:
				case ALTER:
				case RENAME:
				case ARRAY:
				case MAP:
				case STRUCT:
				case COMMENT:
				case SET:
				case RESET:
				case DATA:
				case START:
				case TRANSACTION:
				case COMMIT:
				case ROLLBACK:
				case MACRO:
				case IGNORE:
				case IF:
				case DIV:
				case PERCENTLIT:
				case BUCKET:
				case OUT:
				case OF:
				case SORT:
				case CLUSTER:
				case DISTRIBUTE:
				case OVERWRITE:
				case TRANSFORM:
				case REDUCE:
				case USING:
				case SERDE:
				case SERDEPROPERTIES:
				case RECORDREADER:
				case RECORDWRITER:
				case DELIMITED:
				case FIELDS:
				case TERMINATED:
				case COLLECTION:
				case ITEMS:
				case KEYS:
				case ESCAPED:
				case LINES:
				case SEPARATED:
				case FUNCTION:
				case EXTENDED:
				case REFRESH:
				case CLEAR:
				case CACHE:
				case UNCACHE:
				case LAZY:
				case FORMATTED:
				case GLOBAL:
				case TEMPORARY:
				case OPTIONS:
				case UNSET:
				case TBLPROPERTIES:
				case DBPROPERTIES:
				case BUCKETS:
				case SKEWED:
				case STORED:
				case DIRECTORIES:
				case LOCATION:
				case EXCHANGE:
				case ARCHIVE:
				case UNARCHIVE:
				case FILEFORMAT:
				case TOUCH:
				case COMPACT:
				case CONCATENATE:
				case CHANGE:
				case CASCADE:
				case RESTRICT:
				case CLUSTERED:
				case SORTED:
				case PURGE:
				case INPUTFORMAT:
				case OUTPUTFORMAT:
				case DATABASE:
				case DATABASES:
				case DFS:
				case TRUNCATE:
				case ANALYZE:
				case COMPUTE:
				case LIST:
				case STATISTICS:
				case PARTITIONED:
				case EXTERNAL:
				case DEFINED:
				case REVOKE:
				case GRANT:
				case LOCK:
				case UNLOCK:
				case MSCK:
				case REPAIR:
				case RECOVER:
				case EXPORT:
				case IMPORT:
				case LOAD:
				case ROLE:
				case ROLES:
				case COMPACTIONS:
				case PRINCIPALS:
				case TRANSACTIONS:
				case INDEX:
				case INDEXES:
				case LOCKS:
				case OPTION:
				case ANTI:
				case LOCAL:
				case INPATH:
				case CURRENT_DATE:
				case CURRENT_TIMESTAMP:
				case INTEGER_VALUE:
				case IDENTIFIER:
				case BACKQUOTED_IDENTIFIER:
					{
					setState(1160);
					identifier();
					}
					break;
				case LEFTBRACKET:
					{
					setState(1161);
					identifierList();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
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

	public static class NamedExpressionSeqContext extends ParserRuleContext {
		public List<NamedExpressionContext> namedExpression() {
			return getRuleContexts(NamedExpressionContext.class);
		}
		public NamedExpressionContext namedExpression(int i) {
			return getRuleContext(NamedExpressionContext.class,i);
		}
		public NamedExpressionSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedExpressionSeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNamedExpressionSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNamedExpressionSeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNamedExpressionSeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedExpressionSeqContext namedExpressionSeq() throws RecognitionException {
		NamedExpressionSeqContext _localctx = new NamedExpressionSeqContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_namedExpressionSeq);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1166);
			namedExpression();
			setState(1171);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,147,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1167);
					match(COMMA);
					setState(1168);
					namedExpression();
					}
					} 
				}
				setState(1173);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,147,_ctx);
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

	public static class ExpressionContext extends ParserRuleContext {
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1174);
			booleanExpression(0);
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

	public static class BooleanExpressionContext extends ParserRuleContext {
		public BooleanExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanExpression; }
	 
		public BooleanExpressionContext() { }
		public void copyFrom(BooleanExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LogicalNotContext extends BooleanExpressionContext {
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public LogicalNotContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterLogicalNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitLogicalNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitLogicalNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanDefaultContext extends BooleanExpressionContext {
		public PredicatedContext predicated() {
			return getRuleContext(PredicatedContext.class,0);
		}
		public BooleanDefaultContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterBooleanDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitBooleanDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitBooleanDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExistsContext extends BooleanExpressionContext {
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public ExistsContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterExists(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitExists(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitExists(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalBinaryContext extends BooleanExpressionContext {
		public BooleanExpressionContext left;
		public Token operator;
		public BooleanExpressionContext right;
		public List<BooleanExpressionContext> booleanExpression() {
			return getRuleContexts(BooleanExpressionContext.class);
		}
		public BooleanExpressionContext booleanExpression(int i) {
			return getRuleContext(BooleanExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(SqlBaseParser.AND, 0); }
		public TerminalNode OR() { return getToken(SqlBaseParser.OR, 0); }
		public LogicalBinaryContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterLogicalBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitLogicalBinary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitLogicalBinary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanExpressionContext booleanExpression() throws RecognitionException {
		return booleanExpression(0);
	}

	private BooleanExpressionContext booleanExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BooleanExpressionContext _localctx = new BooleanExpressionContext(_ctx, _parentState);
		BooleanExpressionContext _prevctx = _localctx;
		int _startState = 148;
		enterRecursionRule(_localctx, 148, RULE_booleanExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1185);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
			case 1:
				{
				_localctx = new LogicalNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1177);
				match(NOT);
				setState(1178);
				booleanExpression(5);
				}
				break;
			case 2:
				{
				_localctx = new ExistsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1179);
				match(EXISTS);
				setState(1180);
				match(LEFTBRACKET);
				setState(1181);
				query();
				setState(1182);
				match(RIGHTBRACKET);
				}
				break;
			case 3:
				{
				_localctx = new BooleanDefaultContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1184);
				predicated();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1195);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,150,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1193);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
					case 1:
						{
						_localctx = new LogicalBinaryContext(new BooleanExpressionContext(_parentctx, _parentState));
						((LogicalBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(1187);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1188);
						((LogicalBinaryContext)_localctx).operator = match(AND);
						setState(1189);
						((LogicalBinaryContext)_localctx).right = booleanExpression(3);
						}
						break;
					case 2:
						{
						_localctx = new LogicalBinaryContext(new BooleanExpressionContext(_parentctx, _parentState));
						((LogicalBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(1190);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1191);
						((LogicalBinaryContext)_localctx).operator = match(OR);
						setState(1192);
						((LogicalBinaryContext)_localctx).right = booleanExpression(2);
						}
						break;
					}
					} 
				}
				setState(1197);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,150,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PredicatedContext extends ParserRuleContext {
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public PredicatedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicated; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPredicated(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPredicated(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPredicated(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicatedContext predicated() throws RecognitionException {
		PredicatedContext _localctx = new PredicatedContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_predicated);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1198);
			valueExpression(0);
			setState(1200);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
			case 1:
				{
				setState(1199);
				predicate();
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

	public static class PredicateContext extends ParserRuleContext {
		public Token kind;
		public ValueExpressionContext lower;
		public ValueExpressionContext upper;
		public ValueExpressionContext pattern;
		public TerminalNode AND() { return getToken(SqlBaseParser.AND, 0); }
		public TerminalNode BETWEEN() { return getToken(SqlBaseParser.BETWEEN, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode RLIKE() { return getToken(SqlBaseParser.RLIKE, 0); }
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public TerminalNode IS() { return getToken(SqlBaseParser.IS, 0); }
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_predicate);
		int _la;
		try {
			setState(1243);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1203);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1202);
					match(NOT);
					}
				}

				setState(1205);
				((PredicateContext)_localctx).kind = match(BETWEEN);
				setState(1206);
				((PredicateContext)_localctx).lower = valueExpression(0);
				setState(1207);
				match(AND);
				setState(1208);
				((PredicateContext)_localctx).upper = valueExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1211);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1210);
					match(NOT);
					}
				}

				setState(1213);
				((PredicateContext)_localctx).kind = match(IN);
				setState(1214);
				match(LEFTBRACKET);
				setState(1215);
				expression();
				setState(1220);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1216);
					match(COMMA);
					setState(1217);
					expression();
					}
					}
					setState(1222);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1223);
				match(RIGHTBRACKET);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1226);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1225);
					match(NOT);
					}
				}

				setState(1228);
				((PredicateContext)_localctx).kind = match(IN);
				setState(1229);
				match(LEFTBRACKET);
				setState(1230);
				query();
				setState(1231);
				match(RIGHTBRACKET);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1234);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1233);
					match(NOT);
					}
				}

				setState(1236);
				((PredicateContext)_localctx).kind = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==LIKE || _la==RLIKE) ) {
					((PredicateContext)_localctx).kind = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1237);
				((PredicateContext)_localctx).pattern = valueExpression(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1238);
				match(IS);
				setState(1240);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1239);
					match(NOT);
					}
				}

				setState(1242);
				((PredicateContext)_localctx).kind = match(NULL);
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

	public static class ValueExpressionContext extends ParserRuleContext {
		public ValueExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueExpression; }
	 
		public ValueExpressionContext() { }
		public void copyFrom(ValueExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ValueExpressionDefaultContext extends ValueExpressionContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public ValueExpressionDefaultContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterValueExpressionDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitValueExpressionDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitValueExpressionDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComparisonContext extends ValueExpressionContext {
		public ValueExpressionContext left;
		public ValueExpressionContext right;
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public ComparisonContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitComparison(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArithmeticBinaryContext extends ValueExpressionContext {
		public ValueExpressionContext left;
		public Token operator;
		public ValueExpressionContext right;
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode ASTERISK() { return getToken(SqlBaseParser.ASTERISK, 0); }
		public TerminalNode SLASH() { return getToken(SqlBaseParser.SLASH, 0); }
		public TerminalNode PERCENT() { return getToken(SqlBaseParser.PERCENT, 0); }
		public TerminalNode DIV() { return getToken(SqlBaseParser.DIV, 0); }
		public TerminalNode PLUS() { return getToken(SqlBaseParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public TerminalNode AMPERSAND() { return getToken(SqlBaseParser.AMPERSAND, 0); }
		public TerminalNode HAT() { return getToken(SqlBaseParser.HAT, 0); }
		public TerminalNode PIPE() { return getToken(SqlBaseParser.PIPE, 0); }
		public ArithmeticBinaryContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterArithmeticBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitArithmeticBinary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitArithmeticBinary(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArithmeticUnaryContext extends ValueExpressionContext {
		public Token operator;
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(SqlBaseParser.PLUS, 0); }
		public TerminalNode TILDE() { return getToken(SqlBaseParser.TILDE, 0); }
		public ArithmeticUnaryContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterArithmeticUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitArithmeticUnary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitArithmeticUnary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueExpressionContext valueExpression() throws RecognitionException {
		return valueExpression(0);
	}

	private ValueExpressionContext valueExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ValueExpressionContext _localctx = new ValueExpressionContext(_ctx, _parentState);
		ValueExpressionContext _prevctx = _localctx;
		int _startState = 154;
		enterRecursionRule(_localctx, 154, RULE_valueExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1249);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
			case 1:
				{
				_localctx = new ValueExpressionDefaultContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1246);
				primaryExpression(0);
				}
				break;
			case 2:
				{
				_localctx = new ArithmeticUnaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1247);
				((ArithmeticUnaryContext)_localctx).operator = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 145)) & ~0x3f) == 0 && ((1L << (_la - 145)) & ((1L << (PLUS - 145)) | (1L << (MINUS - 145)) | (1L << (TILDE - 145)))) != 0)) ) {
					((ArithmeticUnaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1248);
				valueExpression(7);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1272);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,161,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1270);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
					case 1:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(1251);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1252);
						((ArithmeticBinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 147)) & ~0x3f) == 0 && ((1L << (_la - 147)) & ((1L << (ASTERISK - 147)) | (1L << (SLASH - 147)) | (1L << (PERCENT - 147)) | (1L << (DIV - 147)))) != 0)) ) {
							((ArithmeticBinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1253);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(7);
						}
						break;
					case 2:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(1254);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1255);
						((ArithmeticBinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((ArithmeticBinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1256);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(6);
						}
						break;
					case 3:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(1257);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1258);
						((ArithmeticBinaryContext)_localctx).operator = match(AMPERSAND);
						setState(1259);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(5);
						}
						break;
					case 4:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(1260);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1261);
						((ArithmeticBinaryContext)_localctx).operator = match(HAT);
						setState(1262);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(4);
						}
						break;
					case 5:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(1263);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1264);
						((ArithmeticBinaryContext)_localctx).operator = match(PIPE);
						setState(1265);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(3);
						}
						break;
					case 6:
						{
						_localctx = new ComparisonContext(new ValueExpressionContext(_parentctx, _parentState));
						((ComparisonContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(1266);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1267);
						comparisonOperator();
						setState(1268);
						((ComparisonContext)_localctx).right = valueExpression(2);
						}
						break;
					}
					} 
				}
				setState(1274);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,161,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PrimaryExpressionContext extends ParserRuleContext {
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
	 
		public PrimaryExpressionContext() { }
		public void copyFrom(PrimaryExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StructContext extends PrimaryExpressionContext {
		public NamedExpressionContext namedExpression;
		public List<NamedExpressionContext> argument = new ArrayList<NamedExpressionContext>();
		public TerminalNode STRUCT() { return getToken(SqlBaseParser.STRUCT, 0); }
		public List<NamedExpressionContext> namedExpression() {
			return getRuleContexts(NamedExpressionContext.class);
		}
		public NamedExpressionContext namedExpression(int i) {
			return getRuleContext(NamedExpressionContext.class,i);
		}
		public StructContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterStruct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitStruct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitStruct(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DereferenceContext extends PrimaryExpressionContext {
		public PrimaryExpressionContext base;
		public IdentifierContext fieldName;
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DereferenceContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDereference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDereference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDereference(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SimpleCaseContext extends PrimaryExpressionContext {
		public ExpressionContext value;
		public ExpressionContext elseExpression;
		public TerminalNode CASE() { return getToken(SqlBaseParser.CASE, 0); }
		public TerminalNode END() { return getToken(SqlBaseParser.END, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<WhenClauseContext> whenClause() {
			return getRuleContexts(WhenClauseContext.class);
		}
		public WhenClauseContext whenClause(int i) {
			return getRuleContext(WhenClauseContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(SqlBaseParser.ELSE, 0); }
		public SimpleCaseContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSimpleCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSimpleCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSimpleCase(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnReferenceContext extends PrimaryExpressionContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ColumnReferenceContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterColumnReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitColumnReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitColumnReference(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RowConstructorContext extends PrimaryExpressionContext {
		public List<NamedExpressionContext> namedExpression() {
			return getRuleContexts(NamedExpressionContext.class);
		}
		public NamedExpressionContext namedExpression(int i) {
			return getRuleContext(NamedExpressionContext.class,i);
		}
		public RowConstructorContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRowConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRowConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRowConstructor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LastContext extends PrimaryExpressionContext {
		public TerminalNode LAST() { return getToken(SqlBaseParser.LAST, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IGNORE() { return getToken(SqlBaseParser.IGNORE, 0); }
		public TerminalNode NULLS() { return getToken(SqlBaseParser.NULLS, 0); }
		public LastContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterLast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitLast(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitLast(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StarContext extends PrimaryExpressionContext {
		public TerminalNode ASTERISK() { return getToken(SqlBaseParser.ASTERISK, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public StarContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterStar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitStar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitStar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubscriptContext extends PrimaryExpressionContext {
		public PrimaryExpressionContext value;
		public ValueExpressionContext index;
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public SubscriptContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSubscript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSubscript(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSubscript(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TimeFunctionCallContext extends PrimaryExpressionContext {
		public Token name;
		public TerminalNode CURRENT_DATE() { return getToken(SqlBaseParser.CURRENT_DATE, 0); }
		public TerminalNode CURRENT_TIMESTAMP() { return getToken(SqlBaseParser.CURRENT_TIMESTAMP, 0); }
		public TimeFunctionCallContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTimeFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTimeFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTimeFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubqueryExpressionContext extends PrimaryExpressionContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public SubqueryExpressionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSubqueryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSubqueryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSubqueryExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CastContext extends PrimaryExpressionContext {
		public TerminalNode CAST() { return getToken(SqlBaseParser.CAST, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public CastContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCast(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCast(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConstantDefaultContext extends PrimaryExpressionContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public ConstantDefaultContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterConstantDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitConstantDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitConstantDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenthesizedExpressionContext extends PrimaryExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParenthesizedExpressionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterParenthesizedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitParenthesizedExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitParenthesizedExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionCallContext extends PrimaryExpressionContext {
		public ExpressionContext expression;
		public List<ExpressionContext> argument = new ArrayList<ExpressionContext>();
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode OVER() { return getToken(SqlBaseParser.OVER, 0); }
		public WindowSpecContext windowSpec() {
			return getRuleContext(WindowSpecContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public FunctionCallContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SearchedCaseContext extends PrimaryExpressionContext {
		public ExpressionContext elseExpression;
		public TerminalNode CASE() { return getToken(SqlBaseParser.CASE, 0); }
		public TerminalNode END() { return getToken(SqlBaseParser.END, 0); }
		public List<WhenClauseContext> whenClause() {
			return getRuleContexts(WhenClauseContext.class);
		}
		public WhenClauseContext whenClause(int i) {
			return getRuleContext(WhenClauseContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(SqlBaseParser.ELSE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SearchedCaseContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSearchedCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSearchedCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSearchedCase(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FirstContext extends PrimaryExpressionContext {
		public TerminalNode FIRST() { return getToken(SqlBaseParser.FIRST, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IGNORE() { return getToken(SqlBaseParser.IGNORE, 0); }
		public TerminalNode NULLS() { return getToken(SqlBaseParser.NULLS, 0); }
		public FirstContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterFirst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitFirst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitFirst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		return primaryExpression(0);
	}

	private PrimaryExpressionContext primaryExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, _parentState);
		PrimaryExpressionContext _prevctx = _localctx;
		int _startState = 156;
		enterRecursionRule(_localctx, 156, RULE_primaryExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1385);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,175,_ctx) ) {
			case 1:
				{
				_localctx = new TimeFunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1276);
				((TimeFunctionCallContext)_localctx).name = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==CURRENT_DATE || _la==CURRENT_TIMESTAMP) ) {
					((TimeFunctionCallContext)_localctx).name = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 2:
				{
				_localctx = new SearchedCaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1277);
				match(CASE);
				setState(1279); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1278);
					whenClause();
					}
					}
					setState(1281); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(1285);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(1283);
					match(ELSE);
					setState(1284);
					((SearchedCaseContext)_localctx).elseExpression = expression();
					}
				}

				setState(1287);
				match(END);
				}
				break;
			case 3:
				{
				_localctx = new SimpleCaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1289);
				match(CASE);
				setState(1290);
				((SimpleCaseContext)_localctx).value = expression();
				setState(1292); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1291);
					whenClause();
					}
					}
					setState(1294); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(1298);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(1296);
					match(ELSE);
					setState(1297);
					((SimpleCaseContext)_localctx).elseExpression = expression();
					}
				}

				setState(1300);
				match(END);
				}
				break;
			case 4:
				{
				_localctx = new CastContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1302);
				match(CAST);
				setState(1303);
				match(LEFTBRACKET);
				setState(1304);
				expression();
				setState(1305);
				match(AS);
				setState(1306);
				dataType();
				setState(1307);
				match(RIGHTBRACKET);
				}
				break;
			case 5:
				{
				_localctx = new StructContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1309);
				match(STRUCT);
				setState(1310);
				match(LEFTBRACKET);
				setState(1319);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 11)) & ~0x3f) == 0 && ((1L << (_la - 11)) & ((1L << (SELECT - 11)) | (1L << (FROM - 11)) | (1L << (ADD - 11)) | (1L << (AS - 11)) | (1L << (LEFTBRACKET - 11)) | (1L << (ALL - 11)) | (1L << (DISTINCT - 11)) | (1L << (WHERE - 11)) | (1L << (GROUP - 11)) | (1L << (BY - 11)) | (1L << (GROUPING - 11)) | (1L << (SETS - 11)) | (1L << (CUBE - 11)) | (1L << (ROLLUP - 11)) | (1L << (ORDER - 11)) | (1L << (HAVING - 11)) | (1L << (LIMIT - 11)) | (1L << (AT - 11)) | (1L << (OR - 11)) | (1L << (AND - 11)) | (1L << (IN - 11)) | (1L << (NOT - 11)) | (1L << (NO - 11)) | (1L << (EXISTS - 11)) | (1L << (BETWEEN - 11)) | (1L << (LIKE - 11)) | (1L << (RLIKE - 11)) | (1L << (IS - 11)) | (1L << (NULL - 11)) | (1L << (TRUE - 11)) | (1L << (FALSE - 11)) | (1L << (NULLS - 11)) | (1L << (ASC - 11)) | (1L << (DESC - 11)) | (1L << (FOR - 11)) | (1L << (INTERVAL - 11)) | (1L << (CASE - 11)) | (1L << (WHEN - 11)) | (1L << (THEN - 11)) | (1L << (ELSE - 11)) | (1L << (END - 11)) | (1L << (JOIN - 11)) | (1L << (CROSS - 11)) | (1L << (OUTER - 11)) | (1L << (INNER - 11)) | (1L << (LEFT - 11)) | (1L << (SEMI - 11)) | (1L << (RIGHT - 11)) | (1L << (FULL - 11)) | (1L << (NATURAL - 11)) | (1L << (ON - 11)) | (1L << (LATERAL - 11)) | (1L << (WINDOW - 11)) | (1L << (OVER - 11)) | (1L << (PARTITION - 11)) | (1L << (RANGE - 11)) | (1L << (ROWS - 11)))) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (UNBOUNDED - 75)) | (1L << (PRECEDING - 75)) | (1L << (FOLLOWING - 75)) | (1L << (CURRENT - 75)) | (1L << (FIRST - 75)) | (1L << (AFTER - 75)) | (1L << (LAST - 75)) | (1L << (ROW - 75)) | (1L << (WITH - 75)) | (1L << (VALUES - 75)) | (1L << (CREATE - 75)) | (1L << (TABLE - 75)) | (1L << (VIEW - 75)) | (1L << (REPLACE - 75)) | (1L << (INSERT - 75)) | (1L << (DELETE - 75)) | (1L << (INTO - 75)) | (1L << (DESCRIBE - 75)) | (1L << (EXPLAIN - 75)) | (1L << (FORMAT - 75)) | (1L << (LOGICAL - 75)) | (1L << (CODEGEN - 75)) | (1L << (COST - 75)) | (1L << (CAST - 75)) | (1L << (SHOW - 75)) | (1L << (TABLES - 75)) | (1L << (COLUMNS - 75)) | (1L << (COLUMN - 75)) | (1L << (USE - 75)) | (1L << (PARTITIONS - 75)) | (1L << (FUNCTIONS - 75)) | (1L << (DROP - 75)) | (1L << (UNION - 75)) | (1L << (EXCEPT - 75)) | (1L << (SETMINUS - 75)) | (1L << (INTERSECT - 75)) | (1L << (TO - 75)) | (1L << (TABLESAMPLE - 75)) | (1L << (STRATIFY - 75)) | (1L << (ALTER - 75)) | (1L << (RENAME - 75)) | (1L << (ARRAY - 75)) | (1L << (MAP - 75)) | (1L << (STRUCT - 75)) | (1L << (COMMENT - 75)) | (1L << (SET - 75)) | (1L << (RESET - 75)) | (1L << (DATA - 75)) | (1L << (START - 75)) | (1L << (TRANSACTION - 75)) | (1L << (COMMIT - 75)) | (1L << (ROLLBACK - 75)) | (1L << (MACRO - 75)) | (1L << (IGNORE - 75)) | (1L << (IF - 75)))) != 0) || ((((_la - 145)) & ~0x3f) == 0 && ((1L << (_la - 145)) & ((1L << (PLUS - 145)) | (1L << (MINUS - 145)) | (1L << (ASTERISK - 145)) | (1L << (DIV - 145)) | (1L << (TILDE - 145)) | (1L << (PERCENTLIT - 145)) | (1L << (BUCKET - 145)) | (1L << (OUT - 145)) | (1L << (OF - 145)) | (1L << (SORT - 145)) | (1L << (CLUSTER - 145)) | (1L << (DISTRIBUTE - 145)) | (1L << (OVERWRITE - 145)) | (1L << (TRANSFORM - 145)) | (1L << (REDUCE - 145)) | (1L << (USING - 145)) | (1L << (SERDE - 145)) | (1L << (SERDEPROPERTIES - 145)) | (1L << (RECORDREADER - 145)) | (1L << (RECORDWRITER - 145)) | (1L << (DELIMITED - 145)) | (1L << (FIELDS - 145)) | (1L << (TERMINATED - 145)) | (1L << (COLLECTION - 145)) | (1L << (ITEMS - 145)) | (1L << (KEYS - 145)) | (1L << (ESCAPED - 145)) | (1L << (LINES - 145)) | (1L << (SEPARATED - 145)) | (1L << (FUNCTION - 145)) | (1L << (EXTENDED - 145)) | (1L << (REFRESH - 145)) | (1L << (CLEAR - 145)) | (1L << (CACHE - 145)) | (1L << (UNCACHE - 145)) | (1L << (LAZY - 145)) | (1L << (FORMATTED - 145)) | (1L << (GLOBAL - 145)) | (1L << (TEMPORARY - 145)) | (1L << (OPTIONS - 145)) | (1L << (UNSET - 145)) | (1L << (TBLPROPERTIES - 145)) | (1L << (DBPROPERTIES - 145)) | (1L << (BUCKETS - 145)) | (1L << (SKEWED - 145)) | (1L << (STORED - 145)) | (1L << (DIRECTORIES - 145)) | (1L << (LOCATION - 145)) | (1L << (EXCHANGE - 145)) | (1L << (ARCHIVE - 145)) | (1L << (UNARCHIVE - 145)) | (1L << (FILEFORMAT - 145)) | (1L << (TOUCH - 145)) | (1L << (COMPACT - 145)) | (1L << (CONCATENATE - 145)) | (1L << (CHANGE - 145)) | (1L << (CASCADE - 145)) | (1L << (RESTRICT - 145)) | (1L << (CLUSTERED - 145)))) != 0) || ((((_la - 209)) & ~0x3f) == 0 && ((1L << (_la - 209)) & ((1L << (SORTED - 209)) | (1L << (PURGE - 209)) | (1L << (INPUTFORMAT - 209)) | (1L << (OUTPUTFORMAT - 209)) | (1L << (DATABASE - 209)) | (1L << (DATABASES - 209)) | (1L << (DFS - 209)) | (1L << (TRUNCATE - 209)) | (1L << (ANALYZE - 209)) | (1L << (COMPUTE - 209)) | (1L << (LIST - 209)) | (1L << (STATISTICS - 209)) | (1L << (PARTITIONED - 209)) | (1L << (EXTERNAL - 209)) | (1L << (DEFINED - 209)) | (1L << (REVOKE - 209)) | (1L << (GRANT - 209)) | (1L << (LOCK - 209)) | (1L << (UNLOCK - 209)) | (1L << (MSCK - 209)) | (1L << (REPAIR - 209)) | (1L << (RECOVER - 209)) | (1L << (EXPORT - 209)) | (1L << (IMPORT - 209)) | (1L << (LOAD - 209)) | (1L << (ROLE - 209)) | (1L << (ROLES - 209)) | (1L << (COMPACTIONS - 209)) | (1L << (PRINCIPALS - 209)) | (1L << (TRANSACTIONS - 209)) | (1L << (INDEX - 209)) | (1L << (INDEXES - 209)) | (1L << (LOCKS - 209)) | (1L << (OPTION - 209)) | (1L << (ANTI - 209)) | (1L << (LOCAL - 209)) | (1L << (INPATH - 209)) | (1L << (CURRENT_DATE - 209)) | (1L << (CURRENT_TIMESTAMP - 209)) | (1L << (STRING - 209)) | (1L << (BIGINT_LITERAL - 209)) | (1L << (SMALLINT_LITERAL - 209)) | (1L << (TINYINT_LITERAL - 209)) | (1L << (INTEGER_VALUE - 209)) | (1L << (DECIMAL_VALUE - 209)) | (1L << (DOUBLE_LITERAL - 209)) | (1L << (BIGDECIMAL_LITERAL - 209)) | (1L << (IDENTIFIER - 209)) | (1L << (BACKQUOTED_IDENTIFIER - 209)))) != 0)) {
					{
					setState(1311);
					((StructContext)_localctx).namedExpression = namedExpression();
					((StructContext)_localctx).argument.add(((StructContext)_localctx).namedExpression);
					setState(1316);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1312);
						match(COMMA);
						setState(1313);
						((StructContext)_localctx).namedExpression = namedExpression();
						((StructContext)_localctx).argument.add(((StructContext)_localctx).namedExpression);
						}
						}
						setState(1318);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1321);
				match(RIGHTBRACKET);
				}
				break;
			case 6:
				{
				_localctx = new FirstContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1322);
				match(FIRST);
				setState(1323);
				match(LEFTBRACKET);
				setState(1324);
				expression();
				setState(1327);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IGNORE) {
					{
					setState(1325);
					match(IGNORE);
					setState(1326);
					match(NULLS);
					}
				}

				setState(1329);
				match(RIGHTBRACKET);
				}
				break;
			case 7:
				{
				_localctx = new LastContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1331);
				match(LAST);
				setState(1332);
				match(LEFTBRACKET);
				setState(1333);
				expression();
				setState(1336);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IGNORE) {
					{
					setState(1334);
					match(IGNORE);
					setState(1335);
					match(NULLS);
					}
				}

				setState(1338);
				match(RIGHTBRACKET);
				}
				break;
			case 8:
				{
				_localctx = new ConstantDefaultContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1340);
				constant();
				}
				break;
			case 9:
				{
				_localctx = new StarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1341);
				match(ASTERISK);
				}
				break;
			case 10:
				{
				_localctx = new StarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1342);
				qualifiedName();
				setState(1343);
				match(T__2);
				setState(1344);
				match(ASTERISK);
				}
				break;
			case 11:
				{
				_localctx = new RowConstructorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1346);
				match(LEFTBRACKET);
				setState(1347);
				namedExpression();
				setState(1350); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1348);
					match(COMMA);
					setState(1349);
					namedExpression();
					}
					}
					setState(1352); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==COMMA );
				setState(1354);
				match(RIGHTBRACKET);
				}
				break;
			case 12:
				{
				_localctx = new SubqueryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1356);
				match(LEFTBRACKET);
				setState(1357);
				query();
				setState(1358);
				match(RIGHTBRACKET);
				}
				break;
			case 13:
				{
				_localctx = new FunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1360);
				qualifiedName();
				setState(1361);
				match(LEFTBRACKET);
				setState(1373);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 11)) & ~0x3f) == 0 && ((1L << (_la - 11)) & ((1L << (SELECT - 11)) | (1L << (FROM - 11)) | (1L << (ADD - 11)) | (1L << (AS - 11)) | (1L << (LEFTBRACKET - 11)) | (1L << (ALL - 11)) | (1L << (DISTINCT - 11)) | (1L << (WHERE - 11)) | (1L << (GROUP - 11)) | (1L << (BY - 11)) | (1L << (GROUPING - 11)) | (1L << (SETS - 11)) | (1L << (CUBE - 11)) | (1L << (ROLLUP - 11)) | (1L << (ORDER - 11)) | (1L << (HAVING - 11)) | (1L << (LIMIT - 11)) | (1L << (AT - 11)) | (1L << (OR - 11)) | (1L << (AND - 11)) | (1L << (IN - 11)) | (1L << (NOT - 11)) | (1L << (NO - 11)) | (1L << (EXISTS - 11)) | (1L << (BETWEEN - 11)) | (1L << (LIKE - 11)) | (1L << (RLIKE - 11)) | (1L << (IS - 11)) | (1L << (NULL - 11)) | (1L << (TRUE - 11)) | (1L << (FALSE - 11)) | (1L << (NULLS - 11)) | (1L << (ASC - 11)) | (1L << (DESC - 11)) | (1L << (FOR - 11)) | (1L << (INTERVAL - 11)) | (1L << (CASE - 11)) | (1L << (WHEN - 11)) | (1L << (THEN - 11)) | (1L << (ELSE - 11)) | (1L << (END - 11)) | (1L << (JOIN - 11)) | (1L << (CROSS - 11)) | (1L << (OUTER - 11)) | (1L << (INNER - 11)) | (1L << (LEFT - 11)) | (1L << (SEMI - 11)) | (1L << (RIGHT - 11)) | (1L << (FULL - 11)) | (1L << (NATURAL - 11)) | (1L << (ON - 11)) | (1L << (LATERAL - 11)) | (1L << (WINDOW - 11)) | (1L << (OVER - 11)) | (1L << (PARTITION - 11)) | (1L << (RANGE - 11)) | (1L << (ROWS - 11)))) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (UNBOUNDED - 75)) | (1L << (PRECEDING - 75)) | (1L << (FOLLOWING - 75)) | (1L << (CURRENT - 75)) | (1L << (FIRST - 75)) | (1L << (AFTER - 75)) | (1L << (LAST - 75)) | (1L << (ROW - 75)) | (1L << (WITH - 75)) | (1L << (VALUES - 75)) | (1L << (CREATE - 75)) | (1L << (TABLE - 75)) | (1L << (VIEW - 75)) | (1L << (REPLACE - 75)) | (1L << (INSERT - 75)) | (1L << (DELETE - 75)) | (1L << (INTO - 75)) | (1L << (DESCRIBE - 75)) | (1L << (EXPLAIN - 75)) | (1L << (FORMAT - 75)) | (1L << (LOGICAL - 75)) | (1L << (CODEGEN - 75)) | (1L << (COST - 75)) | (1L << (CAST - 75)) | (1L << (SHOW - 75)) | (1L << (TABLES - 75)) | (1L << (COLUMNS - 75)) | (1L << (COLUMN - 75)) | (1L << (USE - 75)) | (1L << (PARTITIONS - 75)) | (1L << (FUNCTIONS - 75)) | (1L << (DROP - 75)) | (1L << (UNION - 75)) | (1L << (EXCEPT - 75)) | (1L << (SETMINUS - 75)) | (1L << (INTERSECT - 75)) | (1L << (TO - 75)) | (1L << (TABLESAMPLE - 75)) | (1L << (STRATIFY - 75)) | (1L << (ALTER - 75)) | (1L << (RENAME - 75)) | (1L << (ARRAY - 75)) | (1L << (MAP - 75)) | (1L << (STRUCT - 75)) | (1L << (COMMENT - 75)) | (1L << (SET - 75)) | (1L << (RESET - 75)) | (1L << (DATA - 75)) | (1L << (START - 75)) | (1L << (TRANSACTION - 75)) | (1L << (COMMIT - 75)) | (1L << (ROLLBACK - 75)) | (1L << (MACRO - 75)) | (1L << (IGNORE - 75)) | (1L << (IF - 75)))) != 0) || ((((_la - 145)) & ~0x3f) == 0 && ((1L << (_la - 145)) & ((1L << (PLUS - 145)) | (1L << (MINUS - 145)) | (1L << (ASTERISK - 145)) | (1L << (DIV - 145)) | (1L << (TILDE - 145)) | (1L << (PERCENTLIT - 145)) | (1L << (BUCKET - 145)) | (1L << (OUT - 145)) | (1L << (OF - 145)) | (1L << (SORT - 145)) | (1L << (CLUSTER - 145)) | (1L << (DISTRIBUTE - 145)) | (1L << (OVERWRITE - 145)) | (1L << (TRANSFORM - 145)) | (1L << (REDUCE - 145)) | (1L << (USING - 145)) | (1L << (SERDE - 145)) | (1L << (SERDEPROPERTIES - 145)) | (1L << (RECORDREADER - 145)) | (1L << (RECORDWRITER - 145)) | (1L << (DELIMITED - 145)) | (1L << (FIELDS - 145)) | (1L << (TERMINATED - 145)) | (1L << (COLLECTION - 145)) | (1L << (ITEMS - 145)) | (1L << (KEYS - 145)) | (1L << (ESCAPED - 145)) | (1L << (LINES - 145)) | (1L << (SEPARATED - 145)) | (1L << (FUNCTION - 145)) | (1L << (EXTENDED - 145)) | (1L << (REFRESH - 145)) | (1L << (CLEAR - 145)) | (1L << (CACHE - 145)) | (1L << (UNCACHE - 145)) | (1L << (LAZY - 145)) | (1L << (FORMATTED - 145)) | (1L << (GLOBAL - 145)) | (1L << (TEMPORARY - 145)) | (1L << (OPTIONS - 145)) | (1L << (UNSET - 145)) | (1L << (TBLPROPERTIES - 145)) | (1L << (DBPROPERTIES - 145)) | (1L << (BUCKETS - 145)) | (1L << (SKEWED - 145)) | (1L << (STORED - 145)) | (1L << (DIRECTORIES - 145)) | (1L << (LOCATION - 145)) | (1L << (EXCHANGE - 145)) | (1L << (ARCHIVE - 145)) | (1L << (UNARCHIVE - 145)) | (1L << (FILEFORMAT - 145)) | (1L << (TOUCH - 145)) | (1L << (COMPACT - 145)) | (1L << (CONCATENATE - 145)) | (1L << (CHANGE - 145)) | (1L << (CASCADE - 145)) | (1L << (RESTRICT - 145)) | (1L << (CLUSTERED - 145)))) != 0) || ((((_la - 209)) & ~0x3f) == 0 && ((1L << (_la - 209)) & ((1L << (SORTED - 209)) | (1L << (PURGE - 209)) | (1L << (INPUTFORMAT - 209)) | (1L << (OUTPUTFORMAT - 209)) | (1L << (DATABASE - 209)) | (1L << (DATABASES - 209)) | (1L << (DFS - 209)) | (1L << (TRUNCATE - 209)) | (1L << (ANALYZE - 209)) | (1L << (COMPUTE - 209)) | (1L << (LIST - 209)) | (1L << (STATISTICS - 209)) | (1L << (PARTITIONED - 209)) | (1L << (EXTERNAL - 209)) | (1L << (DEFINED - 209)) | (1L << (REVOKE - 209)) | (1L << (GRANT - 209)) | (1L << (LOCK - 209)) | (1L << (UNLOCK - 209)) | (1L << (MSCK - 209)) | (1L << (REPAIR - 209)) | (1L << (RECOVER - 209)) | (1L << (EXPORT - 209)) | (1L << (IMPORT - 209)) | (1L << (LOAD - 209)) | (1L << (ROLE - 209)) | (1L << (ROLES - 209)) | (1L << (COMPACTIONS - 209)) | (1L << (PRINCIPALS - 209)) | (1L << (TRANSACTIONS - 209)) | (1L << (INDEX - 209)) | (1L << (INDEXES - 209)) | (1L << (LOCKS - 209)) | (1L << (OPTION - 209)) | (1L << (ANTI - 209)) | (1L << (LOCAL - 209)) | (1L << (INPATH - 209)) | (1L << (CURRENT_DATE - 209)) | (1L << (CURRENT_TIMESTAMP - 209)) | (1L << (STRING - 209)) | (1L << (BIGINT_LITERAL - 209)) | (1L << (SMALLINT_LITERAL - 209)) | (1L << (TINYINT_LITERAL - 209)) | (1L << (INTEGER_VALUE - 209)) | (1L << (DECIMAL_VALUE - 209)) | (1L << (DOUBLE_LITERAL - 209)) | (1L << (BIGDECIMAL_LITERAL - 209)) | (1L << (IDENTIFIER - 209)) | (1L << (BACKQUOTED_IDENTIFIER - 209)))) != 0)) {
					{
					setState(1363);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
					case 1:
						{
						setState(1362);
						setQuantifier();
						}
						break;
					}
					setState(1365);
					((FunctionCallContext)_localctx).expression = expression();
					((FunctionCallContext)_localctx).argument.add(((FunctionCallContext)_localctx).expression);
					setState(1370);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1366);
						match(COMMA);
						setState(1367);
						((FunctionCallContext)_localctx).expression = expression();
						((FunctionCallContext)_localctx).argument.add(((FunctionCallContext)_localctx).expression);
						}
						}
						setState(1372);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1375);
				match(RIGHTBRACKET);
				setState(1378);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
				case 1:
					{
					setState(1376);
					match(OVER);
					setState(1377);
					windowSpec();
					}
					break;
				}
				}
				break;
			case 14:
				{
				_localctx = new ColumnReferenceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1380);
				identifier();
				}
				break;
			case 15:
				{
				_localctx = new ParenthesizedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1381);
				match(LEFTBRACKET);
				setState(1382);
				expression();
				setState(1383);
				match(RIGHTBRACKET);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1397);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,177,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1395);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
					case 1:
						{
						_localctx = new SubscriptContext(new PrimaryExpressionContext(_parentctx, _parentState));
						((SubscriptContext)_localctx).value = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
						setState(1387);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1388);
						match(T__5);
						setState(1389);
						((SubscriptContext)_localctx).index = valueExpression(0);
						setState(1390);
						match(T__6);
						}
						break;
					case 2:
						{
						_localctx = new DereferenceContext(new PrimaryExpressionContext(_parentctx, _parentState));
						((DereferenceContext)_localctx).base = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
						setState(1392);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1393);
						match(T__2);
						setState(1394);
						((DereferenceContext)_localctx).fieldName = identifier();
						}
						break;
					}
					} 
				}
				setState(1399);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,177,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ConstantContext extends ParserRuleContext {
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
	 
		public ConstantContext() { }
		public void copyFrom(ConstantContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NullLiteralContext extends ConstantContext {
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public NullLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNullLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNullLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNullLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringLiteralContext extends ConstantContext {
		public List<TerminalNode> STRING() { return getTokens(SqlBaseParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(SqlBaseParser.STRING, i);
		}
		public StringLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeConstructorContext extends ConstantContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TypeConstructorContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTypeConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTypeConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTypeConstructor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntervalLiteralContext extends ConstantContext {
		public IntervalContext interval() {
			return getRuleContext(IntervalContext.class,0);
		}
		public IntervalLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIntervalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIntervalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitIntervalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumericLiteralContext extends ConstantContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public NumericLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNumericLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNumericLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNumericLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanLiteralContext extends ConstantContext {
		public BooleanValueContext booleanValue() {
			return getRuleContext(BooleanValueContext.class,0);
		}
		public BooleanLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitBooleanLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitBooleanLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_constant);
		try {
			int _alt;
			setState(1412);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,179,_ctx) ) {
			case 1:
				_localctx = new NullLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1400);
				match(NULL);
				}
				break;
			case 2:
				_localctx = new IntervalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1401);
				interval();
				}
				break;
			case 3:
				_localctx = new TypeConstructorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1402);
				identifier();
				setState(1403);
				match(STRING);
				}
				break;
			case 4:
				_localctx = new NumericLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1405);
				number();
				}
				break;
			case 5:
				_localctx = new BooleanLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1406);
				booleanValue();
				}
				break;
			case 6:
				_localctx = new StringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1408); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1407);
						match(STRING);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1410); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,178,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class ComparisonOperatorContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(SqlBaseParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(SqlBaseParser.NEQ, 0); }
		public TerminalNode NEQJ() { return getToken(SqlBaseParser.NEQJ, 0); }
		public TerminalNode LT() { return getToken(SqlBaseParser.LT, 0); }
		public TerminalNode LTE() { return getToken(SqlBaseParser.LTE, 0); }
		public TerminalNode GT() { return getToken(SqlBaseParser.GT, 0); }
		public TerminalNode GTE() { return getToken(SqlBaseParser.GTE, 0); }
		public TerminalNode NSEQ() { return getToken(SqlBaseParser.NSEQ, 0); }
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterComparisonOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitComparisonOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitComparisonOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1414);
			_la = _input.LA(1);
			if ( !(((((_la - 137)) & ~0x3f) == 0 && ((1L << (_la - 137)) & ((1L << (EQ - 137)) | (1L << (NSEQ - 137)) | (1L << (NEQ - 137)) | (1L << (NEQJ - 137)) | (1L << (LT - 137)) | (1L << (LTE - 137)) | (1L << (GT - 137)) | (1L << (GTE - 137)))) != 0)) ) {
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

	public static class ArithmeticOperatorContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(SqlBaseParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public TerminalNode ASTERISK() { return getToken(SqlBaseParser.ASTERISK, 0); }
		public TerminalNode SLASH() { return getToken(SqlBaseParser.SLASH, 0); }
		public TerminalNode PERCENT() { return getToken(SqlBaseParser.PERCENT, 0); }
		public TerminalNode DIV() { return getToken(SqlBaseParser.DIV, 0); }
		public TerminalNode TILDE() { return getToken(SqlBaseParser.TILDE, 0); }
		public TerminalNode AMPERSAND() { return getToken(SqlBaseParser.AMPERSAND, 0); }
		public TerminalNode PIPE() { return getToken(SqlBaseParser.PIPE, 0); }
		public TerminalNode HAT() { return getToken(SqlBaseParser.HAT, 0); }
		public ArithmeticOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmeticOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterArithmeticOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitArithmeticOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitArithmeticOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithmeticOperatorContext arithmeticOperator() throws RecognitionException {
		ArithmeticOperatorContext _localctx = new ArithmeticOperatorContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_arithmeticOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1416);
			_la = _input.LA(1);
			if ( !(((((_la - 145)) & ~0x3f) == 0 && ((1L << (_la - 145)) & ((1L << (PLUS - 145)) | (1L << (MINUS - 145)) | (1L << (ASTERISK - 145)) | (1L << (SLASH - 145)) | (1L << (PERCENT - 145)) | (1L << (DIV - 145)) | (1L << (TILDE - 145)) | (1L << (AMPERSAND - 145)) | (1L << (PIPE - 145)) | (1L << (HAT - 145)))) != 0)) ) {
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

	public static class PredicateOperatorContext extends ParserRuleContext {
		public TerminalNode OR() { return getToken(SqlBaseParser.OR, 0); }
		public TerminalNode AND() { return getToken(SqlBaseParser.AND, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public PredicateOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicateOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPredicateOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPredicateOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPredicateOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateOperatorContext predicateOperator() throws RecognitionException {
		PredicateOperatorContext _localctx = new PredicateOperatorContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_predicateOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1418);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT))) != 0)) ) {
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

	public static class BooleanValueContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(SqlBaseParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(SqlBaseParser.FALSE, 0); }
		public BooleanValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterBooleanValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitBooleanValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitBooleanValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanValueContext booleanValue() throws RecognitionException {
		BooleanValueContext _localctx = new BooleanValueContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_booleanValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1420);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
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

	public static class IntervalContext extends ParserRuleContext {
		public TerminalNode INTERVAL() { return getToken(SqlBaseParser.INTERVAL, 0); }
		public List<IntervalFieldContext> intervalField() {
			return getRuleContexts(IntervalFieldContext.class);
		}
		public IntervalFieldContext intervalField(int i) {
			return getRuleContext(IntervalFieldContext.class,i);
		}
		public IntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitInterval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitInterval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervalContext interval() throws RecognitionException {
		IntervalContext _localctx = new IntervalContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_interval);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1422);
			match(INTERVAL);
			setState(1426);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,180,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1423);
					intervalField();
					}
					} 
				}
				setState(1428);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,180,_ctx);
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

	public static class IntervalFieldContext extends ParserRuleContext {
		public IntervalValueContext value;
		public IdentifierContext unit;
		public IdentifierContext to;
		public IntervalValueContext intervalValue() {
			return getRuleContext(IntervalValueContext.class,0);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public IntervalFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervalField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIntervalField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIntervalField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitIntervalField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervalFieldContext intervalField() throws RecognitionException {
		IntervalFieldContext _localctx = new IntervalFieldContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_intervalField);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1429);
			((IntervalFieldContext)_localctx).value = intervalValue();
			setState(1430);
			((IntervalFieldContext)_localctx).unit = identifier();
			setState(1433);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
			case 1:
				{
				setState(1431);
				match(TO);
				setState(1432);
				((IntervalFieldContext)_localctx).to = identifier();
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

	public static class IntervalValueContext extends ParserRuleContext {
		public TerminalNode INTEGER_VALUE() { return getToken(SqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode DECIMAL_VALUE() { return getToken(SqlBaseParser.DECIMAL_VALUE, 0); }
		public TerminalNode PLUS() { return getToken(SqlBaseParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public IntervalValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervalValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIntervalValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIntervalValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitIntervalValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervalValueContext intervalValue() throws RecognitionException {
		IntervalValueContext _localctx = new IntervalValueContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_intervalValue);
		int _la;
		try {
			setState(1440);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
			case INTEGER_VALUE:
			case DECIMAL_VALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1436);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PLUS || _la==MINUS) {
					{
					setState(1435);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(1438);
				_la = _input.LA(1);
				if ( !(_la==INTEGER_VALUE || _la==DECIMAL_VALUE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(1439);
				match(STRING);
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

	public static class ColPositionContext extends ParserRuleContext {
		public TerminalNode FIRST() { return getToken(SqlBaseParser.FIRST, 0); }
		public TerminalNode AFTER() { return getToken(SqlBaseParser.AFTER, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ColPositionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colPosition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterColPosition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitColPosition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitColPosition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColPositionContext colPosition() throws RecognitionException {
		ColPositionContext _localctx = new ColPositionContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_colPosition);
		try {
			setState(1445);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FIRST:
				enterOuterAlt(_localctx, 1);
				{
				setState(1442);
				match(FIRST);
				}
				break;
			case AFTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(1443);
				match(AFTER);
				setState(1444);
				identifier();
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

	public static class DataTypeContext extends ParserRuleContext {
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
	 
		public DataTypeContext() { }
		public void copyFrom(DataTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ComplexDataTypeContext extends DataTypeContext {
		public Token complex;
		public List<DataTypeContext> dataType() {
			return getRuleContexts(DataTypeContext.class);
		}
		public DataTypeContext dataType(int i) {
			return getRuleContext(DataTypeContext.class,i);
		}
		public TerminalNode ARRAY() { return getToken(SqlBaseParser.ARRAY, 0); }
		public TerminalNode MAP() { return getToken(SqlBaseParser.MAP, 0); }
		public TerminalNode STRUCT() { return getToken(SqlBaseParser.STRUCT, 0); }
		public TerminalNode NEQ() { return getToken(SqlBaseParser.NEQ, 0); }
		public ComplexColTypeListContext complexColTypeList() {
			return getRuleContext(ComplexColTypeListContext.class,0);
		}
		public ComplexDataTypeContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterComplexDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitComplexDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitComplexDataType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrimitiveDataTypeContext extends DataTypeContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<TerminalNode> INTEGER_VALUE() { return getTokens(SqlBaseParser.INTEGER_VALUE); }
		public TerminalNode INTEGER_VALUE(int i) {
			return getToken(SqlBaseParser.INTEGER_VALUE, i);
		}
		public PrimitiveDataTypeContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPrimitiveDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPrimitiveDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPrimitiveDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_dataType);
		int _la;
		try {
			setState(1481);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,189,_ctx) ) {
			case 1:
				_localctx = new ComplexDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1447);
				((ComplexDataTypeContext)_localctx).complex = match(ARRAY);
				setState(1448);
				match(LT);
				setState(1449);
				dataType();
				setState(1450);
				match(GT);
				}
				break;
			case 2:
				_localctx = new ComplexDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1452);
				((ComplexDataTypeContext)_localctx).complex = match(MAP);
				setState(1453);
				match(LT);
				setState(1454);
				dataType();
				setState(1455);
				match(COMMA);
				setState(1456);
				dataType();
				setState(1457);
				match(GT);
				}
				break;
			case 3:
				_localctx = new ComplexDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1459);
				((ComplexDataTypeContext)_localctx).complex = match(STRUCT);
				setState(1466);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LT:
					{
					setState(1460);
					match(LT);
					setState(1462);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (((((_la - 11)) & ~0x3f) == 0 && ((1L << (_la - 11)) & ((1L << (SELECT - 11)) | (1L << (FROM - 11)) | (1L << (ADD - 11)) | (1L << (AS - 11)) | (1L << (ALL - 11)) | (1L << (DISTINCT - 11)) | (1L << (WHERE - 11)) | (1L << (GROUP - 11)) | (1L << (BY - 11)) | (1L << (GROUPING - 11)) | (1L << (SETS - 11)) | (1L << (CUBE - 11)) | (1L << (ROLLUP - 11)) | (1L << (ORDER - 11)) | (1L << (HAVING - 11)) | (1L << (LIMIT - 11)) | (1L << (AT - 11)) | (1L << (OR - 11)) | (1L << (AND - 11)) | (1L << (IN - 11)) | (1L << (NOT - 11)) | (1L << (NO - 11)) | (1L << (EXISTS - 11)) | (1L << (BETWEEN - 11)) | (1L << (LIKE - 11)) | (1L << (RLIKE - 11)) | (1L << (IS - 11)) | (1L << (NULL - 11)) | (1L << (TRUE - 11)) | (1L << (FALSE - 11)) | (1L << (NULLS - 11)) | (1L << (ASC - 11)) | (1L << (DESC - 11)) | (1L << (FOR - 11)) | (1L << (INTERVAL - 11)) | (1L << (CASE - 11)) | (1L << (WHEN - 11)) | (1L << (THEN - 11)) | (1L << (ELSE - 11)) | (1L << (END - 11)) | (1L << (JOIN - 11)) | (1L << (CROSS - 11)) | (1L << (OUTER - 11)) | (1L << (INNER - 11)) | (1L << (LEFT - 11)) | (1L << (SEMI - 11)) | (1L << (RIGHT - 11)) | (1L << (FULL - 11)) | (1L << (NATURAL - 11)) | (1L << (ON - 11)) | (1L << (LATERAL - 11)) | (1L << (WINDOW - 11)) | (1L << (OVER - 11)) | (1L << (PARTITION - 11)) | (1L << (RANGE - 11)) | (1L << (ROWS - 11)))) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (UNBOUNDED - 75)) | (1L << (PRECEDING - 75)) | (1L << (FOLLOWING - 75)) | (1L << (CURRENT - 75)) | (1L << (FIRST - 75)) | (1L << (AFTER - 75)) | (1L << (LAST - 75)) | (1L << (ROW - 75)) | (1L << (WITH - 75)) | (1L << (VALUES - 75)) | (1L << (CREATE - 75)) | (1L << (TABLE - 75)) | (1L << (VIEW - 75)) | (1L << (REPLACE - 75)) | (1L << (INSERT - 75)) | (1L << (DELETE - 75)) | (1L << (INTO - 75)) | (1L << (DESCRIBE - 75)) | (1L << (EXPLAIN - 75)) | (1L << (FORMAT - 75)) | (1L << (LOGICAL - 75)) | (1L << (CODEGEN - 75)) | (1L << (COST - 75)) | (1L << (CAST - 75)) | (1L << (SHOW - 75)) | (1L << (TABLES - 75)) | (1L << (COLUMNS - 75)) | (1L << (COLUMN - 75)) | (1L << (USE - 75)) | (1L << (PARTITIONS - 75)) | (1L << (FUNCTIONS - 75)) | (1L << (DROP - 75)) | (1L << (UNION - 75)) | (1L << (EXCEPT - 75)) | (1L << (SETMINUS - 75)) | (1L << (INTERSECT - 75)) | (1L << (TO - 75)) | (1L << (TABLESAMPLE - 75)) | (1L << (STRATIFY - 75)) | (1L << (ALTER - 75)) | (1L << (RENAME - 75)) | (1L << (ARRAY - 75)) | (1L << (MAP - 75)) | (1L << (STRUCT - 75)) | (1L << (COMMENT - 75)) | (1L << (SET - 75)) | (1L << (RESET - 75)) | (1L << (DATA - 75)) | (1L << (START - 75)) | (1L << (TRANSACTION - 75)) | (1L << (COMMIT - 75)) | (1L << (ROLLBACK - 75)) | (1L << (MACRO - 75)) | (1L << (IGNORE - 75)) | (1L << (IF - 75)))) != 0) || ((((_la - 150)) & ~0x3f) == 0 && ((1L << (_la - 150)) & ((1L << (DIV - 150)) | (1L << (PERCENTLIT - 150)) | (1L << (BUCKET - 150)) | (1L << (OUT - 150)) | (1L << (OF - 150)) | (1L << (SORT - 150)) | (1L << (CLUSTER - 150)) | (1L << (DISTRIBUTE - 150)) | (1L << (OVERWRITE - 150)) | (1L << (TRANSFORM - 150)) | (1L << (REDUCE - 150)) | (1L << (USING - 150)) | (1L << (SERDE - 150)) | (1L << (SERDEPROPERTIES - 150)) | (1L << (RECORDREADER - 150)) | (1L << (RECORDWRITER - 150)) | (1L << (DELIMITED - 150)) | (1L << (FIELDS - 150)) | (1L << (TERMINATED - 150)) | (1L << (COLLECTION - 150)) | (1L << (ITEMS - 150)) | (1L << (KEYS - 150)) | (1L << (ESCAPED - 150)) | (1L << (LINES - 150)) | (1L << (SEPARATED - 150)) | (1L << (FUNCTION - 150)) | (1L << (EXTENDED - 150)) | (1L << (REFRESH - 150)) | (1L << (CLEAR - 150)) | (1L << (CACHE - 150)) | (1L << (UNCACHE - 150)) | (1L << (LAZY - 150)) | (1L << (FORMATTED - 150)) | (1L << (GLOBAL - 150)) | (1L << (TEMPORARY - 150)) | (1L << (OPTIONS - 150)) | (1L << (UNSET - 150)) | (1L << (TBLPROPERTIES - 150)) | (1L << (DBPROPERTIES - 150)) | (1L << (BUCKETS - 150)) | (1L << (SKEWED - 150)) | (1L << (STORED - 150)) | (1L << (DIRECTORIES - 150)) | (1L << (LOCATION - 150)) | (1L << (EXCHANGE - 150)) | (1L << (ARCHIVE - 150)) | (1L << (UNARCHIVE - 150)) | (1L << (FILEFORMAT - 150)) | (1L << (TOUCH - 150)) | (1L << (COMPACT - 150)) | (1L << (CONCATENATE - 150)) | (1L << (CHANGE - 150)) | (1L << (CASCADE - 150)) | (1L << (RESTRICT - 150)) | (1L << (CLUSTERED - 150)) | (1L << (SORTED - 150)) | (1L << (PURGE - 150)) | (1L << (INPUTFORMAT - 150)) | (1L << (OUTPUTFORMAT - 150)) | (1L << (DATABASE - 150)))) != 0) || ((((_la - 214)) & ~0x3f) == 0 && ((1L << (_la - 214)) & ((1L << (DATABASES - 214)) | (1L << (DFS - 214)) | (1L << (TRUNCATE - 214)) | (1L << (ANALYZE - 214)) | (1L << (COMPUTE - 214)) | (1L << (LIST - 214)) | (1L << (STATISTICS - 214)) | (1L << (PARTITIONED - 214)) | (1L << (EXTERNAL - 214)) | (1L << (DEFINED - 214)) | (1L << (REVOKE - 214)) | (1L << (GRANT - 214)) | (1L << (LOCK - 214)) | (1L << (UNLOCK - 214)) | (1L << (MSCK - 214)) | (1L << (REPAIR - 214)) | (1L << (RECOVER - 214)) | (1L << (EXPORT - 214)) | (1L << (IMPORT - 214)) | (1L << (LOAD - 214)) | (1L << (ROLE - 214)) | (1L << (ROLES - 214)) | (1L << (COMPACTIONS - 214)) | (1L << (PRINCIPALS - 214)) | (1L << (TRANSACTIONS - 214)) | (1L << (INDEX - 214)) | (1L << (INDEXES - 214)) | (1L << (LOCKS - 214)) | (1L << (OPTION - 214)) | (1L << (ANTI - 214)) | (1L << (LOCAL - 214)) | (1L << (INPATH - 214)) | (1L << (CURRENT_DATE - 214)) | (1L << (CURRENT_TIMESTAMP - 214)) | (1L << (INTEGER_VALUE - 214)) | (1L << (IDENTIFIER - 214)) | (1L << (BACKQUOTED_IDENTIFIER - 214)))) != 0)) {
						{
						setState(1461);
						complexColTypeList();
						}
					}

					setState(1464);
					match(GT);
					}
					break;
				case NEQ:
					{
					setState(1465);
					match(NEQ);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 4:
				_localctx = new PrimitiveDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1468);
				identifier();
				setState(1479);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,188,_ctx) ) {
				case 1:
					{
					setState(1469);
					match(LEFTBRACKET);
					setState(1470);
					match(INTEGER_VALUE);
					setState(1475);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1471);
						match(COMMA);
						setState(1472);
						match(INTEGER_VALUE);
						}
						}
						setState(1477);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1478);
					match(RIGHTBRACKET);
					}
					break;
				}
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

	public static class ColTypeListContext extends ParserRuleContext {
		public List<ColTypeContext> colType() {
			return getRuleContexts(ColTypeContext.class);
		}
		public ColTypeContext colType(int i) {
			return getRuleContext(ColTypeContext.class,i);
		}
		public ColTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colTypeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterColTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitColTypeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitColTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColTypeListContext colTypeList() throws RecognitionException {
		ColTypeListContext _localctx = new ColTypeListContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_colTypeList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1483);
			colType();
			setState(1488);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,190,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1484);
					match(COMMA);
					setState(1485);
					colType();
					}
					} 
				}
				setState(1490);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,190,_ctx);
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

	public static class ColTypeContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public IdentifierPathContext identifierPath() {
			return getRuleContext(IdentifierPathContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(SqlBaseParser.COMMENT, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public ColTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterColType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitColType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitColType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColTypeContext colType() throws RecognitionException {
		ColTypeContext _localctx = new ColTypeContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_colType);
		int _la;
		try {
			setState(1506);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,193,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1491);
				identifier();
				setState(1493);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STRING) {
					{
					setState(1492);
					identifierPath();
					}
				}

				setState(1495);
				dataType();
				setState(1498);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,192,_ctx) ) {
				case 1:
					{
					setState(1496);
					match(COMMENT);
					setState(1497);
					match(STRING);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1500);
				identifier();
				setState(1501);
				match(T__7);
				setState(1502);
				match(LEFTBRACKET);
				setState(1503);
				columnName();
				setState(1504);
				match(RIGHTBRACKET);
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

	public static class IdentifierPathContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public IdentifierPathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierPath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIdentifierPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIdentifierPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitIdentifierPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierPathContext identifierPath() throws RecognitionException {
		IdentifierPathContext _localctx = new IdentifierPathContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_identifierPath);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1508);
			match(STRING);
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

	public static class OffsetContext extends ParserRuleContext {
		public TerminalNode INTEGER_VALUE() { return getToken(SqlBaseParser.INTEGER_VALUE, 0); }
		public OffsetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_offset; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterOffset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitOffset(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitOffset(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OffsetContext offset() throws RecognitionException {
		OffsetContext _localctx = new OffsetContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_offset);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1510);
			match(INTEGER_VALUE);
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

	public static class ProperiteyListContext extends ParserRuleContext {
		public List<ProperiteyContext> properitey() {
			return getRuleContexts(ProperiteyContext.class);
		}
		public ProperiteyContext properitey(int i) {
			return getRuleContext(ProperiteyContext.class,i);
		}
		public ProperiteyListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_properiteyList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterProperiteyList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitProperiteyList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitProperiteyList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProperiteyListContext properiteyList() throws RecognitionException {
		ProperiteyListContext _localctx = new ProperiteyListContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_properiteyList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1512);
			properitey();
			setState(1517);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1513);
				match(COMMA);
				setState(1514);
				properitey();
				}
				}
				setState(1519);
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

	public static class ProperiteyContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public IdentifierValueContext identifierValue() {
			return getRuleContext(IdentifierValueContext.class,0);
		}
		public ProperiteyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_properitey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterProperitey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitProperitey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitProperitey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProperiteyContext properitey() throws RecognitionException {
		ProperiteyContext _localctx = new ProperiteyContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_properitey);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1520);
			identifier();
			setState(1521);
			match(T__8);
			setState(1522);
			identifierValue();
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

	public static class IdentifierValueContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public IdentifierValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIdentifierValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIdentifierValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitIdentifierValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierValueContext identifierValue() throws RecognitionException {
		IdentifierValueContext _localctx = new IdentifierValueContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_identifierValue);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1524);
			identifier();
			setState(1529);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,195,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1525);
					match(COMMA);
					setState(1526);
					identifier();
					}
					} 
				}
				setState(1531);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,195,_ctx);
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

	public static class ComplexColTypeListContext extends ParserRuleContext {
		public List<ComplexColTypeContext> complexColType() {
			return getRuleContexts(ComplexColTypeContext.class);
		}
		public ComplexColTypeContext complexColType(int i) {
			return getRuleContext(ComplexColTypeContext.class,i);
		}
		public ComplexColTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complexColTypeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterComplexColTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitComplexColTypeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitComplexColTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComplexColTypeListContext complexColTypeList() throws RecognitionException {
		ComplexColTypeListContext _localctx = new ComplexColTypeListContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_complexColTypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1532);
			complexColType();
			setState(1537);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1533);
				match(COMMA);
				setState(1534);
				complexColType();
				}
				}
				setState(1539);
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

	public static class ComplexColTypeContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(SqlBaseParser.COMMENT, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public ComplexColTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complexColType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterComplexColType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitComplexColType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitComplexColType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComplexColTypeContext complexColType() throws RecognitionException {
		ComplexColTypeContext _localctx = new ComplexColTypeContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_complexColType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1540);
			identifier();
			setState(1541);
			match(T__9);
			setState(1542);
			dataType();
			setState(1545);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(1543);
				match(COMMENT);
				setState(1544);
				match(STRING);
				}
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

	public static class WhenClauseContext extends ParserRuleContext {
		public ExpressionContext condition;
		public ExpressionContext result;
		public TerminalNode WHEN() { return getToken(SqlBaseParser.WHEN, 0); }
		public TerminalNode THEN() { return getToken(SqlBaseParser.THEN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public WhenClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whenClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterWhenClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitWhenClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitWhenClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhenClauseContext whenClause() throws RecognitionException {
		WhenClauseContext _localctx = new WhenClauseContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_whenClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1547);
			match(WHEN);
			setState(1548);
			((WhenClauseContext)_localctx).condition = expression();
			setState(1549);
			match(THEN);
			setState(1550);
			((WhenClauseContext)_localctx).result = expression();
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

	public static class WindowsContext extends ParserRuleContext {
		public TerminalNode WINDOW() { return getToken(SqlBaseParser.WINDOW, 0); }
		public List<NamedWindowContext> namedWindow() {
			return getRuleContexts(NamedWindowContext.class);
		}
		public NamedWindowContext namedWindow(int i) {
			return getRuleContext(NamedWindowContext.class,i);
		}
		public WindowsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windows; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterWindows(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitWindows(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitWindows(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowsContext windows() throws RecognitionException {
		WindowsContext _localctx = new WindowsContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_windows);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1552);
			match(WINDOW);
			setState(1553);
			namedWindow();
			setState(1558);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,198,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1554);
					match(COMMA);
					setState(1555);
					namedWindow();
					}
					} 
				}
				setState(1560);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,198,_ctx);
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

	public static class NamedWindowContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public WindowSpecContext windowSpec() {
			return getRuleContext(WindowSpecContext.class,0);
		}
		public NamedWindowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedWindow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNamedWindow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNamedWindow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNamedWindow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedWindowContext namedWindow() throws RecognitionException {
		NamedWindowContext _localctx = new NamedWindowContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_namedWindow);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1561);
			identifier();
			setState(1562);
			match(AS);
			setState(1563);
			windowSpec();
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

	public static class WindowSpecContext extends ParserRuleContext {
		public WindowSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowSpec; }
	 
		public WindowSpecContext() { }
		public void copyFrom(WindowSpecContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WindowRefContext extends WindowSpecContext {
		public IdentifierContext name;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public WindowRefContext(WindowSpecContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterWindowRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitWindowRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitWindowRef(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WindowDefContext extends WindowSpecContext {
		public ExpressionContext expression;
		public List<ExpressionContext> partition = new ArrayList<ExpressionContext>();
		public TerminalNode CLUSTER() { return getToken(SqlBaseParser.CLUSTER, 0); }
		public List<TerminalNode> BY() { return getTokens(SqlBaseParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(SqlBaseParser.BY, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public WindowFrameContext windowFrame() {
			return getRuleContext(WindowFrameContext.class,0);
		}
		public List<SortItemContext> sortItem() {
			return getRuleContexts(SortItemContext.class);
		}
		public SortItemContext sortItem(int i) {
			return getRuleContext(SortItemContext.class,i);
		}
		public TerminalNode PARTITION() { return getToken(SqlBaseParser.PARTITION, 0); }
		public TerminalNode DISTRIBUTE() { return getToken(SqlBaseParser.DISTRIBUTE, 0); }
		public TerminalNode ORDER() { return getToken(SqlBaseParser.ORDER, 0); }
		public TerminalNode SORT() { return getToken(SqlBaseParser.SORT, 0); }
		public WindowDefContext(WindowSpecContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterWindowDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitWindowDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitWindowDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowSpecContext windowSpec() throws RecognitionException {
		WindowSpecContext _localctx = new WindowSpecContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_windowSpec);
		int _la;
		try {
			setState(1607);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
			case FROM:
			case ADD:
			case AS:
			case ALL:
			case DISTINCT:
			case WHERE:
			case GROUP:
			case BY:
			case GROUPING:
			case SETS:
			case CUBE:
			case ROLLUP:
			case ORDER:
			case HAVING:
			case LIMIT:
			case AT:
			case OR:
			case AND:
			case IN:
			case NOT:
			case NO:
			case EXISTS:
			case BETWEEN:
			case LIKE:
			case RLIKE:
			case IS:
			case NULL:
			case TRUE:
			case FALSE:
			case NULLS:
			case ASC:
			case DESC:
			case FOR:
			case INTERVAL:
			case CASE:
			case WHEN:
			case THEN:
			case ELSE:
			case END:
			case JOIN:
			case CROSS:
			case OUTER:
			case INNER:
			case LEFT:
			case SEMI:
			case RIGHT:
			case FULL:
			case NATURAL:
			case ON:
			case LATERAL:
			case WINDOW:
			case OVER:
			case PARTITION:
			case RANGE:
			case ROWS:
			case UNBOUNDED:
			case PRECEDING:
			case FOLLOWING:
			case CURRENT:
			case FIRST:
			case AFTER:
			case LAST:
			case ROW:
			case WITH:
			case VALUES:
			case CREATE:
			case TABLE:
			case VIEW:
			case REPLACE:
			case INSERT:
			case DELETE:
			case INTO:
			case DESCRIBE:
			case EXPLAIN:
			case FORMAT:
			case LOGICAL:
			case CODEGEN:
			case COST:
			case CAST:
			case SHOW:
			case TABLES:
			case COLUMNS:
			case COLUMN:
			case USE:
			case PARTITIONS:
			case FUNCTIONS:
			case DROP:
			case UNION:
			case EXCEPT:
			case SETMINUS:
			case INTERSECT:
			case TO:
			case TABLESAMPLE:
			case STRATIFY:
			case ALTER:
			case RENAME:
			case ARRAY:
			case MAP:
			case STRUCT:
			case COMMENT:
			case SET:
			case RESET:
			case DATA:
			case START:
			case TRANSACTION:
			case COMMIT:
			case ROLLBACK:
			case MACRO:
			case IGNORE:
			case IF:
			case DIV:
			case PERCENTLIT:
			case BUCKET:
			case OUT:
			case OF:
			case SORT:
			case CLUSTER:
			case DISTRIBUTE:
			case OVERWRITE:
			case TRANSFORM:
			case REDUCE:
			case USING:
			case SERDE:
			case SERDEPROPERTIES:
			case RECORDREADER:
			case RECORDWRITER:
			case DELIMITED:
			case FIELDS:
			case TERMINATED:
			case COLLECTION:
			case ITEMS:
			case KEYS:
			case ESCAPED:
			case LINES:
			case SEPARATED:
			case FUNCTION:
			case EXTENDED:
			case REFRESH:
			case CLEAR:
			case CACHE:
			case UNCACHE:
			case LAZY:
			case FORMATTED:
			case GLOBAL:
			case TEMPORARY:
			case OPTIONS:
			case UNSET:
			case TBLPROPERTIES:
			case DBPROPERTIES:
			case BUCKETS:
			case SKEWED:
			case STORED:
			case DIRECTORIES:
			case LOCATION:
			case EXCHANGE:
			case ARCHIVE:
			case UNARCHIVE:
			case FILEFORMAT:
			case TOUCH:
			case COMPACT:
			case CONCATENATE:
			case CHANGE:
			case CASCADE:
			case RESTRICT:
			case CLUSTERED:
			case SORTED:
			case PURGE:
			case INPUTFORMAT:
			case OUTPUTFORMAT:
			case DATABASE:
			case DATABASES:
			case DFS:
			case TRUNCATE:
			case ANALYZE:
			case COMPUTE:
			case LIST:
			case STATISTICS:
			case PARTITIONED:
			case EXTERNAL:
			case DEFINED:
			case REVOKE:
			case GRANT:
			case LOCK:
			case UNLOCK:
			case MSCK:
			case REPAIR:
			case RECOVER:
			case EXPORT:
			case IMPORT:
			case LOAD:
			case ROLE:
			case ROLES:
			case COMPACTIONS:
			case PRINCIPALS:
			case TRANSACTIONS:
			case INDEX:
			case INDEXES:
			case LOCKS:
			case OPTION:
			case ANTI:
			case LOCAL:
			case INPATH:
			case CURRENT_DATE:
			case CURRENT_TIMESTAMP:
			case INTEGER_VALUE:
			case IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
				_localctx = new WindowRefContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1565);
				((WindowRefContext)_localctx).name = identifier();
				}
				break;
			case LEFTBRACKET:
				_localctx = new WindowDefContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1566);
				match(LEFTBRACKET);
				setState(1601);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CLUSTER:
					{
					setState(1567);
					match(CLUSTER);
					setState(1568);
					match(BY);
					setState(1569);
					((WindowDefContext)_localctx).expression = expression();
					((WindowDefContext)_localctx).partition.add(((WindowDefContext)_localctx).expression);
					setState(1574);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1570);
						match(COMMA);
						setState(1571);
						((WindowDefContext)_localctx).expression = expression();
						((WindowDefContext)_localctx).partition.add(((WindowDefContext)_localctx).expression);
						}
						}
						setState(1576);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case RIGHTBRACKET:
				case ORDER:
				case PARTITION:
				case RANGE:
				case ROWS:
				case SORT:
				case DISTRIBUTE:
					{
					setState(1587);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==PARTITION || _la==DISTRIBUTE) {
						{
						setState(1577);
						_la = _input.LA(1);
						if ( !(_la==PARTITION || _la==DISTRIBUTE) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1578);
						match(BY);
						setState(1579);
						((WindowDefContext)_localctx).expression = expression();
						((WindowDefContext)_localctx).partition.add(((WindowDefContext)_localctx).expression);
						setState(1584);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(1580);
							match(COMMA);
							setState(1581);
							((WindowDefContext)_localctx).expression = expression();
							((WindowDefContext)_localctx).partition.add(((WindowDefContext)_localctx).expression);
							}
							}
							setState(1586);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					setState(1599);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ORDER || _la==SORT) {
						{
						setState(1589);
						_la = _input.LA(1);
						if ( !(_la==ORDER || _la==SORT) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1590);
						match(BY);
						setState(1591);
						sortItem();
						setState(1596);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(1592);
							match(COMMA);
							setState(1593);
							sortItem();
							}
							}
							setState(1598);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1604);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RANGE || _la==ROWS) {
					{
					setState(1603);
					windowFrame();
					}
				}

				setState(1606);
				match(RIGHTBRACKET);
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

	public static class WindowFrameContext extends ParserRuleContext {
		public Token frameType;
		public FrameBoundContext start;
		public FrameBoundContext end;
		public TerminalNode RANGE() { return getToken(SqlBaseParser.RANGE, 0); }
		public List<FrameBoundContext> frameBound() {
			return getRuleContexts(FrameBoundContext.class);
		}
		public FrameBoundContext frameBound(int i) {
			return getRuleContext(FrameBoundContext.class,i);
		}
		public TerminalNode ROWS() { return getToken(SqlBaseParser.ROWS, 0); }
		public TerminalNode BETWEEN() { return getToken(SqlBaseParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(SqlBaseParser.AND, 0); }
		public WindowFrameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowFrame; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterWindowFrame(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitWindowFrame(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitWindowFrame(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowFrameContext windowFrame() throws RecognitionException {
		WindowFrameContext _localctx = new WindowFrameContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_windowFrame);
		try {
			setState(1625);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,207,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1609);
				((WindowFrameContext)_localctx).frameType = match(RANGE);
				setState(1610);
				((WindowFrameContext)_localctx).start = frameBound();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1611);
				((WindowFrameContext)_localctx).frameType = match(ROWS);
				setState(1612);
				((WindowFrameContext)_localctx).start = frameBound();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1613);
				((WindowFrameContext)_localctx).frameType = match(RANGE);
				setState(1614);
				match(BETWEEN);
				setState(1615);
				((WindowFrameContext)_localctx).start = frameBound();
				setState(1616);
				match(AND);
				setState(1617);
				((WindowFrameContext)_localctx).end = frameBound();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1619);
				((WindowFrameContext)_localctx).frameType = match(ROWS);
				setState(1620);
				match(BETWEEN);
				setState(1621);
				((WindowFrameContext)_localctx).start = frameBound();
				setState(1622);
				match(AND);
				setState(1623);
				((WindowFrameContext)_localctx).end = frameBound();
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

	public static class FrameBoundContext extends ParserRuleContext {
		public Token boundType;
		public TerminalNode UNBOUNDED() { return getToken(SqlBaseParser.UNBOUNDED, 0); }
		public TerminalNode PRECEDING() { return getToken(SqlBaseParser.PRECEDING, 0); }
		public TerminalNode FOLLOWING() { return getToken(SqlBaseParser.FOLLOWING, 0); }
		public TerminalNode ROW() { return getToken(SqlBaseParser.ROW, 0); }
		public TerminalNode CURRENT() { return getToken(SqlBaseParser.CURRENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FrameBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frameBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterFrameBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitFrameBound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitFrameBound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FrameBoundContext frameBound() throws RecognitionException {
		FrameBoundContext _localctx = new FrameBoundContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_frameBound);
		int _la;
		try {
			setState(1634);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,208,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1627);
				match(UNBOUNDED);
				setState(1628);
				((FrameBoundContext)_localctx).boundType = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PRECEDING || _la==FOLLOWING) ) {
					((FrameBoundContext)_localctx).boundType = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1629);
				((FrameBoundContext)_localctx).boundType = match(CURRENT);
				setState(1630);
				match(ROW);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1631);
				expression();
				setState(1632);
				((FrameBoundContext)_localctx).boundType = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PRECEDING || _la==FOLLOWING) ) {
					((FrameBoundContext)_localctx).boundType = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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

	public static class QualifiedNameContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQualifiedName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQualifiedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1636);
			identifier();
			setState(1641);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,209,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1637);
					match(T__2);
					setState(1638);
					identifier();
					}
					} 
				}
				setState(1643);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,209,_ctx);
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

	public static class ColumnNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SqlBaseParser.IDENTIFIER, 0); }
		public ColumnNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterColumnName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitColumnName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitColumnName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnNameContext columnName() throws RecognitionException {
		ColumnNameContext _localctx = new ColumnNameContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_columnName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1644);
			match(IDENTIFIER);
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

	public static class IdentifierContext extends ParserRuleContext {
		public StrictIdentifierContext strictIdentifier() {
			return getRuleContext(StrictIdentifierContext.class,0);
		}
		public IntegerValueContext integerValue() {
			return getRuleContext(IntegerValueContext.class,0);
		}
		public TerminalNode ANTI() { return getToken(SqlBaseParser.ANTI, 0); }
		public TerminalNode FULL() { return getToken(SqlBaseParser.FULL, 0); }
		public TerminalNode INNER() { return getToken(SqlBaseParser.INNER, 0); }
		public TerminalNode LEFT() { return getToken(SqlBaseParser.LEFT, 0); }
		public TerminalNode SEMI() { return getToken(SqlBaseParser.SEMI, 0); }
		public TerminalNode RIGHT() { return getToken(SqlBaseParser.RIGHT, 0); }
		public TerminalNode NATURAL() { return getToken(SqlBaseParser.NATURAL, 0); }
		public TerminalNode JOIN() { return getToken(SqlBaseParser.JOIN, 0); }
		public TerminalNode CROSS() { return getToken(SqlBaseParser.CROSS, 0); }
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public TerminalNode UNION() { return getToken(SqlBaseParser.UNION, 0); }
		public TerminalNode INTERSECT() { return getToken(SqlBaseParser.INTERSECT, 0); }
		public TerminalNode EXCEPT() { return getToken(SqlBaseParser.EXCEPT, 0); }
		public TerminalNode SETMINUS() { return getToken(SqlBaseParser.SETMINUS, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_identifier);
		try {
			setState(1662);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
			case FROM:
			case ADD:
			case AS:
			case ALL:
			case DISTINCT:
			case WHERE:
			case GROUP:
			case BY:
			case GROUPING:
			case SETS:
			case CUBE:
			case ROLLUP:
			case ORDER:
			case HAVING:
			case LIMIT:
			case AT:
			case OR:
			case AND:
			case IN:
			case NOT:
			case NO:
			case EXISTS:
			case BETWEEN:
			case LIKE:
			case RLIKE:
			case IS:
			case NULL:
			case TRUE:
			case FALSE:
			case NULLS:
			case ASC:
			case DESC:
			case FOR:
			case INTERVAL:
			case CASE:
			case WHEN:
			case THEN:
			case ELSE:
			case END:
			case OUTER:
			case LATERAL:
			case WINDOW:
			case OVER:
			case PARTITION:
			case RANGE:
			case ROWS:
			case UNBOUNDED:
			case PRECEDING:
			case FOLLOWING:
			case CURRENT:
			case FIRST:
			case AFTER:
			case LAST:
			case ROW:
			case WITH:
			case VALUES:
			case CREATE:
			case TABLE:
			case VIEW:
			case REPLACE:
			case INSERT:
			case DELETE:
			case INTO:
			case DESCRIBE:
			case EXPLAIN:
			case FORMAT:
			case LOGICAL:
			case CODEGEN:
			case COST:
			case CAST:
			case SHOW:
			case TABLES:
			case COLUMNS:
			case COLUMN:
			case USE:
			case PARTITIONS:
			case FUNCTIONS:
			case DROP:
			case TO:
			case TABLESAMPLE:
			case STRATIFY:
			case ALTER:
			case RENAME:
			case ARRAY:
			case MAP:
			case STRUCT:
			case COMMENT:
			case SET:
			case RESET:
			case DATA:
			case START:
			case TRANSACTION:
			case COMMIT:
			case ROLLBACK:
			case MACRO:
			case IGNORE:
			case IF:
			case DIV:
			case PERCENTLIT:
			case BUCKET:
			case OUT:
			case OF:
			case SORT:
			case CLUSTER:
			case DISTRIBUTE:
			case OVERWRITE:
			case TRANSFORM:
			case REDUCE:
			case USING:
			case SERDE:
			case SERDEPROPERTIES:
			case RECORDREADER:
			case RECORDWRITER:
			case DELIMITED:
			case FIELDS:
			case TERMINATED:
			case COLLECTION:
			case ITEMS:
			case KEYS:
			case ESCAPED:
			case LINES:
			case SEPARATED:
			case FUNCTION:
			case EXTENDED:
			case REFRESH:
			case CLEAR:
			case CACHE:
			case UNCACHE:
			case LAZY:
			case FORMATTED:
			case GLOBAL:
			case TEMPORARY:
			case OPTIONS:
			case UNSET:
			case TBLPROPERTIES:
			case DBPROPERTIES:
			case BUCKETS:
			case SKEWED:
			case STORED:
			case DIRECTORIES:
			case LOCATION:
			case EXCHANGE:
			case ARCHIVE:
			case UNARCHIVE:
			case FILEFORMAT:
			case TOUCH:
			case COMPACT:
			case CONCATENATE:
			case CHANGE:
			case CASCADE:
			case RESTRICT:
			case CLUSTERED:
			case SORTED:
			case PURGE:
			case INPUTFORMAT:
			case OUTPUTFORMAT:
			case DATABASE:
			case DATABASES:
			case DFS:
			case TRUNCATE:
			case ANALYZE:
			case COMPUTE:
			case LIST:
			case STATISTICS:
			case PARTITIONED:
			case EXTERNAL:
			case DEFINED:
			case REVOKE:
			case GRANT:
			case LOCK:
			case UNLOCK:
			case MSCK:
			case REPAIR:
			case RECOVER:
			case EXPORT:
			case IMPORT:
			case LOAD:
			case ROLE:
			case ROLES:
			case COMPACTIONS:
			case PRINCIPALS:
			case TRANSACTIONS:
			case INDEX:
			case INDEXES:
			case LOCKS:
			case OPTION:
			case LOCAL:
			case INPATH:
			case CURRENT_DATE:
			case CURRENT_TIMESTAMP:
			case IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1646);
				strictIdentifier();
				}
				break;
			case INTEGER_VALUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1647);
				integerValue();
				}
				break;
			case ANTI:
				enterOuterAlt(_localctx, 3);
				{
				setState(1648);
				match(ANTI);
				}
				break;
			case FULL:
				enterOuterAlt(_localctx, 4);
				{
				setState(1649);
				match(FULL);
				}
				break;
			case INNER:
				enterOuterAlt(_localctx, 5);
				{
				setState(1650);
				match(INNER);
				}
				break;
			case LEFT:
				enterOuterAlt(_localctx, 6);
				{
				setState(1651);
				match(LEFT);
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 7);
				{
				setState(1652);
				match(SEMI);
				}
				break;
			case RIGHT:
				enterOuterAlt(_localctx, 8);
				{
				setState(1653);
				match(RIGHT);
				}
				break;
			case NATURAL:
				enterOuterAlt(_localctx, 9);
				{
				setState(1654);
				match(NATURAL);
				}
				break;
			case JOIN:
				enterOuterAlt(_localctx, 10);
				{
				setState(1655);
				match(JOIN);
				}
				break;
			case CROSS:
				enterOuterAlt(_localctx, 11);
				{
				setState(1656);
				match(CROSS);
				}
				break;
			case ON:
				enterOuterAlt(_localctx, 12);
				{
				setState(1657);
				match(ON);
				}
				break;
			case UNION:
				enterOuterAlt(_localctx, 13);
				{
				setState(1658);
				match(UNION);
				}
				break;
			case INTERSECT:
				enterOuterAlt(_localctx, 14);
				{
				setState(1659);
				match(INTERSECT);
				}
				break;
			case EXCEPT:
				enterOuterAlt(_localctx, 15);
				{
				setState(1660);
				match(EXCEPT);
				}
				break;
			case SETMINUS:
				enterOuterAlt(_localctx, 16);
				{
				setState(1661);
				match(SETMINUS);
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

	public static class StrictIdentifierContext extends ParserRuleContext {
		public StrictIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strictIdentifier; }
	 
		public StrictIdentifierContext() { }
		public void copyFrom(StrictIdentifierContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class QuotedIdentifierAlternativeContext extends StrictIdentifierContext {
		public QuotedIdentifierContext quotedIdentifier() {
			return getRuleContext(QuotedIdentifierContext.class,0);
		}
		public QuotedIdentifierAlternativeContext(StrictIdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQuotedIdentifierAlternative(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQuotedIdentifierAlternative(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQuotedIdentifierAlternative(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnquotedIdentifierContext extends StrictIdentifierContext {
		public TerminalNode IDENTIFIER() { return getToken(SqlBaseParser.IDENTIFIER, 0); }
		public NonReservedContext nonReserved() {
			return getRuleContext(NonReservedContext.class,0);
		}
		public UnquotedIdentifierContext(StrictIdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterUnquotedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitUnquotedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitUnquotedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StrictIdentifierContext strictIdentifier() throws RecognitionException {
		StrictIdentifierContext _localctx = new StrictIdentifierContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_strictIdentifier);
		try {
			setState(1667);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new UnquotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1664);
				match(IDENTIFIER);
				}
				break;
			case BACKQUOTED_IDENTIFIER:
				_localctx = new QuotedIdentifierAlternativeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1665);
				quotedIdentifier();
				}
				break;
			case SELECT:
			case FROM:
			case ADD:
			case AS:
			case ALL:
			case DISTINCT:
			case WHERE:
			case GROUP:
			case BY:
			case GROUPING:
			case SETS:
			case CUBE:
			case ROLLUP:
			case ORDER:
			case HAVING:
			case LIMIT:
			case AT:
			case OR:
			case AND:
			case IN:
			case NOT:
			case NO:
			case EXISTS:
			case BETWEEN:
			case LIKE:
			case RLIKE:
			case IS:
			case NULL:
			case TRUE:
			case FALSE:
			case NULLS:
			case ASC:
			case DESC:
			case FOR:
			case INTERVAL:
			case CASE:
			case WHEN:
			case THEN:
			case ELSE:
			case END:
			case OUTER:
			case LATERAL:
			case WINDOW:
			case OVER:
			case PARTITION:
			case RANGE:
			case ROWS:
			case UNBOUNDED:
			case PRECEDING:
			case FOLLOWING:
			case CURRENT:
			case FIRST:
			case AFTER:
			case LAST:
			case ROW:
			case WITH:
			case VALUES:
			case CREATE:
			case TABLE:
			case VIEW:
			case REPLACE:
			case INSERT:
			case DELETE:
			case INTO:
			case DESCRIBE:
			case EXPLAIN:
			case FORMAT:
			case LOGICAL:
			case CODEGEN:
			case COST:
			case CAST:
			case SHOW:
			case TABLES:
			case COLUMNS:
			case COLUMN:
			case USE:
			case PARTITIONS:
			case FUNCTIONS:
			case DROP:
			case TO:
			case TABLESAMPLE:
			case STRATIFY:
			case ALTER:
			case RENAME:
			case ARRAY:
			case MAP:
			case STRUCT:
			case COMMENT:
			case SET:
			case RESET:
			case DATA:
			case START:
			case TRANSACTION:
			case COMMIT:
			case ROLLBACK:
			case MACRO:
			case IGNORE:
			case IF:
			case DIV:
			case PERCENTLIT:
			case BUCKET:
			case OUT:
			case OF:
			case SORT:
			case CLUSTER:
			case DISTRIBUTE:
			case OVERWRITE:
			case TRANSFORM:
			case REDUCE:
			case USING:
			case SERDE:
			case SERDEPROPERTIES:
			case RECORDREADER:
			case RECORDWRITER:
			case DELIMITED:
			case FIELDS:
			case TERMINATED:
			case COLLECTION:
			case ITEMS:
			case KEYS:
			case ESCAPED:
			case LINES:
			case SEPARATED:
			case FUNCTION:
			case EXTENDED:
			case REFRESH:
			case CLEAR:
			case CACHE:
			case UNCACHE:
			case LAZY:
			case FORMATTED:
			case GLOBAL:
			case TEMPORARY:
			case OPTIONS:
			case UNSET:
			case TBLPROPERTIES:
			case DBPROPERTIES:
			case BUCKETS:
			case SKEWED:
			case STORED:
			case DIRECTORIES:
			case LOCATION:
			case EXCHANGE:
			case ARCHIVE:
			case UNARCHIVE:
			case FILEFORMAT:
			case TOUCH:
			case COMPACT:
			case CONCATENATE:
			case CHANGE:
			case CASCADE:
			case RESTRICT:
			case CLUSTERED:
			case SORTED:
			case PURGE:
			case INPUTFORMAT:
			case OUTPUTFORMAT:
			case DATABASE:
			case DATABASES:
			case DFS:
			case TRUNCATE:
			case ANALYZE:
			case COMPUTE:
			case LIST:
			case STATISTICS:
			case PARTITIONED:
			case EXTERNAL:
			case DEFINED:
			case REVOKE:
			case GRANT:
			case LOCK:
			case UNLOCK:
			case MSCK:
			case REPAIR:
			case RECOVER:
			case EXPORT:
			case IMPORT:
			case LOAD:
			case ROLE:
			case ROLES:
			case COMPACTIONS:
			case PRINCIPALS:
			case TRANSACTIONS:
			case INDEX:
			case INDEXES:
			case LOCKS:
			case OPTION:
			case LOCAL:
			case INPATH:
			case CURRENT_DATE:
			case CURRENT_TIMESTAMP:
				_localctx = new UnquotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1666);
				nonReserved();
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

	public static class QuotedIdentifierContext extends ParserRuleContext {
		public TerminalNode BACKQUOTED_IDENTIFIER() { return getToken(SqlBaseParser.BACKQUOTED_IDENTIFIER, 0); }
		public QuotedIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quotedIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQuotedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQuotedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQuotedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuotedIdentifierContext quotedIdentifier() throws RecognitionException {
		QuotedIdentifierContext _localctx = new QuotedIdentifierContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_quotedIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1669);
			match(BACKQUOTED_IDENTIFIER);
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

	public static class NumberContext extends ParserRuleContext {
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
	 
		public NumberContext() { }
		public void copyFrom(NumberContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DecimalLiteralContext extends NumberContext {
		public TerminalNode DECIMAL_VALUE() { return getToken(SqlBaseParser.DECIMAL_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public DecimalLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDecimalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDecimalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BigIntLiteralContext extends NumberContext {
		public TerminalNode BIGINT_LITERAL() { return getToken(SqlBaseParser.BIGINT_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public BigIntLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterBigIntLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitBigIntLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitBigIntLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TinyIntLiteralContext extends NumberContext {
		public TerminalNode TINYINT_LITERAL() { return getToken(SqlBaseParser.TINYINT_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public TinyIntLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTinyIntLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTinyIntLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTinyIntLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BigDecimalLiteralContext extends NumberContext {
		public TerminalNode BIGDECIMAL_LITERAL() { return getToken(SqlBaseParser.BIGDECIMAL_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public BigDecimalLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterBigDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitBigDecimalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitBigDecimalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DoubleLiteralContext extends NumberContext {
		public TerminalNode DOUBLE_LITERAL() { return getToken(SqlBaseParser.DOUBLE_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public DoubleLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDoubleLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDoubleLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDoubleLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntegerLiteralContext extends NumberContext {
		public TerminalNode INTEGER_VALUE() { return getToken(SqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public IntegerLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIntegerLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitIntegerLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SmallIntLiteralContext extends NumberContext {
		public TerminalNode SMALLINT_LITERAL() { return getToken(SqlBaseParser.SMALLINT_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public SmallIntLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSmallIntLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSmallIntLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSmallIntLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_number);
		int _la;
		try {
			setState(1699);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,219,_ctx) ) {
			case 1:
				_localctx = new DecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1672);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(1671);
					match(MINUS);
					}
				}

				setState(1674);
				match(DECIMAL_VALUE);
				}
				break;
			case 2:
				_localctx = new IntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1676);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(1675);
					match(MINUS);
					}
				}

				setState(1678);
				match(INTEGER_VALUE);
				}
				break;
			case 3:
				_localctx = new BigIntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1680);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(1679);
					match(MINUS);
					}
				}

				setState(1682);
				match(BIGINT_LITERAL);
				}
				break;
			case 4:
				_localctx = new SmallIntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1684);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(1683);
					match(MINUS);
					}
				}

				setState(1686);
				match(SMALLINT_LITERAL);
				}
				break;
			case 5:
				_localctx = new TinyIntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1688);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(1687);
					match(MINUS);
					}
				}

				setState(1690);
				match(TINYINT_LITERAL);
				}
				break;
			case 6:
				_localctx = new DoubleLiteralContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1692);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(1691);
					match(MINUS);
					}
				}

				setState(1694);
				match(DOUBLE_LITERAL);
				}
				break;
			case 7:
				_localctx = new BigDecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(1696);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(1695);
					match(MINUS);
					}
				}

				setState(1698);
				match(BIGDECIMAL_LITERAL);
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

	public static class NonReservedContext extends ParserRuleContext {
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode TABLES() { return getToken(SqlBaseParser.TABLES, 0); }
		public TerminalNode COLUMNS() { return getToken(SqlBaseParser.COLUMNS, 0); }
		public TerminalNode COLUMN() { return getToken(SqlBaseParser.COLUMN, 0); }
		public TerminalNode PARTITIONS() { return getToken(SqlBaseParser.PARTITIONS, 0); }
		public TerminalNode FUNCTIONS() { return getToken(SqlBaseParser.FUNCTIONS, 0); }
		public TerminalNode DATABASES() { return getToken(SqlBaseParser.DATABASES, 0); }
		public TerminalNode ADD() { return getToken(SqlBaseParser.ADD, 0); }
		public TerminalNode OVER() { return getToken(SqlBaseParser.OVER, 0); }
		public TerminalNode PARTITION() { return getToken(SqlBaseParser.PARTITION, 0); }
		public TerminalNode RANGE() { return getToken(SqlBaseParser.RANGE, 0); }
		public TerminalNode ROWS() { return getToken(SqlBaseParser.ROWS, 0); }
		public TerminalNode PRECEDING() { return getToken(SqlBaseParser.PRECEDING, 0); }
		public TerminalNode FOLLOWING() { return getToken(SqlBaseParser.FOLLOWING, 0); }
		public TerminalNode CURRENT() { return getToken(SqlBaseParser.CURRENT, 0); }
		public TerminalNode ROW() { return getToken(SqlBaseParser.ROW, 0); }
		public TerminalNode LAST() { return getToken(SqlBaseParser.LAST, 0); }
		public TerminalNode FIRST() { return getToken(SqlBaseParser.FIRST, 0); }
		public TerminalNode AFTER() { return getToken(SqlBaseParser.AFTER, 0); }
		public TerminalNode MAP() { return getToken(SqlBaseParser.MAP, 0); }
		public TerminalNode ARRAY() { return getToken(SqlBaseParser.ARRAY, 0); }
		public TerminalNode STRUCT() { return getToken(SqlBaseParser.STRUCT, 0); }
		public TerminalNode LATERAL() { return getToken(SqlBaseParser.LATERAL, 0); }
		public TerminalNode WINDOW() { return getToken(SqlBaseParser.WINDOW, 0); }
		public TerminalNode REDUCE() { return getToken(SqlBaseParser.REDUCE, 0); }
		public TerminalNode TRANSFORM() { return getToken(SqlBaseParser.TRANSFORM, 0); }
		public TerminalNode USING() { return getToken(SqlBaseParser.USING, 0); }
		public TerminalNode SERDE() { return getToken(SqlBaseParser.SERDE, 0); }
		public TerminalNode SERDEPROPERTIES() { return getToken(SqlBaseParser.SERDEPROPERTIES, 0); }
		public TerminalNode RECORDREADER() { return getToken(SqlBaseParser.RECORDREADER, 0); }
		public TerminalNode DELIMITED() { return getToken(SqlBaseParser.DELIMITED, 0); }
		public TerminalNode FIELDS() { return getToken(SqlBaseParser.FIELDS, 0); }
		public TerminalNode TERMINATED() { return getToken(SqlBaseParser.TERMINATED, 0); }
		public TerminalNode COLLECTION() { return getToken(SqlBaseParser.COLLECTION, 0); }
		public TerminalNode ITEMS() { return getToken(SqlBaseParser.ITEMS, 0); }
		public TerminalNode KEYS() { return getToken(SqlBaseParser.KEYS, 0); }
		public TerminalNode ESCAPED() { return getToken(SqlBaseParser.ESCAPED, 0); }
		public TerminalNode LINES() { return getToken(SqlBaseParser.LINES, 0); }
		public TerminalNode SEPARATED() { return getToken(SqlBaseParser.SEPARATED, 0); }
		public TerminalNode EXTENDED() { return getToken(SqlBaseParser.EXTENDED, 0); }
		public TerminalNode REFRESH() { return getToken(SqlBaseParser.REFRESH, 0); }
		public TerminalNode CLEAR() { return getToken(SqlBaseParser.CLEAR, 0); }
		public TerminalNode CACHE() { return getToken(SqlBaseParser.CACHE, 0); }
		public TerminalNode UNCACHE() { return getToken(SqlBaseParser.UNCACHE, 0); }
		public TerminalNode LAZY() { return getToken(SqlBaseParser.LAZY, 0); }
		public TerminalNode GLOBAL() { return getToken(SqlBaseParser.GLOBAL, 0); }
		public TerminalNode TEMPORARY() { return getToken(SqlBaseParser.TEMPORARY, 0); }
		public TerminalNode OPTIONS() { return getToken(SqlBaseParser.OPTIONS, 0); }
		public TerminalNode GROUPING() { return getToken(SqlBaseParser.GROUPING, 0); }
		public TerminalNode CUBE() { return getToken(SqlBaseParser.CUBE, 0); }
		public TerminalNode ROLLUP() { return getToken(SqlBaseParser.ROLLUP, 0); }
		public TerminalNode EXPLAIN() { return getToken(SqlBaseParser.EXPLAIN, 0); }
		public TerminalNode FORMAT() { return getToken(SqlBaseParser.FORMAT, 0); }
		public TerminalNode LOGICAL() { return getToken(SqlBaseParser.LOGICAL, 0); }
		public TerminalNode FORMATTED() { return getToken(SqlBaseParser.FORMATTED, 0); }
		public TerminalNode CODEGEN() { return getToken(SqlBaseParser.CODEGEN, 0); }
		public TerminalNode COST() { return getToken(SqlBaseParser.COST, 0); }
		public TerminalNode TABLESAMPLE() { return getToken(SqlBaseParser.TABLESAMPLE, 0); }
		public TerminalNode USE() { return getToken(SqlBaseParser.USE, 0); }
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public TerminalNode BUCKET() { return getToken(SqlBaseParser.BUCKET, 0); }
		public TerminalNode PERCENTLIT() { return getToken(SqlBaseParser.PERCENTLIT, 0); }
		public TerminalNode OUT() { return getToken(SqlBaseParser.OUT, 0); }
		public TerminalNode OF() { return getToken(SqlBaseParser.OF, 0); }
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode RESET() { return getToken(SqlBaseParser.RESET, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public TerminalNode REPLACE() { return getToken(SqlBaseParser.REPLACE, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NO() { return getToken(SqlBaseParser.NO, 0); }
		public TerminalNode DATA() { return getToken(SqlBaseParser.DATA, 0); }
		public TerminalNode START() { return getToken(SqlBaseParser.START, 0); }
		public TerminalNode TRANSACTION() { return getToken(SqlBaseParser.TRANSACTION, 0); }
		public TerminalNode COMMIT() { return getToken(SqlBaseParser.COMMIT, 0); }
		public TerminalNode ROLLBACK() { return getToken(SqlBaseParser.ROLLBACK, 0); }
		public TerminalNode IGNORE() { return getToken(SqlBaseParser.IGNORE, 0); }
		public TerminalNode SORT() { return getToken(SqlBaseParser.SORT, 0); }
		public TerminalNode CLUSTER() { return getToken(SqlBaseParser.CLUSTER, 0); }
		public TerminalNode DISTRIBUTE() { return getToken(SqlBaseParser.DISTRIBUTE, 0); }
		public TerminalNode UNSET() { return getToken(SqlBaseParser.UNSET, 0); }
		public TerminalNode TBLPROPERTIES() { return getToken(SqlBaseParser.TBLPROPERTIES, 0); }
		public TerminalNode SKEWED() { return getToken(SqlBaseParser.SKEWED, 0); }
		public TerminalNode STORED() { return getToken(SqlBaseParser.STORED, 0); }
		public TerminalNode DIRECTORIES() { return getToken(SqlBaseParser.DIRECTORIES, 0); }
		public TerminalNode LOCATION() { return getToken(SqlBaseParser.LOCATION, 0); }
		public TerminalNode EXCHANGE() { return getToken(SqlBaseParser.EXCHANGE, 0); }
		public TerminalNode ARCHIVE() { return getToken(SqlBaseParser.ARCHIVE, 0); }
		public TerminalNode UNARCHIVE() { return getToken(SqlBaseParser.UNARCHIVE, 0); }
		public TerminalNode FILEFORMAT() { return getToken(SqlBaseParser.FILEFORMAT, 0); }
		public TerminalNode TOUCH() { return getToken(SqlBaseParser.TOUCH, 0); }
		public TerminalNode COMPACT() { return getToken(SqlBaseParser.COMPACT, 0); }
		public TerminalNode CONCATENATE() { return getToken(SqlBaseParser.CONCATENATE, 0); }
		public TerminalNode CHANGE() { return getToken(SqlBaseParser.CHANGE, 0); }
		public TerminalNode CASCADE() { return getToken(SqlBaseParser.CASCADE, 0); }
		public TerminalNode RESTRICT() { return getToken(SqlBaseParser.RESTRICT, 0); }
		public TerminalNode BUCKETS() { return getToken(SqlBaseParser.BUCKETS, 0); }
		public TerminalNode CLUSTERED() { return getToken(SqlBaseParser.CLUSTERED, 0); }
		public TerminalNode SORTED() { return getToken(SqlBaseParser.SORTED, 0); }
		public TerminalNode PURGE() { return getToken(SqlBaseParser.PURGE, 0); }
		public TerminalNode INPUTFORMAT() { return getToken(SqlBaseParser.INPUTFORMAT, 0); }
		public TerminalNode OUTPUTFORMAT() { return getToken(SqlBaseParser.OUTPUTFORMAT, 0); }
		public TerminalNode DBPROPERTIES() { return getToken(SqlBaseParser.DBPROPERTIES, 0); }
		public TerminalNode DFS() { return getToken(SqlBaseParser.DFS, 0); }
		public TerminalNode TRUNCATE() { return getToken(SqlBaseParser.TRUNCATE, 0); }
		public TerminalNode COMPUTE() { return getToken(SqlBaseParser.COMPUTE, 0); }
		public TerminalNode LIST() { return getToken(SqlBaseParser.LIST, 0); }
		public TerminalNode STATISTICS() { return getToken(SqlBaseParser.STATISTICS, 0); }
		public TerminalNode ANALYZE() { return getToken(SqlBaseParser.ANALYZE, 0); }
		public TerminalNode PARTITIONED() { return getToken(SqlBaseParser.PARTITIONED, 0); }
		public TerminalNode EXTERNAL() { return getToken(SqlBaseParser.EXTERNAL, 0); }
		public TerminalNode DEFINED() { return getToken(SqlBaseParser.DEFINED, 0); }
		public TerminalNode RECORDWRITER() { return getToken(SqlBaseParser.RECORDWRITER, 0); }
		public TerminalNode REVOKE() { return getToken(SqlBaseParser.REVOKE, 0); }
		public TerminalNode GRANT() { return getToken(SqlBaseParser.GRANT, 0); }
		public TerminalNode LOCK() { return getToken(SqlBaseParser.LOCK, 0); }
		public TerminalNode UNLOCK() { return getToken(SqlBaseParser.UNLOCK, 0); }
		public TerminalNode MSCK() { return getToken(SqlBaseParser.MSCK, 0); }
		public TerminalNode REPAIR() { return getToken(SqlBaseParser.REPAIR, 0); }
		public TerminalNode RECOVER() { return getToken(SqlBaseParser.RECOVER, 0); }
		public TerminalNode EXPORT() { return getToken(SqlBaseParser.EXPORT, 0); }
		public TerminalNode IMPORT() { return getToken(SqlBaseParser.IMPORT, 0); }
		public TerminalNode LOAD() { return getToken(SqlBaseParser.LOAD, 0); }
		public TerminalNode VALUES() { return getToken(SqlBaseParser.VALUES, 0); }
		public TerminalNode COMMENT() { return getToken(SqlBaseParser.COMMENT, 0); }
		public TerminalNode ROLE() { return getToken(SqlBaseParser.ROLE, 0); }
		public TerminalNode ROLES() { return getToken(SqlBaseParser.ROLES, 0); }
		public TerminalNode COMPACTIONS() { return getToken(SqlBaseParser.COMPACTIONS, 0); }
		public TerminalNode PRINCIPALS() { return getToken(SqlBaseParser.PRINCIPALS, 0); }
		public TerminalNode TRANSACTIONS() { return getToken(SqlBaseParser.TRANSACTIONS, 0); }
		public TerminalNode INDEX() { return getToken(SqlBaseParser.INDEX, 0); }
		public TerminalNode INDEXES() { return getToken(SqlBaseParser.INDEXES, 0); }
		public TerminalNode LOCKS() { return getToken(SqlBaseParser.LOCKS, 0); }
		public TerminalNode OPTION() { return getToken(SqlBaseParser.OPTION, 0); }
		public TerminalNode LOCAL() { return getToken(SqlBaseParser.LOCAL, 0); }
		public TerminalNode INPATH() { return getToken(SqlBaseParser.INPATH, 0); }
		public TerminalNode ASC() { return getToken(SqlBaseParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public TerminalNode LIMIT() { return getToken(SqlBaseParser.LIMIT, 0); }
		public TerminalNode RENAME() { return getToken(SqlBaseParser.RENAME, 0); }
		public TerminalNode SETS() { return getToken(SqlBaseParser.SETS, 0); }
		public TerminalNode AT() { return getToken(SqlBaseParser.AT, 0); }
		public TerminalNode NULLS() { return getToken(SqlBaseParser.NULLS, 0); }
		public TerminalNode OVERWRITE() { return getToken(SqlBaseParser.OVERWRITE, 0); }
		public TerminalNode ALL() { return getToken(SqlBaseParser.ALL, 0); }
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public TerminalNode BETWEEN() { return getToken(SqlBaseParser.BETWEEN, 0); }
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode DELETE() { return getToken(SqlBaseParser.DELETE, 0); }
		public TerminalNode DESCRIBE() { return getToken(SqlBaseParser.DESCRIBE, 0); }
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TerminalNode FALSE() { return getToken(SqlBaseParser.FALSE, 0); }
		public TerminalNode FOR() { return getToken(SqlBaseParser.FOR, 0); }
		public TerminalNode GROUP() { return getToken(SqlBaseParser.GROUP, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public TerminalNode INSERT() { return getToken(SqlBaseParser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(SqlBaseParser.INTO, 0); }
		public TerminalNode IS() { return getToken(SqlBaseParser.IS, 0); }
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public TerminalNode ORDER() { return getToken(SqlBaseParser.ORDER, 0); }
		public TerminalNode OUTER() { return getToken(SqlBaseParser.OUTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode TRUE() { return getToken(SqlBaseParser.TRUE, 0); }
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public TerminalNode RLIKE() { return getToken(SqlBaseParser.RLIKE, 0); }
		public TerminalNode AND() { return getToken(SqlBaseParser.AND, 0); }
		public TerminalNode CASE() { return getToken(SqlBaseParser.CASE, 0); }
		public TerminalNode CAST() { return getToken(SqlBaseParser.CAST, 0); }
		public TerminalNode DISTINCT() { return getToken(SqlBaseParser.DISTINCT, 0); }
		public TerminalNode DIV() { return getToken(SqlBaseParser.DIV, 0); }
		public TerminalNode ELSE() { return getToken(SqlBaseParser.ELSE, 0); }
		public TerminalNode END() { return getToken(SqlBaseParser.END, 0); }
		public TerminalNode FUNCTION() { return getToken(SqlBaseParser.FUNCTION, 0); }
		public TerminalNode INTERVAL() { return getToken(SqlBaseParser.INTERVAL, 0); }
		public TerminalNode MACRO() { return getToken(SqlBaseParser.MACRO, 0); }
		public TerminalNode OR() { return getToken(SqlBaseParser.OR, 0); }
		public TerminalNode STRATIFY() { return getToken(SqlBaseParser.STRATIFY, 0); }
		public TerminalNode THEN() { return getToken(SqlBaseParser.THEN, 0); }
		public TerminalNode UNBOUNDED() { return getToken(SqlBaseParser.UNBOUNDED, 0); }
		public TerminalNode WHEN() { return getToken(SqlBaseParser.WHEN, 0); }
		public TerminalNode DATABASE() { return getToken(SqlBaseParser.DATABASE, 0); }
		public TerminalNode SELECT() { return getToken(SqlBaseParser.SELECT, 0); }
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode WHERE() { return getToken(SqlBaseParser.WHERE, 0); }
		public TerminalNode HAVING() { return getToken(SqlBaseParser.HAVING, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode CURRENT_DATE() { return getToken(SqlBaseParser.CURRENT_DATE, 0); }
		public TerminalNode CURRENT_TIMESTAMP() { return getToken(SqlBaseParser.CURRENT_TIMESTAMP, 0); }
		public NonReservedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonReserved; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNonReserved(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNonReserved(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNonReserved(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonReservedContext nonReserved() throws RecognitionException {
		NonReservedContext _localctx = new NonReservedContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_nonReserved);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1701);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << OUTER))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (LATERAL - 69)) | (1L << (WINDOW - 69)) | (1L << (OVER - 69)) | (1L << (PARTITION - 69)) | (1L << (RANGE - 69)) | (1L << (ROWS - 69)) | (1L << (UNBOUNDED - 69)) | (1L << (PRECEDING - 69)) | (1L << (FOLLOWING - 69)) | (1L << (CURRENT - 69)) | (1L << (FIRST - 69)) | (1L << (AFTER - 69)) | (1L << (LAST - 69)) | (1L << (ROW - 69)) | (1L << (WITH - 69)) | (1L << (VALUES - 69)) | (1L << (CREATE - 69)) | (1L << (TABLE - 69)) | (1L << (VIEW - 69)) | (1L << (REPLACE - 69)) | (1L << (INSERT - 69)) | (1L << (DELETE - 69)) | (1L << (INTO - 69)) | (1L << (DESCRIBE - 69)) | (1L << (EXPLAIN - 69)) | (1L << (FORMAT - 69)) | (1L << (LOGICAL - 69)) | (1L << (CODEGEN - 69)) | (1L << (COST - 69)) | (1L << (CAST - 69)) | (1L << (SHOW - 69)) | (1L << (TABLES - 69)) | (1L << (COLUMNS - 69)) | (1L << (COLUMN - 69)) | (1L << (USE - 69)) | (1L << (PARTITIONS - 69)) | (1L << (FUNCTIONS - 69)) | (1L << (DROP - 69)) | (1L << (TO - 69)) | (1L << (TABLESAMPLE - 69)) | (1L << (STRATIFY - 69)) | (1L << (ALTER - 69)) | (1L << (RENAME - 69)) | (1L << (ARRAY - 69)) | (1L << (MAP - 69)) | (1L << (STRUCT - 69)) | (1L << (COMMENT - 69)) | (1L << (SET - 69)) | (1L << (RESET - 69)) | (1L << (DATA - 69)) | (1L << (START - 69)) | (1L << (TRANSACTION - 69)) | (1L << (COMMIT - 69)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (ROLLBACK - 133)) | (1L << (MACRO - 133)) | (1L << (IGNORE - 133)) | (1L << (IF - 133)) | (1L << (DIV - 133)) | (1L << (PERCENTLIT - 133)) | (1L << (BUCKET - 133)) | (1L << (OUT - 133)) | (1L << (OF - 133)) | (1L << (SORT - 133)) | (1L << (CLUSTER - 133)) | (1L << (DISTRIBUTE - 133)) | (1L << (OVERWRITE - 133)) | (1L << (TRANSFORM - 133)) | (1L << (REDUCE - 133)) | (1L << (USING - 133)) | (1L << (SERDE - 133)) | (1L << (SERDEPROPERTIES - 133)) | (1L << (RECORDREADER - 133)) | (1L << (RECORDWRITER - 133)) | (1L << (DELIMITED - 133)) | (1L << (FIELDS - 133)) | (1L << (TERMINATED - 133)) | (1L << (COLLECTION - 133)) | (1L << (ITEMS - 133)) | (1L << (KEYS - 133)) | (1L << (ESCAPED - 133)) | (1L << (LINES - 133)) | (1L << (SEPARATED - 133)) | (1L << (FUNCTION - 133)) | (1L << (EXTENDED - 133)) | (1L << (REFRESH - 133)) | (1L << (CLEAR - 133)) | (1L << (CACHE - 133)) | (1L << (UNCACHE - 133)) | (1L << (LAZY - 133)) | (1L << (FORMATTED - 133)) | (1L << (GLOBAL - 133)) | (1L << (TEMPORARY - 133)) | (1L << (OPTIONS - 133)) | (1L << (UNSET - 133)) | (1L << (TBLPROPERTIES - 133)) | (1L << (DBPROPERTIES - 133)) | (1L << (BUCKETS - 133)) | (1L << (SKEWED - 133)) | (1L << (STORED - 133)) | (1L << (DIRECTORIES - 133)))) != 0) || ((((_la - 197)) & ~0x3f) == 0 && ((1L << (_la - 197)) & ((1L << (LOCATION - 197)) | (1L << (EXCHANGE - 197)) | (1L << (ARCHIVE - 197)) | (1L << (UNARCHIVE - 197)) | (1L << (FILEFORMAT - 197)) | (1L << (TOUCH - 197)) | (1L << (COMPACT - 197)) | (1L << (CONCATENATE - 197)) | (1L << (CHANGE - 197)) | (1L << (CASCADE - 197)) | (1L << (RESTRICT - 197)) | (1L << (CLUSTERED - 197)) | (1L << (SORTED - 197)) | (1L << (PURGE - 197)) | (1L << (INPUTFORMAT - 197)) | (1L << (OUTPUTFORMAT - 197)) | (1L << (DATABASE - 197)) | (1L << (DATABASES - 197)) | (1L << (DFS - 197)) | (1L << (TRUNCATE - 197)) | (1L << (ANALYZE - 197)) | (1L << (COMPUTE - 197)) | (1L << (LIST - 197)) | (1L << (STATISTICS - 197)) | (1L << (PARTITIONED - 197)) | (1L << (EXTERNAL - 197)) | (1L << (DEFINED - 197)) | (1L << (REVOKE - 197)) | (1L << (GRANT - 197)) | (1L << (LOCK - 197)) | (1L << (UNLOCK - 197)) | (1L << (MSCK - 197)) | (1L << (REPAIR - 197)) | (1L << (RECOVER - 197)) | (1L << (EXPORT - 197)) | (1L << (IMPORT - 197)) | (1L << (LOAD - 197)) | (1L << (ROLE - 197)) | (1L << (ROLES - 197)) | (1L << (COMPACTIONS - 197)) | (1L << (PRINCIPALS - 197)) | (1L << (TRANSACTIONS - 197)) | (1L << (INDEX - 197)) | (1L << (INDEXES - 197)) | (1L << (LOCKS - 197)) | (1L << (OPTION - 197)) | (1L << (LOCAL - 197)) | (1L << (INPATH - 197)) | (1L << (CURRENT_DATE - 197)) | (1L << (CURRENT_TIMESTAMP - 197)))) != 0)) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 44:
			return queryTerm_sempred((QueryTermContext)_localctx, predIndex);
		case 74:
			return booleanExpression_sempred((BooleanExpressionContext)_localctx, predIndex);
		case 77:
			return valueExpression_sempred((ValueExpressionContext)_localctx, predIndex);
		case 78:
			return primaryExpression_sempred((PrimaryExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean queryTerm_sempred(QueryTermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean booleanExpression_sempred(BooleanExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean valueExpression_sempred(ValueExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 6);
		case 4:
			return precpred(_ctx, 5);
		case 5:
			return precpred(_ctx, 4);
		case 6:
			return precpred(_ctx, 3);
		case 7:
			return precpred(_ctx, 2);
		case 8:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean primaryExpression_sempred(PrimaryExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 4);
		case 10:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u010a\u06aa\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\3\2\6\2\u00e2\n\2\r\2\16\2\u00e3\3\2\3"+
		"\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0103\n\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u010f\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0127\n\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\5\7\u013e\n\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\6\t\u0148"+
		"\n\t\r\t\16\t\u0149\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\7"+
		"\16\u0157\n\16\f\16\16\16\u015a\13\16\3\17\3\17\3\20\3\20\3\20\7\20\u0161"+
		"\n\20\f\20\16\20\u0164\13\20\3\21\3\21\3\22\3\22\3\23\3\23\5\23\u016c"+
		"\n\23\3\23\5\23\u016f\n\23\3\23\3\23\3\23\3\23\5\23\u0175\n\23\3\23\3"+
		"\23\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u017f\n\24\3\24\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u018b\n\25\3\25\3\25\3\25\5\25\u0190"+
		"\n\25\3\26\3\26\3\26\3\27\5\27\u0196\n\27\3\27\3\27\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\5\30\u01a2\n\30\5\30\u01a4\n\30\3\30\3\30\3\30\5"+
		"\30\u01a9\n\30\3\30\5\30\u01ac\n\30\5\30\u01ae\n\30\3\31\3\31\5\31\u01b2"+
		"\n\31\3\32\3\32\3\32\3\32\3\32\7\32\u01b9\n\32\f\32\16\32\u01bc\13\32"+
		"\3\32\3\32\3\33\3\33\3\33\5\33\u01c3\n\33\3\34\3\34\3\34\3\34\3\34\5\34"+
		"\u01ca\n\34\3\35\3\35\3\35\3\35\5\35\u01d0\n\35\7\35\u01d2\n\35\f\35\16"+
		"\35\u01d5\13\35\3\36\3\36\3\36\3\36\7\36\u01db\n\36\f\36\16\36\u01de\13"+
		"\36\3\37\3\37\5\37\u01e2\n\37\3\37\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3"+
		"!\7!\u01ef\n!\f!\16!\u01f2\13!\3!\3!\3\"\3\"\5\"\u01f8\n\"\3\"\5\"\u01fb"+
		"\n\"\3#\3#\3#\7#\u0200\n#\f#\16#\u0203\13#\3#\5#\u0206\n#\3$\3$\3$\3$"+
		"\5$\u020c\n$\3%\3%\3%\3%\7%\u0212\n%\f%\16%\u0215\13%\3%\3%\3&\3&\3&\3"+
		"&\7&\u021d\n&\f&\16&\u0220\13&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u022a"+
		"\n\'\3(\3(\3(\3(\3(\5(\u0231\n(\3)\3)\3)\3)\5)\u0237\n)\3*\3*\3*\3+\5"+
		"+\u023d\n+\3+\3+\3+\3+\3+\6+\u0244\n+\r+\16+\u0245\5+\u0248\n+\3,\3,\3"+
		",\3,\3,\7,\u024f\n,\f,\16,\u0252\13,\5,\u0254\n,\3,\3,\3,\3,\3,\7,\u025b"+
		"\n,\f,\16,\u025e\13,\5,\u0260\n,\3,\3,\3,\3,\3,\7,\u0267\n,\f,\16,\u026a"+
		"\13,\5,\u026c\n,\3,\3,\3,\3,\3,\7,\u0273\n,\f,\16,\u0276\13,\5,\u0278"+
		"\n,\3,\5,\u027b\n,\3,\3,\5,\u027f\n,\3-\5-\u0282\n-\3-\3-\3-\3.\3.\3."+
		"\3.\3.\3.\5.\u028d\n.\3.\7.\u0290\n.\f.\16.\u0293\13.\3/\3/\3/\3/\3/\3"+
		"/\3/\3/\5/\u029d\n/\3\60\3\60\5\60\u02a1\n\60\3\60\3\60\5\60\u02a5\n\60"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u02b1\n\61\3\61"+
		"\5\61\u02b4\n\61\3\61\3\61\5\61\u02b8\n\61\3\61\3\61\3\61\3\61\3\61\3"+
		"\61\3\61\3\61\5\61\u02c2\n\61\3\61\3\61\5\61\u02c6\n\61\5\61\u02c8\n\61"+
		"\3\61\5\61\u02cb\n\61\3\61\3\61\5\61\u02cf\n\61\3\61\5\61\u02d2\n\61\3"+
		"\61\3\61\5\61\u02d6\n\61\3\61\3\61\7\61\u02da\n\61\f\61\16\61\u02dd\13"+
		"\61\3\61\5\61\u02e0\n\61\3\61\3\61\5\61\u02e4\n\61\3\61\3\61\3\61\5\61"+
		"\u02e9\n\61\3\61\5\61\u02ec\n\61\5\61\u02ee\n\61\3\61\7\61\u02f1\n\61"+
		"\f\61\16\61\u02f4\13\61\3\61\3\61\5\61\u02f8\n\61\3\61\5\61\u02fb\n\61"+
		"\3\61\3\61\5\61\u02ff\n\61\3\61\5\61\u0302\n\61\5\61\u0304\n\61\3\62\3"+
		"\62\3\62\5\62\u0309\n\62\3\62\7\62\u030c\n\62\f\62\16\62\u030f\13\62\3"+
		"\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\7\63\u0319\n\63\f\63\16\63\u031c"+
		"\13\63\3\63\3\63\5\63\u0320\n\63\3\64\3\64\3\64\3\64\7\64\u0326\n\64\f"+
		"\64\16\64\u0329\13\64\3\64\7\64\u032c\n\64\f\64\16\64\u032f\13\64\3\65"+
		"\3\65\3\65\3\65\3\65\7\65\u0336\n\65\f\65\16\65\u0339\13\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\7\65\u0345\n\65\f\65\16\65\u0348"+
		"\13\65\3\65\3\65\5\65\u034c\n\65\3\66\3\66\3\66\3\66\7\66\u0352\n\66\f"+
		"\66\16\66\u0355\13\66\5\66\u0357\n\66\3\66\3\66\5\66\u035b\n\66\3\67\3"+
		"\67\3\67\5\67\u0360\n\67\3\67\3\67\3\67\3\67\3\67\7\67\u0367\n\67\f\67"+
		"\16\67\u036a\13\67\5\67\u036c\n\67\3\67\3\67\3\67\5\67\u0371\n\67\3\67"+
		"\3\67\3\67\7\67\u0376\n\67\f\67\16\67\u0379\13\67\5\67\u037b\n\67\38\3"+
		"8\39\39\79\u0381\n9\f9\169\u0384\139\3:\3:\3:\3:\5:\u038a\n:\3:\3:\3:"+
		"\3:\3:\5:\u0391\n:\3;\5;\u0394\n;\3;\3;\3;\5;\u0399\n;\3;\3;\3;\3;\5;"+
		"\u039f\n;\3;\3;\5;\u03a3\n;\3;\5;\u03a6\n;\3;\5;\u03a9\n;\3<\3<\3<\3<"+
		"\3<\3<\3<\7<\u03b2\n<\f<\16<\u03b5\13<\3<\3<\5<\u03b9\n<\3=\3=\3=\3=\3"+
		"=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\5=\u03ce\n=\5=\u03d0\n=\5"+
		"=\u03d2\n=\3=\3=\3>\3>\3>\3>\3?\3?\3?\7?\u03dd\n?\f?\16?\u03e0\13?\3@"+
		"\3@\3@\3@\7@\u03e6\n@\f@\16@\u03e9\13@\3@\3@\3A\3A\5A\u03ef\nA\3B\3B\3"+
		"B\3B\7B\u03f5\nB\fB\16B\u03f8\13B\3B\3B\3C\3C\3C\5C\u03ff\nC\3D\3D\5D"+
		"\u0403\nD\3D\5D\u0406\nD\3D\5D\u0409\nD\3D\3D\3D\3D\5D\u040f\nD\3D\5D"+
		"\u0412\nD\3D\5D\u0415\nD\3D\3D\3D\3D\5D\u041b\nD\3D\5D\u041e\nD\3D\5D"+
		"\u0421\nD\3D\3D\3D\3D\3D\3D\7D\u0429\nD\fD\16D\u042c\13D\5D\u042e\nD\3"+
		"D\3D\5D\u0432\nD\3E\3E\3E\3E\7E\u0438\nE\fE\16E\u043b\13E\3E\5E\u043e"+
		"\nE\3E\3E\5E\u0442\nE\5E\u0444\nE\3F\3F\3F\3F\3F\3F\3F\5F\u044d\nF\3F"+
		"\3F\3F\3F\3F\3F\3F\3F\3F\3F\5F\u0459\nF\5F\u045b\nF\3F\3F\3F\3F\3F\5F"+
		"\u0462\nF\3F\3F\3F\3F\3F\5F\u0469\nF\3F\3F\3F\3F\5F\u046f\nF\3F\3F\3F"+
		"\3F\5F\u0475\nF\5F\u0477\nF\3G\3G\3G\5G\u047c\nG\3G\3G\3H\3H\3H\5H\u0483"+
		"\nH\3H\3H\3I\3I\5I\u0489\nI\3I\3I\5I\u048d\nI\5I\u048f\nI\3J\3J\3J\7J"+
		"\u0494\nJ\fJ\16J\u0497\13J\3K\3K\3L\3L\3L\3L\3L\3L\3L\3L\3L\5L\u04a4\n"+
		"L\3L\3L\3L\3L\3L\3L\7L\u04ac\nL\fL\16L\u04af\13L\3M\3M\5M\u04b3\nM\3N"+
		"\5N\u04b6\nN\3N\3N\3N\3N\3N\3N\5N\u04be\nN\3N\3N\3N\3N\3N\7N\u04c5\nN"+
		"\fN\16N\u04c8\13N\3N\3N\3N\5N\u04cd\nN\3N\3N\3N\3N\3N\3N\5N\u04d5\nN\3"+
		"N\3N\3N\3N\5N\u04db\nN\3N\5N\u04de\nN\3O\3O\3O\3O\5O\u04e4\nO\3O\3O\3"+
		"O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\7O\u04f9\nO\fO\16O\u04fc"+
		"\13O\3P\3P\3P\3P\6P\u0502\nP\rP\16P\u0503\3P\3P\5P\u0508\nP\3P\3P\3P\3"+
		"P\3P\6P\u050f\nP\rP\16P\u0510\3P\3P\5P\u0515\nP\3P\3P\3P\3P\3P\3P\3P\3"+
		"P\3P\3P\3P\3P\3P\3P\7P\u0525\nP\fP\16P\u0528\13P\5P\u052a\nP\3P\3P\3P"+
		"\3P\3P\3P\5P\u0532\nP\3P\3P\3P\3P\3P\3P\3P\5P\u053b\nP\3P\3P\3P\3P\3P"+
		"\3P\3P\3P\3P\3P\3P\3P\6P\u0549\nP\rP\16P\u054a\3P\3P\3P\3P\3P\3P\3P\3"+
		"P\3P\5P\u0556\nP\3P\3P\3P\7P\u055b\nP\fP\16P\u055e\13P\5P\u0560\nP\3P"+
		"\3P\3P\5P\u0565\nP\3P\3P\3P\3P\3P\5P\u056c\nP\3P\3P\3P\3P\3P\3P\3P\3P"+
		"\7P\u0576\nP\fP\16P\u0579\13P\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\6Q\u0583\nQ\rQ\16"+
		"Q\u0584\5Q\u0587\nQ\3R\3R\3S\3S\3T\3T\3U\3U\3V\3V\7V\u0593\nV\fV\16V\u0596"+
		"\13V\3W\3W\3W\3W\5W\u059c\nW\3X\5X\u059f\nX\3X\3X\5X\u05a3\nX\3Y\3Y\3"+
		"Y\5Y\u05a8\nY\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\5Z\u05b9\n"+
		"Z\3Z\3Z\5Z\u05bd\nZ\3Z\3Z\3Z\3Z\3Z\7Z\u05c4\nZ\fZ\16Z\u05c7\13Z\3Z\5Z"+
		"\u05ca\nZ\5Z\u05cc\nZ\3[\3[\3[\7[\u05d1\n[\f[\16[\u05d4\13[\3\\\3\\\5"+
		"\\\u05d8\n\\\3\\\3\\\3\\\5\\\u05dd\n\\\3\\\3\\\3\\\3\\\3\\\3\\\5\\\u05e5"+
		"\n\\\3]\3]\3^\3^\3_\3_\3_\7_\u05ee\n_\f_\16_\u05f1\13_\3`\3`\3`\3`\3a"+
		"\3a\3a\7a\u05fa\na\fa\16a\u05fd\13a\3b\3b\3b\7b\u0602\nb\fb\16b\u0605"+
		"\13b\3c\3c\3c\3c\3c\5c\u060c\nc\3d\3d\3d\3d\3d\3e\3e\3e\3e\7e\u0617\n"+
		"e\fe\16e\u061a\13e\3f\3f\3f\3f\3g\3g\3g\3g\3g\3g\3g\7g\u0627\ng\fg\16"+
		"g\u062a\13g\3g\3g\3g\3g\3g\7g\u0631\ng\fg\16g\u0634\13g\5g\u0636\ng\3"+
		"g\3g\3g\3g\3g\7g\u063d\ng\fg\16g\u0640\13g\5g\u0642\ng\5g\u0644\ng\3g"+
		"\5g\u0647\ng\3g\5g\u064a\ng\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h"+
		"\3h\3h\5h\u065c\nh\3i\3i\3i\3i\3i\3i\3i\5i\u0665\ni\3j\3j\3j\7j\u066a"+
		"\nj\fj\16j\u066d\13j\3k\3k\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3"+
		"l\3l\5l\u0681\nl\3m\3m\3m\5m\u0686\nm\3n\3n\3o\5o\u068b\no\3o\3o\5o\u068f"+
		"\no\3o\3o\5o\u0693\no\3o\3o\5o\u0697\no\3o\3o\5o\u069b\no\3o\3o\5o\u069f"+
		"\no\3o\3o\5o\u06a3\no\3o\5o\u06a6\no\3p\3p\3p\2\6Z\u0096\u009c\u009eq"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFH"+
		"JLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c"+
		"\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4"+
		"\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc"+
		"\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4"+
		"\u00d6\u00d8\u00da\u00dc\u00de\2\27\4\2\21\21\u0095\u0095\3\2\23\24\4"+
		"\2^^{~\3\2nq\3\2\64\65\4\2QQSS\3\2\25\26\3\2\u00ff\u0100\3\2-.\4\2\u0093"+
		"\u0094\u0099\u0099\3\2\u0095\u0098\3\2\u0093\u0094\3\2\u00f8\u00f9\3\2"+
		"\u008b\u0092\3\2\u0093\u009c\3\2&)\3\2\61\62\4\2JJ\u00a3\u00a3\4\2\"\""+
		"\u00a1\u00a1\3\2NO\17\2\r\20\25\30\35<??G]_mrxzz\177\u0080\u0082\u008a"+
		"\u0098\u0098\u009d\u00f4\u00f6\u00f9\2\u0766\2\u00e1\3\2\2\2\4\u00e7\3"+
		"\2\2\2\6\u00ea\3\2\2\2\b\u00ed\3\2\2\2\n\u00f0\3\2\2\2\f\u013d\3\2\2\2"+
		"\16\u013f\3\2\2\2\20\u0147\3\2\2\2\22\u014b\3\2\2\2\24\u014d\3\2\2\2\26"+
		"\u014f\3\2\2\2\30\u0151\3\2\2\2\32\u0153\3\2\2\2\34\u015b\3\2\2\2\36\u015d"+
		"\3\2\2\2 \u0165\3\2\2\2\"\u0167\3\2\2\2$\u0169\3\2\2\2&\u0178\3\2\2\2"+
		"(\u0184\3\2\2\2*\u0191\3\2\2\2,\u0195\3\2\2\2.\u01ad\3\2\2\2\60\u01af"+
		"\3\2\2\2\62\u01b3\3\2\2\2\64\u01bf\3\2\2\2\66\u01c9\3\2\2\28\u01cb\3\2"+
		"\2\2:\u01d6\3\2\2\2<\u01df\3\2\2\2>\u01e7\3\2\2\2@\u01ea\3\2\2\2B\u01f5"+
		"\3\2\2\2D\u0205\3\2\2\2F\u020b\3\2\2\2H\u020d\3\2\2\2J\u0218\3\2\2\2L"+
		"\u0229\3\2\2\2N\u0230\3\2\2\2P\u0232\3\2\2\2R\u0238\3\2\2\2T\u0247\3\2"+
		"\2\2V\u0253\3\2\2\2X\u0281\3\2\2\2Z\u0286\3\2\2\2\\\u029c\3\2\2\2^\u029e"+
		"\3\2\2\2`\u0303\3\2\2\2b\u0305\3\2\2\2d\u031f\3\2\2\2f\u0321\3\2\2\2h"+
		"\u0330\3\2\2\2j\u035a\3\2\2\2l\u035c\3\2\2\2n\u037c\3\2\2\2p\u037e\3\2"+
		"\2\2r\u0390\3\2\2\2t\u03a8\3\2\2\2v\u03b8\3\2\2\2x\u03ba\3\2\2\2z\u03d5"+
		"\3\2\2\2|\u03d9\3\2\2\2~\u03e1\3\2\2\2\u0080\u03ec\3\2\2\2\u0082\u03f0"+
		"\3\2\2\2\u0084\u03fb\3\2\2\2\u0086\u0431\3\2\2\2\u0088\u0433\3\2\2\2\u008a"+
		"\u0476\3\2\2\2\u008c\u047b\3\2\2\2\u008e\u0482\3\2\2\2\u0090\u0486\3\2"+
		"\2\2\u0092\u0490\3\2\2\2\u0094\u0498\3\2\2\2\u0096\u04a3\3\2\2\2\u0098"+
		"\u04b0\3\2\2\2\u009a\u04dd\3\2\2\2\u009c\u04e3\3\2\2\2\u009e\u056b\3\2"+
		"\2\2\u00a0\u0586\3\2\2\2\u00a2\u0588\3\2\2\2\u00a4\u058a\3\2\2\2\u00a6"+
		"\u058c\3\2\2\2\u00a8\u058e\3\2\2\2\u00aa\u0590\3\2\2\2\u00ac\u0597\3\2"+
		"\2\2\u00ae\u05a2\3\2\2\2\u00b0\u05a7\3\2\2\2\u00b2\u05cb\3\2\2\2\u00b4"+
		"\u05cd\3\2\2\2\u00b6\u05e4\3\2\2\2\u00b8\u05e6\3\2\2\2\u00ba\u05e8\3\2"+
		"\2\2\u00bc\u05ea\3\2\2\2\u00be\u05f2\3\2\2\2\u00c0\u05f6\3\2\2\2\u00c2"+
		"\u05fe\3\2\2\2\u00c4\u0606\3\2\2\2\u00c6\u060d\3\2\2\2\u00c8\u0612\3\2"+
		"\2\2\u00ca\u061b\3\2\2\2\u00cc\u0649\3\2\2\2\u00ce\u065b\3\2\2\2\u00d0"+
		"\u0664\3\2\2\2\u00d2\u0666\3\2\2\2\u00d4\u066e\3\2\2\2\u00d6\u0680\3\2"+
		"\2\2\u00d8\u0685\3\2\2\2\u00da\u0687\3\2\2\2\u00dc\u06a5\3\2\2\2\u00de"+
		"\u06a7\3\2\2\2\u00e0\u00e2\5\f\7\2\u00e1\u00e0\3\2\2\2\u00e2\u00e3\3\2"+
		"\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5"+
		"\u00e6\7\2\2\3\u00e6\3\3\2\2\2\u00e7\u00e8\5\u0090I\2\u00e8\u00e9\7\2"+
		"\2\3\u00e9\5\3\2\2\2\u00ea\u00eb\5\u008cG\2\u00eb\u00ec\7\2\2\3\u00ec"+
		"\7\3\2\2\2\u00ed\u00ee\5\u008eH\2\u00ee\u00ef\7\2\2\3\u00ef\t\3\2\2\2"+
		"\u00f0\u00f1\5\u00b2Z\2\u00f1\u00f2\7\2\2\3\u00f2\13\3\2\2\2\u00f3\u013e"+
		"\5,\27\2\u00f4\u00f5\7W\2\2\u00f5\u00f6\7\34\2\2\u00f6\u00f7\7\31\2\2"+
		"\u00f7\u00f8\5\u008cG\2\u00f8\u00f9\7\23\2\2\u00f9\u00fa\5\u00b4[\2\u00fa"+
		"\u00fb\7\24\2\2\u00fb\u00fc\7U\2\2\u00fc\u00fd\7\23\2\2\u00fd\u00fe\5"+
		"\u00bc_\2\u00fe\u0102\7\24\2\2\u00ff\u0100\7\3\2\2\u0100\u0101\7\35\2"+
		"\2\u0101\u0103\5\u00d6l\2\u0102\u00ff\3\2\2\2\u0102\u0103\3\2\2\2\u0103"+
		"\u0104\3\2\2\2\u0104\u0105\7\4\2\2\u0105\u013e\3\2\2\2\u0106\u0107\7W"+
		"\2\2\u0107\u0108\7\34\2\2\u0108\u0109\7\32\2\2\u0109\u010e\5\u008cG\2"+
		"\u010a\u010b\7\23\2\2\u010b\u010c\5\u00b4[\2\u010c\u010d\7\24\2\2\u010d"+
		"\u010f\3\2\2\2\u010e\u010a\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0110\3\2"+
		"\2\2\u0110\u0111\7U\2\2\u0111\u0112\7\23\2\2\u0112\u0113\5\u00bc_\2\u0113"+
		"\u0114\7\24\2\2\u0114\u0115\7\4\2\2\u0115\u013e\3\2\2\2\u0116\u0117\7"+
		"W\2\2\u0117\u0118\7\34\2\2\u0118\u0119\7\33\2\2\u0119\u011a\5\u008cG\2"+
		"\u011a\u011b\7\23\2\2\u011b\u011c\5\u00b4[\2\u011c\u011d\7\24\2\2\u011d"+
		"\u011e\7\4\2\2\u011e\u013e\3\2\2\2\u011f\u0120\7[\2\2\u0120\u0121\7]\2"+
		"\2\u0121\u0122\5\u008cG\2\u0122\u0123\5\20\t\2\u0123\u0124\7\16\2\2\u0124"+
		"\u0126\5\u008cG\2\u0125\u0127\5\20\t\2\u0126\u0125\3\2\2\2\u0126\u0127"+
		"\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u0129\7\4\2\2\u0129\u013e\3\2\2\2\u012a"+
		"\u012b\7\u0080\2\2\u012b\u012c\7\u0081\2\2\u012c\u012d\5\u00d6l\2\u012d"+
		"\u012e\7\4\2\2\u012e\u013e\3\2\2\2\u012f\u0130\7\u0080\2\2\u0130\u0131"+
		"\7y\2\2\u0131\u0132\7\23\2\2\u0132\u0133\7K\2\2\u0133\u0134\7\67\2\2\u0134"+
		"\u0135\7\u00ff\2\2\u0135\u0136\5\34\17\2\u0136\u0137\7\21\2\2\u0137\u0138"+
		"\7\67\2\2\u0138\u0139\7\u00ff\2\2\u0139\u013a\5\34\17\2\u013a\u013b\7"+
		"\24\2\2\u013b\u013c\7\4\2\2\u013c\u013e\3\2\2\2\u013d\u00f3\3\2\2\2\u013d"+
		"\u00f4\3\2\2\2\u013d\u0106\3\2\2\2\u013d\u0116\3\2\2\2\u013d\u011f\3\2"+
		"\2\2\u013d\u012a\3\2\2\2\u013d\u012f\3\2\2\2\u013e\r\3\2\2\2\u013f\u0140"+
		"\5\u00d6l\2\u0140\17\3\2\2\2\u0141\u0148\5\u00d6l\2\u0142\u0148\5\22\n"+
		"\2\u0143\u0148\5\30\r\2\u0144\u0148\5\24\13\2\u0145\u0148\5\26\f\2\u0146"+
		"\u0148\5\34\17\2\u0147\u0141\3\2\2\2\u0147\u0142\3\2\2\2\u0147\u0143\3"+
		"\2\2\2\u0147\u0144\3\2\2\2\u0147\u0145\3\2\2\2\u0147\u0146\3\2\2\2\u0148"+
		"\u0149\3\2\2\2\u0149\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014a\21\3\2\2"+
		"\2\u014b\u014c\t\2\2\2\u014c\23\3\2\2\2\u014d\u014e\7\u00fa\2\2\u014e"+
		"\25\3\2\2\2\u014f\u0150\7\u00ff\2\2\u0150\27\3\2\2\2\u0151\u0152\t\3\2"+
		"\2\u0152\31\3\2\2\2\u0153\u0158\5\u00d6l\2\u0154\u0155\7\21\2\2\u0155"+
		"\u0157\5\u00d6l\2\u0156\u0154\3\2\2\2\u0157\u015a\3\2\2\2\u0158\u0156"+
		"\3\2\2\2\u0158\u0159\3\2\2\2\u0159\33\3\2\2\2\u015a\u0158\3\2\2\2\u015b"+
		"\u015c\t\4\2\2\u015c\35\3\2\2\2\u015d\u0162\5\u00d6l\2\u015e\u015f\7\21"+
		"\2\2\u015f\u0161\5\u00d6l\2\u0160\u015e\3\2\2\2\u0161\u0164\3\2\2\2\u0162"+
		"\u0160\3\2\2\2\u0162\u0163\3\2\2\2\u0163\37\3\2\2\2\u0164\u0162\3\2\2"+
		"\2\u0165\u0166\5\u00d6l\2\u0166!\3\2\2\2\u0167\u0168\5\u00d6l\2\u0168"+
		"#\3\2\2\2\u0169\u016b\7W\2\2\u016a\u016c\7\u00be\2\2\u016b\u016a\3\2\2"+
		"\2\u016b\u016c\3\2\2\2\u016c\u016e\3\2\2\2\u016d\u016f\7\u00e0\2\2\u016e"+
		"\u016d\3\2\2\2\u016e\u016f\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u0174\7X"+
		"\2\2\u0171\u0172\7\u008a\2\2\u0172\u0173\7)\2\2\u0173\u0175\7+\2\2\u0174"+
		"\u0171\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0177\5\u008c"+
		"G\2\u0177%\3\2\2\2\u0178\u0179\7\u00d2\2\2\u0179\u017a\7\35\2\2\u017a"+
		"\u017e\5z>\2\u017b\u017c\7\u00d3\2\2\u017c\u017d\7\35\2\2\u017d\u017f"+
		"\5~@\2\u017e\u017b\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u0180\3\2\2\2\u0180"+
		"\u0181\7]\2\2\u0181\u0182\7\u00ff\2\2\u0182\u0183\7\u00c3\2\2\u0183\'"+
		"\3\2\2\2\u0184\u0185\7\u00c4\2\2\u0185\u0186\7\35\2\2\u0186\u0187\5z>"+
		"\2\u0187\u018a\7F\2\2\u0188\u018b\5H%\2\u0189\u018b\5J&\2\u018a\u0188"+
		"\3\2\2\2\u018a\u0189\3\2\2\2\u018b\u018f\3\2\2\2\u018c\u018d\7\u00c5\2"+
		"\2\u018d\u018e\7\20\2\2\u018e\u0190\7\u00c6\2\2\u018f\u018c\3\2\2\2\u018f"+
		"\u0190\3\2\2\2\u0190)\3\2\2\2\u0191\u0192\7\u00c7\2\2\u0192\u0193\7\u00fa"+
		"\2\2\u0193+\3\2\2\2\u0194\u0196\5:\36\2\u0195\u0194\3\2\2\2\u0195\u0196"+
		"\3\2\2\2\u0196\u0197\3\2\2\2\u0197\u0198\5T+\2\u0198-\3\2\2\2\u0199\u019a"+
		"\7[\2\2\u019a\u019b\7\u00a4\2\2\u019b\u019c\7X\2\2\u019c\u01a3\5\u008c"+
		"G\2\u019d\u01a1\5\62\32\2\u019e\u019f\7\u008a\2\2\u019f\u01a0\7)\2\2\u01a0"+
		"\u01a2\7+\2\2\u01a1\u019e\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01a4\3\2"+
		"\2\2\u01a3\u019d\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01ae\3\2\2\2\u01a5"+
		"\u01a6\7[\2\2\u01a6\u01a8\7]\2\2\u01a7\u01a9\7X\2\2\u01a8\u01a7\3\2\2"+
		"\2\u01a8\u01a9\3\2\2\2\u01a9\u01ab\3\2\2\2\u01aa\u01ac\5\u008cG\2\u01ab"+
		"\u01aa\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01ae\3\2\2\2\u01ad\u0199\3\2"+
		"\2\2\u01ad\u01a5\3\2\2\2\u01ae/\3\2\2\2\u01af\u01b1\5\62\32\2\u01b0\u01b2"+
		"\5*\26\2\u01b1\u01b0\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2\61\3\2\2\2\u01b3"+
		"\u01b4\7J\2\2\u01b4\u01b5\7\23\2\2\u01b5\u01ba\5\64\33\2\u01b6\u01b7\7"+
		"\21\2\2\u01b7\u01b9\5\64\33\2\u01b8\u01b6\3\2\2\2\u01b9\u01bc\3\2\2\2"+
		"\u01ba\u01b8\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb\u01bd\3\2\2\2\u01bc\u01ba"+
		"\3\2\2\2\u01bd\u01be\7\24\2\2\u01be\63\3\2\2\2\u01bf\u01c2\5\u00d6l\2"+
		"\u01c0\u01c1\7\u008b\2\2\u01c1\u01c3\5\u00a0Q\2\u01c2\u01c0\3\2\2\2\u01c2"+
		"\u01c3\3\2\2\2\u01c3\65\3\2\2\2\u01c4\u01ca\5\u00d2j\2\u01c5\u01ca\7\u00fa"+
		"\2\2\u01c6\u01ca\5\u00a2R\2\u01c7\u01ca\5\u00a4S\2\u01c8\u01ca\5\u00a6"+
		"T\2\u01c9\u01c4\3\2\2\2\u01c9\u01c5\3\2\2\2\u01c9\u01c6\3\2\2\2\u01c9"+
		"\u01c7\3\2\2\2\u01c9\u01c8\3\2\2\2\u01ca\67\3\2\2\2\u01cb\u01d3\5\u00d6"+
		"l\2\u01cc\u01cf\7\5\2\2\u01cd\u01d0\5\u00d6l\2\u01ce\u01d0\7\u00fa\2\2"+
		"\u01cf\u01cd\3\2\2\2\u01cf\u01ce\3\2\2\2\u01d0\u01d2\3\2\2\2\u01d1\u01cc"+
		"\3\2\2\2\u01d2\u01d5\3\2\2\2\u01d3\u01d1\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4"+
		"9\3\2\2\2\u01d5\u01d3\3\2\2\2\u01d6\u01d7\7U\2\2\u01d7\u01dc\5<\37\2\u01d8"+
		"\u01d9\7\21\2\2\u01d9\u01db\5<\37\2\u01da\u01d8\3\2\2\2\u01db\u01de\3"+
		"\2\2\2\u01dc\u01da\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd;\3\2\2\2\u01de\u01dc"+
		"\3\2\2\2\u01df\u01e1\5\u00d6l\2\u01e0\u01e2\7\20\2\2\u01e1\u01e0\3\2\2"+
		"\2\u01e1\u01e2\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3\u01e4\7\23\2\2\u01e4"+
		"\u01e5\5,\27\2\u01e5\u01e6\7\24\2\2\u01e6=\3\2\2\2\u01e7\u01e8\7\u00a7"+
		"\2\2\u01e8\u01e9\5\u00d2j\2\u01e9?\3\2\2\2\u01ea\u01eb\7\23\2\2\u01eb"+
		"\u01f0\5B\"\2\u01ec\u01ed\7\21\2\2\u01ed\u01ef\5B\"\2\u01ee\u01ec\3\2"+
		"\2\2\u01ef\u01f2\3\2\2\2\u01f0\u01ee\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f1"+
		"\u01f3\3\2\2\2\u01f2\u01f0\3\2\2\2\u01f3\u01f4\7\24\2\2\u01f4A\3\2\2\2"+
		"\u01f5\u01fa\5D#\2\u01f6\u01f8\7\u008b\2\2\u01f7\u01f6\3\2\2\2\u01f7\u01f8"+
		"\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9\u01fb\5F$\2\u01fa\u01f7\3\2\2\2\u01fa"+
		"\u01fb\3\2\2\2\u01fbC\3\2\2\2\u01fc\u0201\5\u00d6l\2\u01fd\u01fe\7\5\2"+
		"\2\u01fe\u0200\5\u00d6l\2\u01ff\u01fd\3\2\2\2\u0200\u0203\3\2\2\2\u0201"+
		"\u01ff\3\2\2\2\u0201\u0202\3\2\2\2\u0202\u0206\3\2\2\2\u0203\u0201\3\2"+
		"\2\2\u0204\u0206\7\u00fa\2\2\u0205\u01fc\3\2\2\2\u0205\u0204\3\2\2\2\u0206"+
		"E\3\2\2\2\u0207\u020c\7\u00ff\2\2\u0208\u020c\7\u0100\2\2\u0209\u020c"+
		"\5\u00a8U\2\u020a\u020c\7\u00fa\2\2\u020b\u0207\3\2\2\2\u020b\u0208\3"+
		"\2\2\2\u020b\u0209\3\2\2\2\u020b\u020a\3\2\2\2\u020cG\3\2\2\2\u020d\u020e"+
		"\7\23\2\2\u020e\u0213\5\u00a0Q\2\u020f\u0210\7\21\2\2\u0210\u0212\5\u00a0"+
		"Q\2\u0211\u020f\3\2\2\2\u0212\u0215\3\2\2\2\u0213\u0211\3\2\2\2\u0213"+
		"\u0214\3\2\2\2\u0214\u0216\3\2\2\2\u0215\u0213\3\2\2\2\u0216\u0217\7\24"+
		"\2\2\u0217I\3\2\2\2\u0218\u0219\7\23\2\2\u0219\u021e\5H%\2\u021a\u021b"+
		"\7\21\2\2\u021b\u021d\5H%\2\u021c\u021a\3\2\2\2\u021d\u0220\3\2\2\2\u021e"+
		"\u021c\3\2\2\2\u021e\u021f\3\2\2\2\u021f\u0221\3\2\2\2\u0220\u021e\3\2"+
		"\2\2\u0221\u0222\7\24\2\2\u0222K\3\2\2\2\u0223\u0224\7\u00c5\2\2\u0224"+
		"\u0225\7\20\2\2\u0225\u022a\5N(\2\u0226\u0227\7\u00c5\2\2\u0227\u0228"+
		"\7\35\2\2\u0228\u022a\5P)\2\u0229\u0223\3\2\2\2\u0229\u0226\3\2\2\2\u022a"+
		"M\3\2\2\2\u022b\u022c\7\u00d5\2\2\u022c\u022d\7\u00fa\2\2\u022d\u022e"+
		"\7\u00d6\2\2\u022e\u0231\7\u00fa\2\2\u022f\u0231\5\u00d6l\2\u0230\u022b"+
		"\3\2\2\2\u0230\u022f\3\2\2\2\u0231O\3\2\2\2\u0232\u0236\7\u00fa\2\2\u0233"+
		"\u0234\7U\2\2\u0234\u0235\7\u00a9\2\2\u0235\u0237\5@!\2\u0236\u0233\3"+
		"\2\2\2\u0236\u0237\3\2\2\2\u0237Q\3\2\2\2\u0238\u0239\5\u00d6l\2\u0239"+
		"\u023a\7\u00fa\2\2\u023aS\3\2\2\2\u023b\u023d\5.\30\2\u023c\u023b\3\2"+
		"\2\2\u023c\u023d\3\2\2\2\u023d\u023e\3\2\2\2\u023e\u023f\5Z.\2\u023f\u0240"+
		"\5V,\2\u0240\u0248\3\2\2\2\u0241\u0243\5f\64\2\u0242\u0244\5X-\2\u0243"+
		"\u0242\3\2\2\2\u0244\u0245\3\2\2\2\u0245\u0243\3\2\2\2\u0245\u0246\3\2"+
		"\2\2\u0246\u0248\3\2\2\2\u0247\u023c\3\2\2\2\u0247\u0241\3\2\2\2\u0248"+
		"U\3\2\2\2\u0249\u024a\7\"\2\2\u024a\u024b\7\35\2\2\u024b\u0250\5^\60\2"+
		"\u024c\u024d\7\21\2\2\u024d\u024f\5^\60\2\u024e\u024c\3\2\2\2\u024f\u0252"+
		"\3\2\2\2\u0250\u024e\3\2\2\2\u0250\u0251\3\2\2\2\u0251\u0254\3\2\2\2\u0252"+
		"\u0250\3\2\2\2\u0253\u0249\3\2\2\2\u0253\u0254\3\2\2\2\u0254\u025f\3\2"+
		"\2\2\u0255\u0256\7\u00a2\2\2\u0256\u0257\7\35\2\2\u0257\u025c\5\u0094"+
		"K\2\u0258\u0259\7\21\2\2\u0259\u025b\5\u0094K\2\u025a\u0258\3\2\2\2\u025b"+
		"\u025e\3\2\2\2\u025c\u025a\3\2\2\2\u025c\u025d\3\2\2\2\u025d\u0260\3\2"+
		"\2\2\u025e\u025c\3\2\2\2\u025f\u0255\3\2\2\2\u025f\u0260\3\2\2\2\u0260"+
		"\u026b\3\2\2\2\u0261\u0262\7\u00a3\2\2\u0262\u0263\7\35\2\2\u0263\u0268"+
		"\5\u0094K\2\u0264\u0265\7\21\2\2\u0265\u0267\5\u0094K\2\u0266\u0264\3"+
		"\2\2\2\u0267\u026a\3\2\2\2\u0268\u0266\3\2\2\2\u0268\u0269\3\2\2\2\u0269"+
		"\u026c\3\2\2\2\u026a\u0268\3\2\2\2\u026b\u0261\3\2\2\2\u026b\u026c\3\2"+
		"\2\2\u026c\u0277\3\2\2\2\u026d\u026e\7\u00a1\2\2\u026e\u026f\7\35\2\2"+
		"\u026f\u0274\5^\60\2\u0270\u0271\7\21\2\2\u0271\u0273\5^\60\2\u0272\u0270"+
		"\3\2\2\2\u0273\u0276\3\2\2\2\u0274\u0272\3\2\2\2\u0274\u0275\3\2\2\2\u0275"+
		"\u0278\3\2\2\2\u0276\u0274\3\2\2\2\u0277\u026d\3\2\2\2\u0277\u0278\3\2"+
		"\2\2\u0278\u027a\3\2\2\2\u0279\u027b\5\u00c8e\2\u027a\u0279\3\2\2\2\u027a"+
		"\u027b\3\2\2\2\u027b\u027e\3\2\2\2\u027c\u027d\7$\2\2\u027d\u027f\5\u0094"+
		"K\2\u027e\u027c\3\2\2\2\u027e\u027f\3\2\2\2\u027fW\3\2\2\2\u0280\u0282"+
		"\5.\30\2\u0281\u0280\3\2\2\2\u0281\u0282\3\2\2\2\u0282\u0283\3\2\2\2\u0283"+
		"\u0284\5`\61\2\u0284\u0285\5V,\2\u0285Y\3\2\2\2\u0286\u0287\b.\1\2\u0287"+
		"\u0288\5\\/\2\u0288\u0291\3\2\2\2\u0289\u028a\f\3\2\2\u028a\u028c\t\5"+
		"\2\2\u028b\u028d\5n8\2\u028c\u028b\3\2\2\2\u028c\u028d\3\2\2\2\u028d\u028e"+
		"\3\2\2\2\u028e\u0290\5Z.\4\u028f\u0289\3\2\2\2\u0290\u0293\3\2\2\2\u0291"+
		"\u028f\3\2\2\2\u0291\u0292\3\2\2\2\u0292[\3\2\2\2\u0293\u0291\3\2\2\2"+
		"\u0294\u029d\5`\61\2\u0295\u0296\7X\2\2\u0296\u029d\5\u008cG\2\u0297\u029d"+
		"\5\u0088E\2\u0298\u0299\7\23\2\2\u0299\u029a\5T+\2\u029a\u029b\7\24\2"+
		"\2\u029b\u029d\3\2\2\2\u029c\u0294\3\2\2\2\u029c\u0295\3\2\2\2\u029c\u0297"+
		"\3\2\2\2\u029c\u0298\3\2\2\2\u029d]\3\2\2\2\u029e\u02a0\5\u0094K\2\u029f"+
		"\u02a1\t\6\2\2\u02a0\u029f\3\2\2\2\u02a0\u02a1\3\2\2\2\u02a1\u02a4\3\2"+
		"\2\2\u02a2\u02a3\7\63\2\2\u02a3\u02a5\t\7\2\2\u02a4\u02a2\3\2\2\2\u02a4"+
		"\u02a5\3\2\2\2\u02a5_\3\2\2\2\u02a6\u02a7\7\r\2\2\u02a7\u02a8\7\u00a5"+
		"\2\2\u02a8\u02a9\7\23\2\2\u02a9\u02aa\5\u0092J\2\u02aa\u02ab\7\24\2\2"+
		"\u02ab\u02b1\3\2\2\2\u02ac\u02ad\7x\2\2\u02ad\u02b1\5\u0092J\2\u02ae\u02af"+
		"\7\u00a6\2\2\u02af\u02b1\5\u0092J\2\u02b0\u02a6\3\2\2\2\u02b0\u02ac\3"+
		"\2\2\2\u02b0\u02ae\3\2\2\2\u02b1\u02b3\3\2\2\2\u02b2\u02b4\5\u008aF\2"+
		"\u02b3\u02b2\3\2\2\2\u02b3\u02b4\3\2\2\2\u02b4\u02b7\3\2\2\2\u02b5\u02b6"+
		"\7\u00ab\2\2\u02b6\u02b8\7\u00fa\2\2\u02b7\u02b5\3\2\2\2\u02b7\u02b8\3"+
		"\2\2\2\u02b8\u02b9\3\2\2\2\u02b9\u02ba\7\u00a7\2\2\u02ba\u02c7\7\u00fa"+
		"\2\2\u02bb\u02c5\7\20\2\2\u02bc\u02c6\5|?\2\u02bd\u02c6\5\u00b4[\2\u02be"+
		"\u02c1\7\23\2\2\u02bf\u02c2\5|?\2\u02c0\u02c2\5\u00b4[\2\u02c1\u02bf\3"+
		"\2\2\2\u02c1\u02c0\3\2\2\2\u02c2\u02c3\3\2\2\2\u02c3\u02c4\7\24\2\2\u02c4"+
		"\u02c6\3\2\2\2\u02c5\u02bc\3\2\2\2\u02c5\u02bd\3\2\2\2\u02c5\u02be\3\2"+
		"\2\2\u02c6\u02c8\3\2\2\2\u02c7\u02bb\3\2\2\2\u02c7\u02c8\3\2\2\2\u02c8"+
		"\u02ca\3\2\2\2\u02c9\u02cb\5\u008aF\2\u02ca\u02c9\3\2\2\2\u02ca\u02cb"+
		"\3\2\2\2\u02cb\u02ce\3\2\2\2\u02cc\u02cd\7\u00aa\2\2\u02cd\u02cf\7\u00fa"+
		"\2\2\u02ce\u02cc\3\2\2\2\u02ce\u02cf\3\2\2\2\u02cf\u02d1\3\2\2\2\u02d0"+
		"\u02d2\5f\64\2\u02d1\u02d0\3\2\2\2\u02d1\u02d2\3\2\2\2\u02d2\u02d5\3\2"+
		"\2\2\u02d3\u02d4\7\27\2\2\u02d4\u02d6\5\u0096L\2\u02d5\u02d3\3\2\2\2\u02d5"+
		"\u02d6\3\2\2\2\u02d6\u0304\3\2\2\2\u02d7\u02db\7\r\2\2\u02d8\u02da\5b"+
		"\62\2\u02d9\u02d8\3\2\2\2\u02da\u02dd\3\2\2\2\u02db\u02d9\3\2\2\2\u02db"+
		"\u02dc\3\2\2\2\u02dc\u02df\3\2\2\2\u02dd\u02db\3\2\2\2\u02de\u02e0\5n"+
		"8\2\u02df\u02de\3\2\2\2\u02df\u02e0\3\2\2\2\u02e0\u02e1\3\2\2\2\u02e1"+
		"\u02e3\5\u0092J\2\u02e2\u02e4\5f\64\2\u02e3\u02e2\3\2\2\2\u02e3\u02e4"+
		"\3\2\2\2\u02e4\u02ee\3\2\2\2\u02e5\u02eb\5f\64\2\u02e6\u02e8\7\r\2\2\u02e7"+
		"\u02e9\5n8\2\u02e8\u02e7\3\2\2\2\u02e8\u02e9\3\2\2\2\u02e9\u02ea\3\2\2"+
		"\2\u02ea\u02ec\5\u0092J\2\u02eb\u02e6\3\2\2\2\u02eb\u02ec\3\2\2\2\u02ec"+
		"\u02ee\3\2\2\2\u02ed\u02d7\3\2\2\2\u02ed\u02e5\3\2\2\2\u02ee\u02f2\3\2"+
		"\2\2\u02ef\u02f1\5l\67\2\u02f0\u02ef\3\2\2\2\u02f1\u02f4\3\2\2\2\u02f2"+
		"\u02f0\3\2\2\2\u02f2\u02f3\3\2\2\2\u02f3\u02f7\3\2\2\2\u02f4\u02f2\3\2"+
		"\2\2\u02f5\u02f6\7\27\2\2\u02f6\u02f8\5\u0096L\2\u02f7\u02f5\3\2\2\2\u02f7"+
		"\u02f8\3\2\2\2\u02f8\u02fa\3\2\2\2\u02f9\u02fb\5h\65\2\u02fa\u02f9\3\2"+
		"\2\2\u02fa\u02fb\3\2\2\2\u02fb\u02fe\3\2\2\2\u02fc\u02fd\7#\2\2\u02fd"+
		"\u02ff\5\u0096L\2\u02fe\u02fc\3\2\2\2\u02fe\u02ff\3\2\2\2\u02ff\u0301"+
		"\3\2\2\2\u0300\u0302\5\u00c8e\2\u0301\u0300\3\2\2\2\u0301\u0302\3\2\2"+
		"\2\u0302\u0304\3\2\2\2\u0303\u02b0\3\2\2\2\u0303\u02ed\3\2\2\2\u0304a"+
		"\3\2\2\2\u0305\u0306\7\6\2\2\u0306\u030d\5d\63\2\u0307\u0309\7\21\2\2"+
		"\u0308\u0307\3\2\2\2\u0308\u0309\3\2\2\2\u0309\u030a\3\2\2\2\u030a\u030c"+
		"\5d\63\2\u030b\u0308\3\2\2\2\u030c\u030f\3\2\2\2\u030d\u030b\3\2\2\2\u030d"+
		"\u030e\3\2\2\2\u030e\u0310\3\2\2\2\u030f\u030d\3\2\2\2\u0310\u0311\7\7"+
		"\2\2\u0311c\3\2\2\2\u0312\u0320\5\u00d6l\2\u0313\u0314\5\u00d6l\2\u0314"+
		"\u0315\7\23\2\2\u0315\u031a\5\u009eP\2\u0316\u0317\7\21\2\2\u0317\u0319"+
		"\5\u009eP\2\u0318\u0316\3\2\2\2\u0319\u031c\3\2\2\2\u031a\u0318\3\2\2"+
		"\2\u031a\u031b\3\2\2\2\u031b\u031d\3\2\2\2\u031c\u031a\3\2\2\2\u031d\u031e"+
		"\7\24\2\2\u031e\u0320\3\2\2\2\u031f\u0312\3\2\2\2\u031f\u0313\3\2\2\2"+
		"\u0320e\3\2\2\2\u0321\u0322\7\16\2\2\u0322\u0327\5p9\2\u0323\u0324\7\21"+
		"\2\2\u0324\u0326\5p9\2\u0325\u0323\3\2\2\2\u0326\u0329\3\2\2\2\u0327\u0325"+
		"\3\2\2\2\u0327\u0328\3\2\2\2\u0328\u032d\3\2\2\2\u0329\u0327\3\2\2\2\u032a"+
		"\u032c\5l\67\2\u032b\u032a\3\2\2\2\u032c\u032f\3\2\2\2\u032d\u032b\3\2"+
		"\2\2\u032d\u032e\3\2\2\2\u032eg\3\2\2\2\u032f\u032d\3\2\2\2\u0330\u0331"+
		"\7\30\2\2\u0331\u0332\7\35\2\2\u0332\u0337\5\u0094K\2\u0333\u0334\7\21"+
		"\2\2\u0334\u0336\5\u0094K\2\u0335\u0333\3\2\2\2\u0336\u0339\3\2\2\2\u0337"+
		"\u0335\3\2\2\2\u0337\u0338\3\2\2\2\u0338\u034b\3\2\2\2\u0339\u0337\3\2"+
		"\2\2\u033a\u033b\7U\2\2\u033b\u034c\7!\2\2\u033c\u033d\7U\2\2\u033d\u034c"+
		"\7 \2\2\u033e\u033f\7\36\2\2\u033f\u0340\7\37\2\2\u0340\u0341\7\23\2\2"+
		"\u0341\u0346\5j\66\2\u0342\u0343\7\21\2\2\u0343\u0345\5j\66\2\u0344\u0342"+
		"\3\2\2\2\u0345\u0348\3\2\2\2\u0346\u0344\3\2\2\2\u0346\u0347\3\2\2\2\u0347"+
		"\u0349\3\2\2\2\u0348\u0346\3\2\2\2\u0349\u034a\7\24\2\2\u034a\u034c\3"+
		"\2\2\2\u034b\u033a\3\2\2\2\u034b\u033c\3\2\2\2\u034b\u033e\3\2\2\2\u034b"+
		"\u034c\3\2\2\2\u034ci\3\2\2\2\u034d\u0356\7\23\2\2\u034e\u0353\5\u0094"+
		"K\2\u034f\u0350\7\21\2\2\u0350\u0352\5\u0094K\2\u0351\u034f\3\2\2\2\u0352"+
		"\u0355\3\2\2\2\u0353\u0351\3\2\2\2\u0353\u0354\3\2\2\2\u0354\u0357\3\2"+
		"\2\2\u0355\u0353\3\2\2\2\u0356\u034e\3\2\2\2\u0356\u0357\3\2\2\2\u0357"+
		"\u0358\3\2\2\2\u0358\u035b\7\24\2\2\u0359\u035b\5\u0094K\2\u035a\u034d"+
		"\3\2\2\2\u035a\u0359\3\2\2\2\u035bk\3\2\2\2\u035c\u035d\7G\2\2\u035d\u035f"+
		"\7Y\2\2\u035e\u0360\7?\2\2\u035f\u035e\3\2\2\2\u035f\u0360\3\2\2\2\u0360"+
		"\u0361\3\2\2\2\u0361\u0362\5\u00d2j\2\u0362\u036b\7\23\2\2\u0363\u0368"+
		"\5\u0094K\2\u0364\u0365\7\21\2\2\u0365\u0367\5\u0094K\2\u0366\u0364\3"+
		"\2\2\2\u0367\u036a\3\2\2\2\u0368\u0366\3\2\2\2\u0368\u0369\3\2\2\2\u0369"+
		"\u036c\3\2\2\2\u036a\u0368\3\2\2\2\u036b\u0363\3\2\2\2\u036b\u036c\3\2"+
		"\2\2\u036c\u036d\3\2\2\2\u036d\u036e\7\24\2\2\u036e\u037a\5\u00d6l\2\u036f"+
		"\u0371\7\20\2\2\u0370\u036f\3\2\2\2\u0370\u0371\3\2\2\2\u0371\u0372\3"+
		"\2\2\2\u0372\u0377\5\u00d6l\2\u0373\u0374\7\21\2\2\u0374\u0376\5\u00d6"+
		"l\2\u0375\u0373\3\2\2\2\u0376\u0379\3\2\2\2\u0377\u0375\3\2\2\2\u0377"+
		"\u0378\3\2\2\2\u0378\u037b\3\2\2\2\u0379\u0377\3\2\2\2\u037a\u0370\3\2"+
		"\2\2\u037a\u037b\3\2\2\2\u037bm\3\2\2\2\u037c\u037d\t\b\2\2\u037do\3\2"+
		"\2\2\u037e\u0382\5\u0086D\2\u037f\u0381\5r:\2\u0380\u037f\3\2\2\2\u0381"+
		"\u0384\3\2\2\2\u0382\u0380\3\2\2\2\u0382\u0383\3\2\2\2\u0383q\3\2\2\2"+
		"\u0384\u0382\3\2\2\2\u0385\u0386\5t;\2\u0386\u0387\7=\2\2\u0387\u0389"+
		"\5\u0086D\2\u0388\u038a\5v<\2\u0389\u0388\3\2\2\2\u0389\u038a\3\2\2\2"+
		"\u038a\u0391\3\2\2\2\u038b\u038c\7E\2\2\u038c\u038d\5t;\2\u038d\u038e"+
		"\7=\2\2\u038e\u038f\5\u0086D\2\u038f\u0391\3\2\2\2\u0390\u0385\3\2\2\2"+
		"\u0390\u038b\3\2\2\2\u0391s\3\2\2\2\u0392\u0394\7@\2\2\u0393\u0392\3\2"+
		"\2\2\u0393\u0394\3\2\2\2\u0394\u03a9\3\2\2\2\u0395\u03a9\7>\2\2\u0396"+
		"\u0398\7A\2\2\u0397\u0399\7?\2\2\u0398\u0397\3\2\2\2\u0398\u0399\3\2\2"+
		"\2\u0399\u03a9\3\2\2\2\u039a\u039b\7A\2\2\u039b\u03a9\7B\2\2\u039c\u039e"+
		"\7C\2\2\u039d\u039f\7?\2\2\u039e\u039d\3\2\2\2\u039e\u039f\3\2\2\2\u039f"+
		"\u03a9\3\2\2\2\u03a0\u03a2\7D\2\2\u03a1\u03a3\7?\2\2\u03a2\u03a1\3\2\2"+
		"\2\u03a2\u03a3\3\2\2\2\u03a3\u03a9\3\2\2\2\u03a4\u03a6\7A\2\2\u03a5\u03a4"+
		"\3\2\2\2\u03a5\u03a6\3\2\2\2\u03a6\u03a7\3\2\2\2\u03a7\u03a9\7\u00f5\2"+
		"\2\u03a8\u0393\3\2\2\2\u03a8\u0395\3\2\2\2\u03a8\u0396\3\2\2\2\u03a8\u039a"+
		"\3\2\2\2\u03a8\u039c\3\2\2\2\u03a8\u03a0\3\2\2\2\u03a8\u03a5\3\2\2\2\u03a9"+
		"u\3\2\2\2\u03aa\u03ab\7F\2\2\u03ab\u03b9\5\u0096L\2\u03ac\u03ad\7\u00a7"+
		"\2\2\u03ad\u03ae\7\23\2\2\u03ae\u03b3\5\u00d6l\2\u03af\u03b0\7\21\2\2"+
		"\u03b0\u03b2\5\u00d6l\2\u03b1\u03af\3\2\2\2\u03b2\u03b5\3\2\2\2\u03b3"+
		"\u03b1\3\2\2\2\u03b3\u03b4\3\2\2\2\u03b4\u03b6\3\2\2\2\u03b5\u03b3\3\2"+
		"\2\2\u03b6\u03b7\7\24\2\2\u03b7\u03b9\3\2\2\2\u03b8\u03aa\3\2\2\2\u03b8"+
		"\u03ac\3\2\2\2\u03b9w\3\2\2\2\u03ba\u03bb\7s\2\2\u03bb\u03d1\7\23\2\2"+
		"\u03bc\u03bd\t\t\2\2\u03bd\u03d2\7\u009d\2\2\u03be\u03bf\5\u0094K\2\u03bf"+
		"\u03c0\7L\2\2\u03c0\u03d2\3\2\2\2\u03c1\u03d2\7\u00fe\2\2\u03c2\u03c3"+
		"\7\u009e\2\2\u03c3\u03c4\7\u00ff\2\2\u03c4\u03c5\7\u009f\2\2\u03c5\u03c6"+
		"\7\u00a0\2\2\u03c6\u03cf\7\u00ff\2\2\u03c7\u03cd\7F\2\2\u03c8\u03ce\5"+
		"\u00d6l\2\u03c9\u03ca\5\u00d2j\2\u03ca\u03cb\7\23\2\2\u03cb\u03cc\7\24"+
		"\2\2\u03cc\u03ce\3\2\2\2\u03cd\u03c8\3\2\2\2\u03cd\u03c9\3\2\2\2\u03ce"+
		"\u03d0\3\2\2\2\u03cf\u03c7\3\2\2\2\u03cf\u03d0\3\2\2\2\u03d0\u03d2\3\2"+
		"\2\2\u03d1\u03bc\3\2\2\2\u03d1\u03be\3\2\2\2\u03d1\u03c1\3\2\2\2\u03d1"+
		"\u03c2\3\2\2\2\u03d2\u03d3\3\2\2\2\u03d3\u03d4\7\24\2\2\u03d4y\3\2\2\2"+
		"\u03d5\u03d6\7\23\2\2\u03d6\u03d7\5|?\2\u03d7\u03d8\7\24\2\2\u03d8{\3"+
		"\2\2\2\u03d9\u03de\5\u00d6l\2\u03da\u03db\7\21\2\2\u03db\u03dd\5\u00d6"+
		"l\2\u03dc\u03da\3\2\2\2\u03dd\u03e0\3\2\2\2\u03de\u03dc\3\2\2\2\u03de"+
		"\u03df\3\2\2\2\u03df}\3\2\2\2\u03e0\u03de\3\2\2\2\u03e1\u03e2\7\23\2\2"+
		"\u03e2\u03e7\5\u0080A\2\u03e3\u03e4\7\21\2\2\u03e4\u03e6\5\u0080A\2\u03e5"+
		"\u03e3\3\2\2\2\u03e6\u03e9\3\2\2\2\u03e7\u03e5\3\2\2\2\u03e7\u03e8\3\2"+
		"\2\2\u03e8\u03ea\3\2\2\2\u03e9\u03e7\3\2\2\2\u03ea\u03eb\7\24\2\2\u03eb"+
		"\177\3\2\2\2\u03ec\u03ee\5\u00d6l\2\u03ed\u03ef\t\6\2\2\u03ee\u03ed\3"+
		"\2\2\2\u03ee\u03ef\3\2\2\2\u03ef\u0081\3\2\2\2\u03f0\u03f1\7\23\2\2\u03f1"+
		"\u03f6\5\u0084C\2\u03f2\u03f3\7\21\2\2\u03f3\u03f5\5\u0084C\2\u03f4\u03f2"+
		"\3\2\2\2\u03f5\u03f8\3\2\2\2\u03f6\u03f4\3\2\2\2\u03f6\u03f7\3\2\2\2\u03f7"+
		"\u03f9\3\2\2\2\u03f8\u03f6\3\2\2\2\u03f9\u03fa\7\24\2\2\u03fa\u0083\3"+
		"\2\2\2\u03fb\u03fe\5\u00d6l\2\u03fc\u03fd\7\177\2\2\u03fd\u03ff\7\u00fa"+
		"\2\2\u03fe\u03fc\3\2\2\2\u03fe\u03ff\3\2\2\2\u03ff\u0085\3\2\2\2\u0400"+
		"\u0402\5\u008cG\2\u0401\u0403\5x=\2\u0402\u0401\3\2\2\2\u0402\u0403\3"+
		"\2\2\2\u0403\u0408\3\2\2\2\u0404\u0406\7\20\2\2\u0405\u0404\3\2\2\2\u0405"+
		"\u0406\3\2\2\2\u0406\u0407\3\2\2\2\u0407\u0409\5\u00d8m\2\u0408\u0405"+
		"\3\2\2\2\u0408\u0409\3\2\2\2\u0409\u0432\3\2\2\2\u040a\u040b\7\23\2\2"+
		"\u040b\u040c\5T+\2\u040c\u040e\7\24\2\2\u040d\u040f\5x=\2\u040e\u040d"+
		"\3\2\2\2\u040e\u040f\3\2\2\2\u040f\u0414\3\2\2\2\u0410\u0412\7\20\2\2"+
		"\u0411\u0410\3\2\2\2\u0411\u0412\3\2\2\2\u0412\u0413\3\2\2\2\u0413\u0415"+
		"\5\u00d8m\2\u0414\u0411\3\2\2\2\u0414\u0415\3\2\2\2\u0415\u0432\3\2\2"+
		"\2\u0416\u0417\7\23\2\2\u0417\u0418\5p9\2\u0418\u041a\7\24\2\2\u0419\u041b"+
		"\5x=\2\u041a\u0419\3\2\2\2\u041a\u041b\3\2\2\2\u041b\u0420\3\2\2\2\u041c"+
		"\u041e\7\20\2\2\u041d\u041c\3\2\2\2\u041d\u041e\3\2\2\2\u041e\u041f\3"+
		"\2\2\2\u041f\u0421\5\u00d8m\2\u0420\u041d\3\2\2\2\u0420\u0421\3\2\2\2"+
		"\u0421\u0432\3\2\2\2\u0422\u0432\5\u0088E\2\u0423\u0424\5\u00d6l\2\u0424"+
		"\u042d\7\23\2\2\u0425\u042a\5\u0094K\2\u0426\u0427\7\21\2\2\u0427\u0429"+
		"\5\u0094K\2\u0428\u0426\3\2\2\2\u0429\u042c\3\2\2\2\u042a\u0428\3\2\2"+
		"\2\u042a\u042b\3\2\2\2\u042b\u042e\3\2\2\2\u042c\u042a\3\2\2\2\u042d\u0425"+
		"\3\2\2\2\u042d\u042e\3\2\2\2\u042e\u042f\3\2\2\2\u042f\u0430\7\24\2\2"+
		"\u0430\u0432\3\2\2\2\u0431\u0400\3\2\2\2\u0431\u040a\3\2\2\2\u0431\u0416"+
		"\3\2\2\2\u0431\u0422\3\2\2\2\u0431\u0423\3\2\2\2\u0432\u0087\3\2\2\2\u0433"+
		"\u0434\7V\2\2\u0434\u0439\5\u0094K\2\u0435\u0436\7\21\2\2\u0436\u0438"+
		"\5\u0094K\2\u0437\u0435\3\2\2\2\u0438\u043b\3\2\2\2\u0439\u0437\3\2\2"+
		"\2\u0439\u043a\3\2\2\2\u043a\u0443\3\2\2\2\u043b\u0439\3\2\2\2\u043c\u043e"+
		"\7\20\2\2\u043d\u043c\3\2\2\2\u043d\u043e\3\2\2\2\u043e\u043f\3\2\2\2"+
		"\u043f\u0441\5\u00d6l\2\u0440\u0442\5z>\2\u0441\u0440\3\2\2\2\u0441\u0442"+
		"\3\2\2\2\u0442\u0444\3\2\2\2\u0443\u043d\3\2\2\2\u0443\u0444\3\2\2\2\u0444"+
		"\u0089\3\2\2\2\u0445\u0446\7T\2\2\u0446\u0447\7a\2\2\u0447\u0448\7\u00a8"+
		"\2\2\u0448\u044c\7\u00fa\2\2\u0449\u044a\7U\2\2\u044a\u044b\7\u00a9\2"+
		"\2\u044b\u044d\5@!\2\u044c\u0449\3\2\2\2\u044c\u044d\3\2\2\2\u044d\u0477"+
		"\3\2\2\2\u044e\u044f\7T\2\2\u044f\u0450\7a\2\2\u0450\u045a\7\u00ac\2\2"+
		"\u0451\u0452\7\u00ad\2\2\u0452\u0453\7\u00ae\2\2\u0453\u0454\7\35\2\2"+
		"\u0454\u0458\7\u00fa\2\2\u0455\u0456\7\u00b2\2\2\u0456\u0457\7\35\2\2"+
		"\u0457\u0459\7\u00fa\2\2\u0458\u0455\3\2\2\2\u0458\u0459\3\2\2\2\u0459"+
		"\u045b\3\2\2\2\u045a\u0451\3\2\2\2\u045a\u045b\3\2\2\2\u045b\u0461\3\2"+
		"\2\2\u045c\u045d\7\u00af\2\2\u045d\u045e\7\u00b0\2\2\u045e\u045f\7\u00ae"+
		"\2\2\u045f\u0460\7\35\2\2\u0460\u0462\7\u00fa\2\2\u0461\u045c\3\2\2\2"+
		"\u0461\u0462\3\2\2\2\u0462\u0468\3\2\2\2\u0463\u0464\7x\2\2\u0464\u0465"+
		"\7\u00b1\2\2\u0465\u0466\7\u00ae\2\2\u0466\u0467\7\35\2\2\u0467\u0469"+
		"\7\u00fa\2\2\u0468\u0463\3\2\2\2\u0468\u0469\3\2\2\2\u0469\u046e\3\2\2"+
		"\2\u046a\u046b\7\u00b3\2\2\u046b\u046c\7\u00ae\2\2\u046c\u046d\7\35\2"+
		"\2\u046d\u046f\7\u00fa\2\2\u046e\u046a\3\2\2\2\u046e\u046f\3\2\2\2\u046f"+
		"\u0474\3\2\2\2\u0470\u0471\7\60\2\2\u0471\u0472\7\u00e1\2\2\u0472\u0473"+
		"\7\20\2\2\u0473\u0475\7\u00fa\2\2\u0474\u0470\3\2\2\2\u0474\u0475\3\2"+
		"\2\2\u0475\u0477\3\2\2\2\u0476\u0445\3\2\2\2\u0476\u044e\3\2\2\2\u0477"+
		"\u008b\3\2\2\2\u0478\u0479\5\u00d6l\2\u0479\u047a\7\5\2\2\u047a\u047c"+
		"\3\2\2\2\u047b\u0478\3\2\2\2\u047b\u047c\3\2\2\2\u047c\u047d\3\2\2\2\u047d"+
		"\u047e\5\u00d6l\2\u047e\u008d\3\2\2\2\u047f\u0480\5\u00d6l\2\u0480\u0481"+
		"\7\5\2\2\u0481\u0483\3\2\2\2\u0482\u047f\3\2\2\2\u0482\u0483\3\2\2\2\u0483"+
		"\u0484\3\2\2\2\u0484\u0485\5\u00d6l\2\u0485\u008f\3\2\2\2\u0486\u048e"+
		"\5\u0094K\2\u0487\u0489\7\20\2\2\u0488\u0487\3\2\2\2\u0488\u0489\3\2\2"+
		"\2\u0489\u048c\3\2\2\2\u048a\u048d\5\u00d6l\2\u048b\u048d\5z>\2\u048c"+
		"\u048a\3\2\2\2\u048c\u048b\3\2\2\2\u048d\u048f\3\2\2\2\u048e\u0488\3\2"+
		"\2\2\u048e\u048f\3\2\2\2\u048f\u0091\3\2\2\2\u0490\u0495\5\u0090I\2\u0491"+
		"\u0492\7\21\2\2\u0492\u0494\5\u0090I\2\u0493\u0491\3\2\2\2\u0494\u0497"+
		"\3\2\2\2\u0495\u0493\3\2\2\2\u0495\u0496\3\2\2\2\u0496\u0093\3\2\2\2\u0497"+
		"\u0495\3\2\2\2\u0498\u0499\5\u0096L\2\u0499\u0095\3\2\2\2\u049a\u049b"+
		"\bL\1\2\u049b\u049c\7)\2\2\u049c\u04a4\5\u0096L\7\u049d\u049e\7+\2\2\u049e"+
		"\u049f\7\23\2\2\u049f\u04a0\5,\27\2\u04a0\u04a1\7\24\2\2\u04a1\u04a4\3"+
		"\2\2\2\u04a2\u04a4\5\u0098M\2\u04a3\u049a\3\2\2\2\u04a3\u049d\3\2\2\2"+
		"\u04a3\u04a2\3\2\2\2\u04a4\u04ad\3\2\2\2\u04a5\u04a6\f\4\2\2\u04a6\u04a7"+
		"\7\'\2\2\u04a7\u04ac\5\u0096L\5\u04a8\u04a9\f\3\2\2\u04a9\u04aa\7&\2\2"+
		"\u04aa\u04ac\5\u0096L\4\u04ab\u04a5\3\2\2\2\u04ab\u04a8\3\2\2\2\u04ac"+
		"\u04af\3\2\2\2\u04ad\u04ab\3\2\2\2\u04ad\u04ae\3\2\2\2\u04ae\u0097\3\2"+
		"\2\2\u04af\u04ad\3\2\2\2\u04b0\u04b2\5\u009cO\2\u04b1\u04b3\5\u009aN\2"+
		"\u04b2\u04b1\3\2\2\2\u04b2\u04b3\3\2\2\2\u04b3\u0099\3\2\2\2\u04b4\u04b6"+
		"\7)\2\2\u04b5\u04b4\3\2\2\2\u04b5\u04b6\3\2\2\2\u04b6\u04b7\3\2\2\2\u04b7"+
		"\u04b8\7,\2\2\u04b8\u04b9\5\u009cO\2\u04b9\u04ba\7\'\2\2\u04ba\u04bb\5"+
		"\u009cO\2\u04bb\u04de\3\2\2\2\u04bc\u04be\7)\2\2\u04bd\u04bc\3\2\2\2\u04bd"+
		"\u04be\3\2\2\2\u04be\u04bf\3\2\2\2\u04bf\u04c0\7(\2\2\u04c0\u04c1\7\23"+
		"\2\2\u04c1\u04c6\5\u0094K\2\u04c2\u04c3\7\21\2\2\u04c3\u04c5\5\u0094K"+
		"\2\u04c4\u04c2\3\2\2\2\u04c5\u04c8\3\2\2\2\u04c6\u04c4\3\2\2\2\u04c6\u04c7"+
		"\3\2\2\2\u04c7\u04c9\3\2\2\2\u04c8\u04c6\3\2\2\2\u04c9\u04ca\7\24\2\2"+
		"\u04ca\u04de\3\2\2\2\u04cb\u04cd\7)\2\2\u04cc\u04cb\3\2\2\2\u04cc\u04cd"+
		"\3\2\2\2\u04cd\u04ce\3\2\2\2\u04ce\u04cf\7(\2\2\u04cf\u04d0\7\23\2\2\u04d0"+
		"\u04d1\5,\27\2\u04d1\u04d2\7\24\2\2\u04d2\u04de\3\2\2\2\u04d3\u04d5\7"+
		")\2\2\u04d4\u04d3\3\2\2\2\u04d4\u04d5\3\2\2\2\u04d5\u04d6\3\2\2\2\u04d6"+
		"\u04d7\t\n\2\2\u04d7\u04de\5\u009cO\2\u04d8\u04da\7/\2\2\u04d9\u04db\7"+
		")\2\2\u04da\u04d9\3\2\2\2\u04da\u04db\3\2\2\2\u04db\u04dc\3\2\2\2\u04dc"+
		"\u04de\7\60\2\2\u04dd\u04b5\3\2\2\2\u04dd\u04bd\3\2\2\2\u04dd\u04cc\3"+
		"\2\2\2\u04dd\u04d4\3\2\2\2\u04dd\u04d8\3\2\2\2\u04de\u009b\3\2\2\2\u04df"+
		"\u04e0\bO\1\2\u04e0\u04e4\5\u009eP\2\u04e1\u04e2\t\13\2\2\u04e2\u04e4"+
		"\5\u009cO\t\u04e3\u04df\3\2\2\2\u04e3\u04e1\3\2\2\2\u04e4\u04fa\3\2\2"+
		"\2\u04e5\u04e6\f\b\2\2\u04e6\u04e7\t\f\2\2\u04e7\u04f9\5\u009cO\t\u04e8"+
		"\u04e9\f\7\2\2\u04e9\u04ea\t\r\2\2\u04ea\u04f9\5\u009cO\b\u04eb\u04ec"+
		"\f\6\2\2\u04ec\u04ed\7\u009a\2\2\u04ed\u04f9\5\u009cO\7\u04ee\u04ef\f"+
		"\5\2\2\u04ef\u04f0\7\u009c\2\2\u04f0\u04f9\5\u009cO\6\u04f1\u04f2\f\4"+
		"\2\2\u04f2\u04f3\7\u009b\2\2\u04f3\u04f9\5\u009cO\5\u04f4\u04f5\f\3\2"+
		"\2\u04f5\u04f6\5\u00a2R\2\u04f6\u04f7\5\u009cO\4\u04f7\u04f9\3\2\2\2\u04f8"+
		"\u04e5\3\2\2\2\u04f8\u04e8\3\2\2\2\u04f8\u04eb\3\2\2\2\u04f8\u04ee\3\2"+
		"\2\2\u04f8\u04f1\3\2\2\2\u04f8\u04f4\3\2\2\2\u04f9\u04fc\3\2\2\2\u04fa"+
		"\u04f8\3\2\2\2\u04fa\u04fb\3\2\2\2\u04fb\u009d\3\2\2\2\u04fc\u04fa\3\2"+
		"\2\2\u04fd\u04fe\bP\1\2\u04fe\u056c\t\16\2\2\u04ff\u0501\78\2\2\u0500"+
		"\u0502\5\u00c6d\2\u0501\u0500\3\2\2\2\u0502\u0503\3\2\2\2\u0503\u0501"+
		"\3\2\2\2\u0503\u0504\3\2\2\2\u0504\u0507\3\2\2\2\u0505\u0506\7;\2\2\u0506"+
		"\u0508\5\u0094K\2\u0507\u0505\3\2\2\2\u0507\u0508\3\2\2\2\u0508\u0509"+
		"\3\2\2\2\u0509\u050a\7<\2\2\u050a\u056c\3\2\2\2\u050b\u050c\78\2\2\u050c"+
		"\u050e\5\u0094K\2\u050d\u050f\5\u00c6d\2\u050e\u050d\3\2\2\2\u050f\u0510"+
		"\3\2\2\2\u0510\u050e\3\2\2\2\u0510\u0511\3\2\2\2\u0511\u0514\3\2\2\2\u0512"+
		"\u0513\7;\2\2\u0513\u0515\5\u0094K\2\u0514\u0512\3\2\2\2\u0514\u0515\3"+
		"\2\2\2\u0515\u0516\3\2\2\2\u0516\u0517\7<\2\2\u0517\u056c\3\2\2\2\u0518"+
		"\u0519\7e\2\2\u0519\u051a\7\23\2\2\u051a\u051b\5\u0094K\2\u051b\u051c"+
		"\7\20\2\2\u051c\u051d\5\u00b2Z\2\u051d\u051e\7\24\2\2\u051e\u056c\3\2"+
		"\2\2\u051f\u0520\7z\2\2\u0520\u0529\7\23\2\2\u0521\u0526\5\u0090I\2\u0522"+
		"\u0523\7\21\2\2\u0523\u0525\5\u0090I\2\u0524\u0522\3\2\2\2\u0525\u0528"+
		"\3\2\2\2\u0526\u0524\3\2\2\2\u0526\u0527\3\2\2\2\u0527\u052a\3\2\2\2\u0528"+
		"\u0526\3\2\2\2\u0529\u0521\3\2\2\2\u0529\u052a\3\2\2\2\u052a\u052b\3\2"+
		"\2\2\u052b\u056c\7\24\2\2\u052c\u052d\7Q\2\2\u052d\u052e\7\23\2\2\u052e"+
		"\u0531\5\u0094K\2\u052f\u0530\7\u0089\2\2\u0530\u0532\7\63\2\2\u0531\u052f"+
		"\3\2\2\2\u0531\u0532\3\2\2\2\u0532\u0533\3\2\2\2\u0533\u0534\7\24\2\2"+
		"\u0534\u056c\3\2\2\2\u0535\u0536\7S\2\2\u0536\u0537\7\23\2\2\u0537\u053a"+
		"\5\u0094K\2\u0538\u0539\7\u0089\2\2\u0539\u053b\7\63\2\2\u053a\u0538\3"+
		"\2\2\2\u053a\u053b\3\2\2\2\u053b\u053c\3\2\2\2\u053c\u053d\7\24\2\2\u053d"+
		"\u056c\3\2\2\2\u053e\u056c\5\u00a0Q\2\u053f\u056c\7\u0095\2\2\u0540\u0541"+
		"\5\u00d2j\2\u0541\u0542\7\5\2\2\u0542\u0543\7\u0095\2\2\u0543\u056c\3"+
		"\2\2\2\u0544\u0545\7\23\2\2\u0545\u0548\5\u0090I\2\u0546\u0547\7\21\2"+
		"\2\u0547\u0549\5\u0090I\2\u0548\u0546\3\2\2\2\u0549\u054a\3\2\2\2\u054a"+
		"\u0548\3\2\2\2\u054a\u054b\3\2\2\2\u054b\u054c\3\2\2\2\u054c\u054d\7\24"+
		"\2\2\u054d\u056c\3\2\2\2\u054e\u054f\7\23\2\2\u054f\u0550\5,\27\2\u0550"+
		"\u0551\7\24\2\2\u0551\u056c\3\2\2\2\u0552\u0553\5\u00d2j\2\u0553\u055f"+
		"\7\23\2\2\u0554\u0556\5n8\2\u0555\u0554\3\2\2\2\u0555\u0556\3\2\2\2\u0556"+
		"\u0557\3\2\2\2\u0557\u055c\5\u0094K\2\u0558\u0559\7\21\2\2\u0559\u055b"+
		"\5\u0094K\2\u055a\u0558\3\2\2\2\u055b\u055e\3\2\2\2\u055c\u055a\3\2\2"+
		"\2\u055c\u055d\3\2\2\2\u055d\u0560\3\2\2\2\u055e\u055c\3\2\2\2\u055f\u0555"+
		"\3\2\2\2\u055f\u0560\3\2\2\2\u0560\u0561\3\2\2\2\u0561\u0564\7\24\2\2"+
		"\u0562\u0563\7I\2\2\u0563\u0565\5\u00ccg\2\u0564\u0562\3\2\2\2\u0564\u0565"+
		"\3\2\2\2\u0565\u056c\3\2\2\2\u0566\u056c\5\u00d6l\2\u0567\u0568\7\23\2"+
		"\2\u0568\u0569\5\u0094K\2\u0569\u056a\7\24\2\2\u056a\u056c\3\2\2\2\u056b"+
		"\u04fd\3\2\2\2\u056b\u04ff\3\2\2\2\u056b\u050b\3\2\2\2\u056b\u0518\3\2"+
		"\2\2\u056b\u051f\3\2\2\2\u056b\u052c\3\2\2\2\u056b\u0535\3\2\2\2\u056b"+
		"\u053e\3\2\2\2\u056b\u053f\3\2\2\2\u056b\u0540\3\2\2\2\u056b\u0544\3\2"+
		"\2\2\u056b\u054e\3\2\2\2\u056b\u0552\3\2\2\2\u056b\u0566\3\2\2\2\u056b"+
		"\u0567\3\2\2\2\u056c\u0577\3\2\2\2\u056d\u056e\f\6\2\2\u056e\u056f\7\b"+
		"\2\2\u056f\u0570\5\u009cO\2\u0570\u0571\7\t\2\2\u0571\u0576\3\2\2\2\u0572"+
		"\u0573\f\4\2\2\u0573\u0574\7\5\2\2\u0574\u0576\5\u00d6l\2\u0575\u056d"+
		"\3\2\2\2\u0575\u0572\3\2\2\2\u0576\u0579\3\2\2\2\u0577\u0575\3\2\2\2\u0577"+
		"\u0578\3\2\2\2\u0578\u009f\3\2\2\2\u0579\u0577\3\2\2\2\u057a\u0587\7\60"+
		"\2\2\u057b\u0587\5\u00aaV\2\u057c\u057d\5\u00d6l\2\u057d\u057e\7\u00fa"+
		"\2\2\u057e\u0587\3\2\2\2\u057f\u0587\5\u00dco\2\u0580\u0587\5\u00a8U\2"+
		"\u0581\u0583\7\u00fa\2\2\u0582\u0581\3\2\2\2\u0583\u0584\3\2\2\2\u0584"+
		"\u0582\3\2\2\2\u0584\u0585\3\2\2\2\u0585\u0587\3\2\2\2\u0586\u057a\3\2"+
		"\2\2\u0586\u057b\3\2\2\2\u0586\u057c\3\2\2\2\u0586\u057f\3\2\2\2\u0586"+
		"\u0580\3\2\2\2\u0586\u0582\3\2\2\2\u0587\u00a1\3\2\2\2\u0588\u0589\t\17"+
		"\2\2\u0589\u00a3\3\2\2\2\u058a\u058b\t\20\2\2\u058b\u00a5\3\2\2\2\u058c"+
		"\u058d\t\21\2\2\u058d\u00a7\3\2\2\2\u058e\u058f\t\22\2\2\u058f\u00a9\3"+
		"\2\2\2\u0590\u0594\7\67\2\2\u0591\u0593\5\u00acW\2\u0592\u0591\3\2\2\2"+
		"\u0593\u0596\3\2\2\2\u0594\u0592\3\2\2\2\u0594\u0595\3\2\2\2\u0595\u00ab"+
		"\3\2\2\2\u0596\u0594\3\2\2\2\u0597\u0598\5\u00aeX\2\u0598\u059b\5\u00d6"+
		"l\2\u0599\u059a\7r\2\2\u059a\u059c\5\u00d6l\2\u059b\u0599\3\2\2\2\u059b"+
		"\u059c\3\2\2\2\u059c\u00ad\3\2\2\2\u059d\u059f\t\r\2\2\u059e\u059d\3\2"+
		"\2\2\u059e\u059f\3\2\2\2\u059f\u05a0\3\2\2\2\u05a0\u05a3\t\t\2\2\u05a1"+
		"\u05a3\7\u00fa\2\2\u05a2\u059e\3\2\2\2\u05a2\u05a1\3\2\2\2\u05a3\u00af"+
		"\3\2\2\2\u05a4\u05a8\7Q\2\2\u05a5\u05a6\7R\2\2\u05a6\u05a8\5\u00d6l\2"+
		"\u05a7\u05a4\3\2\2\2\u05a7\u05a5\3\2\2\2\u05a8\u00b1\3\2\2\2\u05a9\u05aa"+
		"\7w\2\2\u05aa\u05ab\7\u008f\2\2\u05ab\u05ac\5\u00b2Z\2\u05ac\u05ad\7\u0091"+
		"\2\2\u05ad\u05cc\3\2\2\2\u05ae\u05af\7x\2\2\u05af\u05b0\7\u008f\2\2\u05b0"+
		"\u05b1\5\u00b2Z\2\u05b1\u05b2\7\21\2\2\u05b2\u05b3\5\u00b2Z\2\u05b3\u05b4"+
		"\7\u0091\2\2\u05b4\u05cc\3\2\2\2\u05b5\u05bc\7z\2\2\u05b6\u05b8\7\u008f"+
		"\2\2\u05b7\u05b9\5\u00c2b\2\u05b8\u05b7\3\2\2\2\u05b8\u05b9\3\2\2\2\u05b9"+
		"\u05ba\3\2\2\2\u05ba\u05bd\7\u0091\2\2\u05bb\u05bd\7\u008d\2\2\u05bc\u05b6"+
		"\3\2\2\2\u05bc\u05bb\3\2\2\2\u05bd\u05cc\3\2\2\2\u05be\u05c9\5\u00d6l"+
		"\2\u05bf\u05c0\7\23\2\2\u05c0\u05c5\7\u00ff\2\2\u05c1\u05c2\7\21\2\2\u05c2"+
		"\u05c4\7\u00ff\2\2\u05c3\u05c1\3\2\2\2\u05c4\u05c7\3\2\2\2\u05c5\u05c3"+
		"\3\2\2\2\u05c5\u05c6\3\2\2\2\u05c6\u05c8\3\2\2\2\u05c7\u05c5\3\2\2\2\u05c8"+
		"\u05ca\7\24\2\2\u05c9\u05bf\3\2\2\2\u05c9\u05ca\3\2\2\2\u05ca\u05cc\3"+
		"\2\2\2\u05cb\u05a9\3\2\2\2\u05cb\u05ae\3\2\2\2\u05cb\u05b5\3\2\2\2\u05cb"+
		"\u05be\3\2\2\2\u05cc\u00b3\3\2\2\2\u05cd\u05d2\5\u00b6\\\2\u05ce\u05cf"+
		"\7\21\2\2\u05cf\u05d1\5\u00b6\\\2\u05d0\u05ce\3\2\2\2\u05d1\u05d4\3\2"+
		"\2\2\u05d2\u05d0\3\2\2\2\u05d2\u05d3\3\2\2\2\u05d3\u00b5\3\2\2\2\u05d4"+
		"\u05d2\3\2\2\2\u05d5\u05d7\5\u00d6l\2\u05d6\u05d8\5\u00b8]\2\u05d7\u05d6"+
		"\3\2\2\2\u05d7\u05d8\3\2\2\2\u05d8\u05d9\3\2\2\2\u05d9\u05dc\5\u00b2Z"+
		"\2\u05da\u05db\7\177\2\2\u05db\u05dd\7\u00fa\2\2\u05dc\u05da\3\2\2\2\u05dc"+
		"\u05dd\3\2\2\2\u05dd\u05e5\3\2\2\2\u05de\u05df\5\u00d6l\2\u05df\u05e0"+
		"\7\n\2\2\u05e0\u05e1\7\23\2\2\u05e1\u05e2\5\u00d4k\2\u05e2\u05e3\7\24"+
		"\2\2\u05e3\u05e5\3\2\2\2\u05e4\u05d5\3\2\2\2\u05e4\u05de\3\2\2\2\u05e5"+
		"\u00b7\3\2\2\2\u05e6\u05e7\7\u00fa\2\2\u05e7\u00b9\3\2\2\2\u05e8\u05e9"+
		"\7\u00ff\2\2\u05e9\u00bb\3\2\2\2\u05ea\u05ef\5\u00be`\2\u05eb\u05ec\7"+
		"\21\2\2\u05ec\u05ee\5\u00be`\2\u05ed\u05eb\3\2\2\2\u05ee\u05f1\3\2\2\2"+
		"\u05ef\u05ed\3\2\2\2\u05ef\u05f0\3\2\2\2\u05f0\u00bd\3\2\2\2\u05f1\u05ef"+
		"\3\2\2\2\u05f2\u05f3\5\u00d6l\2\u05f3\u05f4\7\13\2\2\u05f4\u05f5\5\u00c0"+
		"a\2\u05f5\u00bf\3\2\2\2\u05f6\u05fb\5\u00d6l\2\u05f7\u05f8\7\21\2\2\u05f8"+
		"\u05fa\5\u00d6l\2\u05f9\u05f7\3\2\2\2\u05fa\u05fd\3\2\2\2\u05fb\u05f9"+
		"\3\2\2\2\u05fb\u05fc\3\2\2\2\u05fc\u00c1\3\2\2\2\u05fd\u05fb\3\2\2\2\u05fe"+
		"\u0603\5\u00c4c\2\u05ff\u0600\7\21\2\2\u0600\u0602\5\u00c4c\2\u0601\u05ff"+
		"\3\2\2\2\u0602\u0605\3\2\2\2\u0603\u0601\3\2\2\2\u0603\u0604\3\2\2\2\u0604"+
		"\u00c3\3\2\2\2\u0605\u0603\3\2\2\2\u0606\u0607\5\u00d6l\2\u0607\u0608"+
		"\7\f\2\2\u0608\u060b\5\u00b2Z\2\u0609\u060a\7\177\2\2\u060a\u060c\7\u00fa"+
		"\2\2\u060b\u0609\3\2\2\2\u060b\u060c\3\2\2\2\u060c\u00c5\3\2\2\2\u060d"+
		"\u060e\79\2\2\u060e\u060f\5\u0094K\2\u060f\u0610\7:\2\2\u0610\u0611\5"+
		"\u0094K\2\u0611\u00c7\3\2\2\2\u0612\u0613\7H\2\2\u0613\u0618\5\u00caf"+
		"\2\u0614\u0615\7\21\2\2\u0615\u0617\5\u00caf\2\u0616\u0614\3\2\2\2\u0617"+
		"\u061a\3\2\2\2\u0618\u0616\3\2\2\2\u0618\u0619\3\2\2\2\u0619\u00c9\3\2"+
		"\2\2\u061a\u0618\3\2\2\2\u061b\u061c\5\u00d6l\2\u061c\u061d\7\20\2\2\u061d"+
		"\u061e\5\u00ccg\2\u061e\u00cb\3\2\2\2\u061f\u064a\5\u00d6l\2\u0620\u0643"+
		"\7\23\2\2\u0621\u0622\7\u00a2\2\2\u0622\u0623\7\35\2\2\u0623\u0628\5\u0094"+
		"K\2\u0624\u0625\7\21\2\2\u0625\u0627\5\u0094K\2\u0626\u0624\3\2\2\2\u0627"+
		"\u062a\3\2\2\2\u0628\u0626\3\2\2\2\u0628\u0629\3\2\2\2\u0629\u0644\3\2"+
		"\2\2\u062a\u0628\3\2\2\2\u062b\u062c\t\23\2\2\u062c\u062d\7\35\2\2\u062d"+
		"\u0632\5\u0094K\2\u062e\u062f\7\21\2\2\u062f\u0631\5\u0094K\2\u0630\u062e"+
		"\3\2\2\2\u0631\u0634\3\2\2\2\u0632\u0630\3\2\2\2\u0632\u0633\3\2\2\2\u0633"+
		"\u0636\3\2\2\2\u0634\u0632\3\2\2\2\u0635\u062b\3\2\2\2\u0635\u0636\3\2"+
		"\2\2\u0636\u0641\3\2\2\2\u0637\u0638\t\24\2\2\u0638\u0639\7\35\2\2\u0639"+
		"\u063e\5^\60\2\u063a\u063b\7\21\2\2\u063b\u063d\5^\60\2\u063c\u063a\3"+
		"\2\2\2\u063d\u0640\3\2\2\2\u063e\u063c\3\2\2\2\u063e\u063f\3\2\2\2\u063f"+
		"\u0642\3\2\2\2\u0640\u063e\3\2\2\2\u0641\u0637\3\2\2\2\u0641\u0642\3\2"+
		"\2\2\u0642\u0644\3\2\2\2\u0643\u0621\3\2\2\2\u0643\u0635\3\2\2\2\u0644"+
		"\u0646\3\2\2\2\u0645\u0647\5\u00ceh\2\u0646\u0645\3\2\2\2\u0646\u0647"+
		"\3\2\2\2\u0647\u0648\3\2\2\2\u0648\u064a\7\24\2\2\u0649\u061f\3\2\2\2"+
		"\u0649\u0620\3\2\2\2\u064a\u00cd\3\2\2\2\u064b\u064c\7K\2\2\u064c\u065c"+
		"\5\u00d0i\2\u064d\u064e\7L\2\2\u064e\u065c\5\u00d0i\2\u064f\u0650\7K\2"+
		"\2\u0650\u0651\7,\2\2\u0651\u0652\5\u00d0i\2\u0652\u0653\7\'\2\2\u0653"+
		"\u0654\5\u00d0i\2\u0654\u065c\3\2\2\2\u0655\u0656\7L\2\2\u0656\u0657\7"+
		",\2\2\u0657\u0658\5\u00d0i\2\u0658\u0659\7\'\2\2\u0659\u065a\5\u00d0i"+
		"\2\u065a\u065c\3\2\2\2\u065b\u064b\3\2\2\2\u065b\u064d\3\2\2\2\u065b\u064f"+
		"\3\2\2\2\u065b\u0655\3\2\2\2\u065c\u00cf\3\2\2\2\u065d\u065e\7M\2\2\u065e"+
		"\u0665\t\25\2\2\u065f\u0660\7P\2\2\u0660\u0665\7T\2\2\u0661\u0662\5\u0094"+
		"K\2\u0662\u0663\t\25\2\2\u0663\u0665\3\2\2\2\u0664\u065d\3\2\2\2\u0664"+
		"\u065f\3\2\2\2\u0664\u0661\3\2\2\2\u0665\u00d1\3\2\2\2\u0666\u066b\5\u00d6"+
		"l\2\u0667\u0668\7\5\2\2\u0668\u066a\5\u00d6l\2\u0669\u0667\3\2\2\2\u066a"+
		"\u066d\3\2\2\2\u066b\u0669\3\2\2\2\u066b\u066c\3\2\2\2\u066c\u00d3\3\2"+
		"\2\2\u066d\u066b\3\2\2\2\u066e\u066f\7\u0103\2\2\u066f\u00d5\3\2\2\2\u0670"+
		"\u0681\5\u00d8m\2\u0671\u0681\5\26\f\2\u0672\u0681\7\u00f5\2\2\u0673\u0681"+
		"\7D\2\2\u0674\u0681\7@\2\2\u0675\u0681\7A\2\2\u0676\u0681\7B\2\2\u0677"+
		"\u0681\7C\2\2\u0678\u0681\7E\2\2\u0679\u0681\7=\2\2\u067a\u0681\7>\2\2"+
		"\u067b\u0681\7F\2\2\u067c\u0681\7n\2\2\u067d\u0681\7q\2\2\u067e\u0681"+
		"\7o\2\2\u067f\u0681\7p\2\2\u0680\u0670\3\2\2\2\u0680\u0671\3\2\2\2\u0680"+
		"\u0672\3\2\2\2\u0680\u0673\3\2\2\2\u0680\u0674\3\2\2\2\u0680\u0675\3\2"+
		"\2\2\u0680\u0676\3\2\2\2\u0680\u0677\3\2\2\2\u0680\u0678\3\2\2\2\u0680"+
		"\u0679\3\2\2\2\u0680\u067a\3\2\2\2\u0680\u067b\3\2\2\2\u0680\u067c\3\2"+
		"\2\2\u0680\u067d\3\2\2\2\u0680\u067e\3\2\2\2\u0680\u067f\3\2\2\2\u0681"+
		"\u00d7\3\2\2\2\u0682\u0686\7\u0103\2\2\u0683\u0686\5\u00dan\2\u0684\u0686"+
		"\5\u00dep\2\u0685\u0682\3\2\2\2\u0685\u0683\3\2\2\2\u0685\u0684\3\2\2"+
		"\2\u0686\u00d9\3\2\2\2\u0687\u0688\7\u0104\2\2\u0688\u00db\3\2\2\2\u0689"+
		"\u068b\7\u0094\2\2\u068a\u0689\3\2\2\2\u068a\u068b\3\2\2\2\u068b\u068c"+
		"\3\2\2\2\u068c\u06a6\7\u0100\2\2\u068d\u068f\7\u0094\2\2\u068e\u068d\3"+
		"\2\2\2\u068e\u068f\3\2\2\2\u068f\u0690\3\2\2\2\u0690\u06a6\7\u00ff\2\2"+
		"\u0691\u0693\7\u0094\2\2\u0692\u0691\3\2\2\2\u0692\u0693\3\2\2\2\u0693"+
		"\u0694\3\2\2\2\u0694\u06a6\7\u00fb\2\2\u0695\u0697\7\u0094\2\2\u0696\u0695"+
		"\3\2\2\2\u0696\u0697\3\2\2\2\u0697\u0698\3\2\2\2\u0698\u06a6\7\u00fc\2"+
		"\2\u0699\u069b\7\u0094\2\2\u069a\u0699\3\2\2\2\u069a\u069b\3\2\2\2\u069b"+
		"\u069c\3\2\2\2\u069c\u06a6\7\u00fd\2\2\u069d\u069f\7\u0094\2\2\u069e\u069d"+
		"\3\2\2\2\u069e\u069f\3\2\2\2\u069f\u06a0\3\2\2\2\u06a0\u06a6\7\u0101\2"+
		"\2\u06a1\u06a3\7\u0094\2\2\u06a2\u06a1\3\2\2\2\u06a2\u06a3\3\2\2\2\u06a3"+
		"\u06a4\3\2\2\2\u06a4\u06a6\7\u0102\2\2\u06a5\u068a\3\2\2\2\u06a5\u068e"+
		"\3\2\2\2\u06a5\u0692\3\2\2\2\u06a5\u0696\3\2\2\2\u06a5\u069a\3\2\2\2\u06a5"+
		"\u069e\3\2\2\2\u06a5\u06a2\3\2\2\2\u06a6\u00dd\3\2\2\2\u06a7\u06a8\t\26"+
		"\2\2\u06a8\u00df\3\2\2\2\u00de\u00e3\u0102\u010e\u0126\u013d\u0147\u0149"+
		"\u0158\u0162\u016b\u016e\u0174\u017e\u018a\u018f\u0195\u01a1\u01a3\u01a8"+
		"\u01ab\u01ad\u01b1\u01ba\u01c2\u01c9\u01cf\u01d3\u01dc\u01e1\u01f0\u01f7"+
		"\u01fa\u0201\u0205\u020b\u0213\u021e\u0229\u0230\u0236\u023c\u0245\u0247"+
		"\u0250\u0253\u025c\u025f\u0268\u026b\u0274\u0277\u027a\u027e\u0281\u028c"+
		"\u0291\u029c\u02a0\u02a4\u02b0\u02b3\u02b7\u02c1\u02c5\u02c7\u02ca\u02ce"+
		"\u02d1\u02d5\u02db\u02df\u02e3\u02e8\u02eb\u02ed\u02f2\u02f7\u02fa\u02fe"+
		"\u0301\u0303\u0308\u030d\u031a\u031f\u0327\u032d\u0337\u0346\u034b\u0353"+
		"\u0356\u035a\u035f\u0368\u036b\u0370\u0377\u037a\u0382\u0389\u0390\u0393"+
		"\u0398\u039e\u03a2\u03a5\u03a8\u03b3\u03b8\u03cd\u03cf\u03d1\u03de\u03e7"+
		"\u03ee\u03f6\u03fe\u0402\u0405\u0408\u040e\u0411\u0414\u041a\u041d\u0420"+
		"\u042a\u042d\u0431\u0439\u043d\u0441\u0443\u044c\u0458\u045a\u0461\u0468"+
		"\u046e\u0474\u0476\u047b\u0482\u0488\u048c\u048e\u0495\u04a3\u04ab\u04ad"+
		"\u04b2\u04b5\u04bd\u04c6\u04cc\u04d4\u04da\u04dd\u04e3\u04f8\u04fa\u0503"+
		"\u0507\u0510\u0514\u0526\u0529\u0531\u053a\u054a\u0555\u055c\u055f\u0564"+
		"\u056b\u0575\u0577\u0584\u0586\u0594\u059b\u059e\u05a2\u05a7\u05b8\u05bc"+
		"\u05c5\u05c9\u05cb\u05d2\u05d7\u05dc\u05e4\u05ef\u05fb\u0603\u060b\u0618"+
		"\u0628\u0632\u0635\u063e\u0641\u0643\u0646\u0649\u065b\u0664\u066b\u0680"+
		"\u0685\u068a\u068e\u0692\u0696\u069a\u069e\u06a2\u06a5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}