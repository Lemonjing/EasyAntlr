// Generated from /Users/insomnia/GitHub/EasyAntlr/src/main/resources/SqlBase.g4 by ANTLR 4.7

package com.rann.basic;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SqlBaseParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SqlBaseVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#singleStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleStatement(SqlBaseParser.SingleStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleExpression(SqlBaseParser.SingleExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#singleTableIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleTableIdentifier(SqlBaseParser.SingleTableIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#singleFunctionIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleFunctionIdentifier(SqlBaseParser.SingleFunctionIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#singleDataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleDataType(SqlBaseParser.SingleDataTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementDefault}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementDefault(SqlBaseParser.StatementDefaultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code createSourceStream}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateSourceStream(SqlBaseParser.CreateSourceStreamContext ctx);
	/**
	 * Visit a parse tree produced by the {@code createSinkStream}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateSinkStream(SqlBaseParser.CreateSinkStreamContext ctx);
	/**
	 * Visit a parse tree produced by the {@code createTmpStream}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTmpStream(SqlBaseParser.CreateTmpStreamContext ctx);
	/**
	 * Visit a parse tree produced by the {@code createInsertInto}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateInsertInto(SqlBaseParser.CreateInsertIntoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setTimeModel}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetTimeModel(SqlBaseParser.SetTimeModelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setWaterMark}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetWaterMark(SqlBaseParser.SetWaterMarkContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#types}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypes(SqlBaseParser.TypesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#sqlText}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqlText(SqlBaseParser.SqlTextContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#comma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComma(SqlBaseParser.CommaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#singleQuote}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleQuote(SqlBaseParser.SingleQuoteContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#integerValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerValue(SqlBaseParser.IntegerValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#brackets}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBrackets(SqlBaseParser.BracketsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#topics}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTopics(SqlBaseParser.TopicsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#waterMarkTime}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWaterMarkTime(SqlBaseParser.WaterMarkTimeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#brokers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBrokers(SqlBaseParser.BrokersContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#encode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEncode(SqlBaseParser.EncodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#parallelism}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParallelism(SqlBaseParser.ParallelismContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#createTableHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTableHeader(SqlBaseParser.CreateTableHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#bucketSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBucketSpec(SqlBaseParser.BucketSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#skewSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSkewSpec(SqlBaseParser.SkewSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#locationSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocationSpec(SqlBaseParser.LocationSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery(SqlBaseParser.QueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#insertInto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertInto(SqlBaseParser.InsertIntoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#partitionSpecLocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionSpecLocation(SqlBaseParser.PartitionSpecLocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#partitionSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionSpec(SqlBaseParser.PartitionSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#partitionVal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionVal(SqlBaseParser.PartitionValContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#describeFuncName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribeFuncName(SqlBaseParser.DescribeFuncNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#describeColName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribeColName(SqlBaseParser.DescribeColNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#ctes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCtes(SqlBaseParser.CtesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#namedQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedQuery(SqlBaseParser.NamedQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#tableProvider}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableProvider(SqlBaseParser.TableProviderContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#tablePropertyList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTablePropertyList(SqlBaseParser.TablePropertyListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#tableProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableProperty(SqlBaseParser.TablePropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#tablePropertyKey}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTablePropertyKey(SqlBaseParser.TablePropertyKeyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#tablePropertyValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTablePropertyValue(SqlBaseParser.TablePropertyValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#constantList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantList(SqlBaseParser.ConstantListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#nestedConstantList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNestedConstantList(SqlBaseParser.NestedConstantListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#createFileFormat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateFileFormat(SqlBaseParser.CreateFileFormatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableFileFormat}
	 * labeled alternative in {@link SqlBaseParser#fileFormat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableFileFormat(SqlBaseParser.TableFileFormatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code genericFileFormat}
	 * labeled alternative in {@link SqlBaseParser#fileFormat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericFileFormat(SqlBaseParser.GenericFileFormatContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#storageHandler}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStorageHandler(SqlBaseParser.StorageHandlerContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#resource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResource(SqlBaseParser.ResourceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singleInsertQuery}
	 * labeled alternative in {@link SqlBaseParser#queryNoWith}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleInsertQuery(SqlBaseParser.SingleInsertQueryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiInsertQuery}
	 * labeled alternative in {@link SqlBaseParser#queryNoWith}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiInsertQuery(SqlBaseParser.MultiInsertQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#queryOrganization}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryOrganization(SqlBaseParser.QueryOrganizationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#multiInsertQueryBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiInsertQueryBody(SqlBaseParser.MultiInsertQueryBodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code queryTermDefault}
	 * labeled alternative in {@link SqlBaseParser#queryTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryTermDefault(SqlBaseParser.QueryTermDefaultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setOperation}
	 * labeled alternative in {@link SqlBaseParser#queryTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetOperation(SqlBaseParser.SetOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code queryPrimaryDefault}
	 * labeled alternative in {@link SqlBaseParser#queryPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryPrimaryDefault(SqlBaseParser.QueryPrimaryDefaultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code table}
	 * labeled alternative in {@link SqlBaseParser#queryPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable(SqlBaseParser.TableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code inlineTableDefault1}
	 * labeled alternative in {@link SqlBaseParser#queryPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInlineTableDefault1(SqlBaseParser.InlineTableDefault1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code subquery}
	 * labeled alternative in {@link SqlBaseParser#queryPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubquery(SqlBaseParser.SubqueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#sortItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSortItem(SqlBaseParser.SortItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#querySpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuerySpecification(SqlBaseParser.QuerySpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#hint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHint(SqlBaseParser.HintContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#hintStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHintStatement(SqlBaseParser.HintStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#fromClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromClause(SqlBaseParser.FromClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#aggregation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregation(SqlBaseParser.AggregationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#groupingSet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupingSet(SqlBaseParser.GroupingSetContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#lateralView}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLateralView(SqlBaseParser.LateralViewContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#setQuantifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetQuantifier(SqlBaseParser.SetQuantifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#relation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelation(SqlBaseParser.RelationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#joinRelation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinRelation(SqlBaseParser.JoinRelationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#joinType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinType(SqlBaseParser.JoinTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#joinCriteria}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinCriteria(SqlBaseParser.JoinCriteriaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#sample}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSample(SqlBaseParser.SampleContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#identifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierList(SqlBaseParser.IdentifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#identifierSeq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierSeq(SqlBaseParser.IdentifierSeqContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#orderedIdentifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderedIdentifierList(SqlBaseParser.OrderedIdentifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#orderedIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderedIdentifier(SqlBaseParser.OrderedIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#identifierCommentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierCommentList(SqlBaseParser.IdentifierCommentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#identifierComment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierComment(SqlBaseParser.IdentifierCommentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableName}
	 * labeled alternative in {@link SqlBaseParser#relationPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableName(SqlBaseParser.TableNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code aliasedQuery}
	 * labeled alternative in {@link SqlBaseParser#relationPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAliasedQuery(SqlBaseParser.AliasedQueryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code aliasedRelation}
	 * labeled alternative in {@link SqlBaseParser#relationPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAliasedRelation(SqlBaseParser.AliasedRelationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code inlineTableDefault2}
	 * labeled alternative in {@link SqlBaseParser#relationPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInlineTableDefault2(SqlBaseParser.InlineTableDefault2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code tableValuedFunction}
	 * labeled alternative in {@link SqlBaseParser#relationPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableValuedFunction(SqlBaseParser.TableValuedFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#inlineTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInlineTable(SqlBaseParser.InlineTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rowFormatSerde}
	 * labeled alternative in {@link SqlBaseParser#rowFormat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowFormatSerde(SqlBaseParser.RowFormatSerdeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rowFormatDelimited}
	 * labeled alternative in {@link SqlBaseParser#rowFormat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowFormatDelimited(SqlBaseParser.RowFormatDelimitedContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#tableIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableIdentifier(SqlBaseParser.TableIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#functionIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionIdentifier(SqlBaseParser.FunctionIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#namedExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedExpression(SqlBaseParser.NamedExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#namedExpressionSeq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedExpressionSeq(SqlBaseParser.NamedExpressionSeqContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(SqlBaseParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicalNot}
	 * labeled alternative in {@link SqlBaseParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalNot(SqlBaseParser.LogicalNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanDefault}
	 * labeled alternative in {@link SqlBaseParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanDefault(SqlBaseParser.BooleanDefaultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exists}
	 * labeled alternative in {@link SqlBaseParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExists(SqlBaseParser.ExistsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicalBinary}
	 * labeled alternative in {@link SqlBaseParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalBinary(SqlBaseParser.LogicalBinaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#predicated}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicated(SqlBaseParser.PredicatedContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicate(SqlBaseParser.PredicateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valueExpressionDefault}
	 * labeled alternative in {@link SqlBaseParser#valueExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueExpressionDefault(SqlBaseParser.ValueExpressionDefaultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code comparison}
	 * labeled alternative in {@link SqlBaseParser#valueExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(SqlBaseParser.ComparisonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arithmeticBinary}
	 * labeled alternative in {@link SqlBaseParser#valueExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticBinary(SqlBaseParser.ArithmeticBinaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arithmeticUnary}
	 * labeled alternative in {@link SqlBaseParser#valueExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticUnary(SqlBaseParser.ArithmeticUnaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code struct}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct(SqlBaseParser.StructContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dereference}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDereference(SqlBaseParser.DereferenceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simpleCase}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleCase(SqlBaseParser.SimpleCaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code columnReference}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnReference(SqlBaseParser.ColumnReferenceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rowConstructor}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowConstructor(SqlBaseParser.RowConstructorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code last}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLast(SqlBaseParser.LastContext ctx);
	/**
	 * Visit a parse tree produced by the {@code star}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStar(SqlBaseParser.StarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subscript}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubscript(SqlBaseParser.SubscriptContext ctx);
	/**
	 * Visit a parse tree produced by the {@code timeFunctionCall}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimeFunctionCall(SqlBaseParser.TimeFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subqueryExpression}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubqueryExpression(SqlBaseParser.SubqueryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cast}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCast(SqlBaseParser.CastContext ctx);
	/**
	 * Visit a parse tree produced by the {@code constantDefault}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantDefault(SqlBaseParser.ConstantDefaultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenthesizedExpression}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesizedExpression(SqlBaseParser.ParenthesizedExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(SqlBaseParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code searchedCase}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearchedCase(SqlBaseParser.SearchedCaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code first}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFirst(SqlBaseParser.FirstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nullLiteral}
	 * labeled alternative in {@link SqlBaseParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullLiteral(SqlBaseParser.NullLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intervalLiteral}
	 * labeled alternative in {@link SqlBaseParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntervalLiteral(SqlBaseParser.IntervalLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeConstructor}
	 * labeled alternative in {@link SqlBaseParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeConstructor(SqlBaseParser.TypeConstructorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numericLiteral}
	 * labeled alternative in {@link SqlBaseParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericLiteral(SqlBaseParser.NumericLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanLiteral}
	 * labeled alternative in {@link SqlBaseParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanLiteral(SqlBaseParser.BooleanLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringLiteral}
	 * labeled alternative in {@link SqlBaseParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(SqlBaseParser.StringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#comparisonOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonOperator(SqlBaseParser.ComparisonOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#arithmeticOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticOperator(SqlBaseParser.ArithmeticOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#predicateOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicateOperator(SqlBaseParser.PredicateOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#booleanValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanValue(SqlBaseParser.BooleanValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#interval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterval(SqlBaseParser.IntervalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#intervalField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntervalField(SqlBaseParser.IntervalFieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#intervalValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntervalValue(SqlBaseParser.IntervalValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#colPosition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColPosition(SqlBaseParser.ColPositionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code complexDataType}
	 * labeled alternative in {@link SqlBaseParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplexDataType(SqlBaseParser.ComplexDataTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primitiveDataType}
	 * labeled alternative in {@link SqlBaseParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveDataType(SqlBaseParser.PrimitiveDataTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#colTypeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColTypeList(SqlBaseParser.ColTypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#colType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColType(SqlBaseParser.ColTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#identifierPath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierPath(SqlBaseParser.IdentifierPathContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#offset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOffset(SqlBaseParser.OffsetContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#properiteyList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperiteyList(SqlBaseParser.ProperiteyListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#properitey}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperitey(SqlBaseParser.ProperiteyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#identifierValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierValue(SqlBaseParser.IdentifierValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#complexColTypeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplexColTypeList(SqlBaseParser.ComplexColTypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#complexColType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplexColType(SqlBaseParser.ComplexColTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#whenClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhenClause(SqlBaseParser.WhenClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#windows}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindows(SqlBaseParser.WindowsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#namedWindow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedWindow(SqlBaseParser.NamedWindowContext ctx);
	/**
	 * Visit a parse tree produced by the {@code windowRef}
	 * labeled alternative in {@link SqlBaseParser#windowSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowRef(SqlBaseParser.WindowRefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code windowDef}
	 * labeled alternative in {@link SqlBaseParser#windowSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowDef(SqlBaseParser.WindowDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#windowFrame}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowFrame(SqlBaseParser.WindowFrameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#frameBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrameBound(SqlBaseParser.FrameBoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#qualifiedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedName(SqlBaseParser.QualifiedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#columnName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnName(SqlBaseParser.ColumnNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(SqlBaseParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unquotedIdentifier}
	 * labeled alternative in {@link SqlBaseParser#strictIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnquotedIdentifier(SqlBaseParser.UnquotedIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code quotedIdentifierAlternative}
	 * labeled alternative in {@link SqlBaseParser#strictIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuotedIdentifierAlternative(SqlBaseParser.QuotedIdentifierAlternativeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#quotedIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuotedIdentifier(SqlBaseParser.QuotedIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code decimalLiteral}
	 * labeled alternative in {@link SqlBaseParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimalLiteral(SqlBaseParser.DecimalLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code integerLiteral}
	 * labeled alternative in {@link SqlBaseParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerLiteral(SqlBaseParser.IntegerLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bigIntLiteral}
	 * labeled alternative in {@link SqlBaseParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBigIntLiteral(SqlBaseParser.BigIntLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code smallIntLiteral}
	 * labeled alternative in {@link SqlBaseParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSmallIntLiteral(SqlBaseParser.SmallIntLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tinyIntLiteral}
	 * labeled alternative in {@link SqlBaseParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTinyIntLiteral(SqlBaseParser.TinyIntLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code doubleLiteral}
	 * labeled alternative in {@link SqlBaseParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleLiteral(SqlBaseParser.DoubleLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bigDecimalLiteral}
	 * labeled alternative in {@link SqlBaseParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBigDecimalLiteral(SqlBaseParser.BigDecimalLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#nonReserved}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonReserved(SqlBaseParser.NonReservedContext ctx);
}