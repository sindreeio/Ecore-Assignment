/**
 */
package ecore;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ecore.EcoreFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore validationDelegates='http://www.eclipse.org/acceleo/query/1.0'"
 * @generated
 */
public interface EcorePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ecore";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ecore";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EcorePackage eINSTANCE = ecore.impl.EcorePackageImpl.init();

	/**
	 * The meta object id for the '{@link ecore.impl.CourseImpl <em>Course</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecore.impl.CourseImpl
	 * @see ecore.impl.EcorePackageImpl#getCourse()
	 * @generated
	 */
	int COURSE = 0;

	/**
	 * The feature id for the '<em><b>Course Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__COURSE_CODE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Credits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__CREDITS = 2;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__LEVEL = 3;

	/**
	 * The number of structural features of the '<em>Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ecore.impl.ProgrammeImpl <em>Programme</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecore.impl.ProgrammeImpl
	 * @see ecore.impl.EcorePackageImpl#getProgramme()
	 * @generated
	 */
	int PROGRAMME = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME__NAME = 0;

	/**
	 * The feature id for the '<em><b>Specialisations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME__SPECIALISATIONS = 1;

	/**
	 * The feature id for the '<em><b>Semester In Programme</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME__SEMESTER_IN_PROGRAMME = 2;

	/**
	 * The number of structural features of the '<em>Programme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Programme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ecore.impl.SpecialisationImpl <em>Specialisation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecore.impl.SpecialisationImpl
	 * @see ecore.impl.EcorePackageImpl#getSpecialisation()
	 * @generated
	 */
	int SPECIALISATION = 2;

	/**
	 * The feature id for the '<em><b>Specialisation In Programme</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALISATION__SPECIALISATION_IN_PROGRAMME = 0;

	/**
	 * The feature id for the '<em><b>Semester In Specialisation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALISATION__SEMESTER_IN_SPECIALISATION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALISATION__NAME = 2;

	/**
	 * The feature id for the '<em><b>Lower Level Specialisation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALISATION__LOWER_LEVEL_SPECIALISATION = 3;

	/**
	 * The number of structural features of the '<em>Specialisation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALISATION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Specialisation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALISATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ecore.impl.courseInSemesterImpl <em>course In Semester</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecore.impl.courseInSemesterImpl
	 * @see ecore.impl.EcorePackageImpl#getcourseInSemester()
	 * @generated
	 */
	int COURSE_IN_SEMESTER = 3;

	/**
	 * The feature id for the '<em><b>Course</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_IN_SEMESTER__COURSE = 0;

	/**
	 * The feature id for the '<em><b>Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_IN_SEMESTER__MANDATORY = 1;

	/**
	 * The feature id for the '<em><b>Semester</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_IN_SEMESTER__SEMESTER = 2;

	/**
	 * The number of structural features of the '<em>course In Semester</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_IN_SEMESTER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>course In Semester</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_IN_SEMESTER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ecore.impl.SemesterImpl <em>Semester</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecore.impl.SemesterImpl
	 * @see ecore.impl.EcorePackageImpl#getSemester()
	 * @generated
	 */
	int SEMESTER = 4;

	/**
	 * The feature id for the '<em><b>Semester Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER__SEMESTER_NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Course In Semester</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER__COURSE_IN_SEMESTER = 1;

	/**
	 * The number of structural features of the '<em>Semester</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Semester</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link ecore.impl.IndividualStudyPlanImpl <em>Individual Study Plan</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecore.impl.IndividualStudyPlanImpl
	 * @see ecore.impl.EcorePackageImpl#getIndividualStudyPlan()
	 * @generated
	 */
	int INDIVIDUAL_STUDY_PLAN = 5;

	/**
	 * The feature id for the '<em><b>Student Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_STUDY_PLAN__STUDENT_NAME = 0;

	/**
	 * The feature id for the '<em><b>Semesters In Studyplan</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_STUDY_PLAN__SEMESTERS_IN_STUDYPLAN = 1;

	/**
	 * The number of structural features of the '<em>Individual Study Plan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_STUDY_PLAN_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Individual Study Plan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_STUDY_PLAN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ecore.impl.SemesterInStudyplanImpl <em>Semester In Studyplan</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecore.impl.SemesterInStudyplanImpl
	 * @see ecore.impl.EcorePackageImpl#getSemesterInStudyplan()
	 * @generated
	 */
	int SEMESTER_IN_STUDYPLAN = 6;

	/**
	 * The feature id for the '<em><b>Studyplan</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER_IN_STUDYPLAN__STUDYPLAN = 0;

	/**
	 * The feature id for the '<em><b>Semester</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER_IN_STUDYPLAN__SEMESTER = 1;

	/**
	 * The feature id for the '<em><b>Electives</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER_IN_STUDYPLAN__ELECTIVES = 2;

	/**
	 * The number of structural features of the '<em>Semester In Studyplan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER_IN_STUDYPLAN_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Semester In Studyplan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER_IN_STUDYPLAN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ecore.impl.ElectiveImpl <em>Elective</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecore.impl.ElectiveImpl
	 * @see ecore.impl.EcorePackageImpl#getElective()
	 * @generated
	 */
	int ELECTIVE = 7;

	/**
	 * The feature id for the '<em><b>Course</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTIVE__COURSE = 0;

	/**
	 * The feature id for the '<em><b>Semester In Studyplan</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTIVE__SEMESTER_IN_STUDYPLAN = 1;

	/**
	 * The feature id for the '<em><b>Exam Attempts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTIVE__EXAM_ATTEMPTS = 2;

	/**
	 * The number of structural features of the '<em>Elective</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTIVE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Elective</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTIVE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ecore.impl.ExamAttemptImpl <em>Exam Attempt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecore.impl.ExamAttemptImpl
	 * @see ecore.impl.EcorePackageImpl#getExamAttempt()
	 * @generated
	 */
	int EXAM_ATTEMPT = 8;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAM_ATTEMPT__DATE = 0;

	/**
	 * The feature id for the '<em><b>Elective</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAM_ATTEMPT__ELECTIVE = 1;

	/**
	 * The feature id for the '<em><b>Grade</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAM_ATTEMPT__GRADE = 2;

	/**
	 * The number of structural features of the '<em>Exam Attempt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAM_ATTEMPT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Exam Attempt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAM_ATTEMPT_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '<em>Grade</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Character
	 * @see ecore.impl.EcorePackageImpl#getGrade()
	 * @generated
	 */
	int GRADE = 9;


	/**
	 * Returns the meta object for class '{@link ecore.Course <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Course</em>'.
	 * @see ecore.Course
	 * @generated
	 */
	EClass getCourse();

	/**
	 * Returns the meta object for the attribute '{@link ecore.Course#getCourseCode <em>Course Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Course Code</em>'.
	 * @see ecore.Course#getCourseCode()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_CourseCode();

	/**
	 * Returns the meta object for the attribute '{@link ecore.Course#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ecore.Course#getName()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Name();

	/**
	 * Returns the meta object for the attribute '{@link ecore.Course#getCredits <em>Credits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Credits</em>'.
	 * @see ecore.Course#getCredits()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Credits();

	/**
	 * Returns the meta object for the attribute '{@link ecore.Course#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see ecore.Course#getLevel()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Level();

	/**
	 * Returns the meta object for class '{@link ecore.Programme <em>Programme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Programme</em>'.
	 * @see ecore.Programme
	 * @generated
	 */
	EClass getProgramme();

	/**
	 * Returns the meta object for the attribute '{@link ecore.Programme#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ecore.Programme#getName()
	 * @see #getProgramme()
	 * @generated
	 */
	EAttribute getProgramme_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link ecore.Programme#getSpecialisations <em>Specialisations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Specialisations</em>'.
	 * @see ecore.Programme#getSpecialisations()
	 * @see #getProgramme()
	 * @generated
	 */
	EReference getProgramme_Specialisations();

	/**
	 * Returns the meta object for the reference list '{@link ecore.Programme#getSemesterInProgramme <em>Semester In Programme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semester In Programme</em>'.
	 * @see ecore.Programme#getSemesterInProgramme()
	 * @see #getProgramme()
	 * @generated
	 */
	EReference getProgramme_SemesterInProgramme();

	/**
	 * Returns the meta object for class '{@link ecore.Specialisation <em>Specialisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specialisation</em>'.
	 * @see ecore.Specialisation
	 * @generated
	 */
	EClass getSpecialisation();

	/**
	 * Returns the meta object for the container reference '{@link ecore.Specialisation#getSpecialisationInProgramme <em>Specialisation In Programme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Specialisation In Programme</em>'.
	 * @see ecore.Specialisation#getSpecialisationInProgramme()
	 * @see #getSpecialisation()
	 * @generated
	 */
	EReference getSpecialisation_SpecialisationInProgramme();

	/**
	 * Returns the meta object for the attribute '{@link ecore.Specialisation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ecore.Specialisation#getName()
	 * @see #getSpecialisation()
	 * @generated
	 */
	EAttribute getSpecialisation_Name();

	/**
	 * Returns the meta object for the reference '{@link ecore.Specialisation#getLowerLevelSpecialisation <em>Lower Level Specialisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Lower Level Specialisation</em>'.
	 * @see ecore.Specialisation#getLowerLevelSpecialisation()
	 * @see #getSpecialisation()
	 * @generated
	 */
	EReference getSpecialisation_LowerLevelSpecialisation();

	/**
	 * Returns the meta object for the reference list '{@link ecore.Specialisation#getSemesterInSpecialisation <em>Semester In Specialisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Semester In Specialisation</em>'.
	 * @see ecore.Specialisation#getSemesterInSpecialisation()
	 * @see #getSpecialisation()
	 * @generated
	 */
	EReference getSpecialisation_SemesterInSpecialisation();

	/**
	 * Returns the meta object for class '{@link ecore.courseInSemester <em>course In Semester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>course In Semester</em>'.
	 * @see ecore.courseInSemester
	 * @generated
	 */
	EClass getcourseInSemester();

	/**
	 * Returns the meta object for the reference '{@link ecore.courseInSemester#getCourse <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Course</em>'.
	 * @see ecore.courseInSemester#getCourse()
	 * @see #getcourseInSemester()
	 * @generated
	 */
	EReference getcourseInSemester_Course();

	/**
	 * Returns the meta object for the attribute '{@link ecore.courseInSemester#isMandatory <em>Mandatory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mandatory</em>'.
	 * @see ecore.courseInSemester#isMandatory()
	 * @see #getcourseInSemester()
	 * @generated
	 */
	EAttribute getcourseInSemester_Mandatory();

	/**
	 * Returns the meta object for the container reference '{@link ecore.courseInSemester#getSemester <em>Semester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Semester</em>'.
	 * @see ecore.courseInSemester#getSemester()
	 * @see #getcourseInSemester()
	 * @generated
	 */
	EReference getcourseInSemester_Semester();

	/**
	 * Returns the meta object for class '{@link ecore.Semester <em>Semester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Semester</em>'.
	 * @see ecore.Semester
	 * @generated
	 */
	EClass getSemester();

	/**
	 * Returns the meta object for the attribute '{@link ecore.Semester#getSemesterNumber <em>Semester Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Semester Number</em>'.
	 * @see ecore.Semester#getSemesterNumber()
	 * @see #getSemester()
	 * @generated
	 */
	EAttribute getSemester_SemesterNumber();

	/**
	 * Returns the meta object for the containment reference list '{@link ecore.Semester#getCourseInSemester <em>Course In Semester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Course In Semester</em>'.
	 * @see ecore.Semester#getCourseInSemester()
	 * @see #getSemester()
	 * @generated
	 */
	EReference getSemester_CourseInSemester();

	/**
	 * Returns the meta object for class '{@link ecore.IndividualStudyPlan <em>Individual Study Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Individual Study Plan</em>'.
	 * @see ecore.IndividualStudyPlan
	 * @generated
	 */
	EClass getIndividualStudyPlan();

	/**
	 * Returns the meta object for the attribute '{@link ecore.IndividualStudyPlan#getStudentName <em>Student Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Student Name</em>'.
	 * @see ecore.IndividualStudyPlan#getStudentName()
	 * @see #getIndividualStudyPlan()
	 * @generated
	 */
	EAttribute getIndividualStudyPlan_StudentName();

	/**
	 * Returns the meta object for the containment reference list '{@link ecore.IndividualStudyPlan#getSemestersInStudyplan <em>Semesters In Studyplan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Semesters In Studyplan</em>'.
	 * @see ecore.IndividualStudyPlan#getSemestersInStudyplan()
	 * @see #getIndividualStudyPlan()
	 * @generated
	 */
	EReference getIndividualStudyPlan_SemestersInStudyplan();

	/**
	 * Returns the meta object for class '{@link ecore.SemesterInStudyplan <em>Semester In Studyplan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Semester In Studyplan</em>'.
	 * @see ecore.SemesterInStudyplan
	 * @generated
	 */
	EClass getSemesterInStudyplan();

	/**
	 * Returns the meta object for the container reference '{@link ecore.SemesterInStudyplan#getStudyplan <em>Studyplan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Studyplan</em>'.
	 * @see ecore.SemesterInStudyplan#getStudyplan()
	 * @see #getSemesterInStudyplan()
	 * @generated
	 */
	EReference getSemesterInStudyplan_Studyplan();

	/**
	 * Returns the meta object for the reference '{@link ecore.SemesterInStudyplan#getSemester <em>Semester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Semester</em>'.
	 * @see ecore.SemesterInStudyplan#getSemester()
	 * @see #getSemesterInStudyplan()
	 * @generated
	 */
	EReference getSemesterInStudyplan_Semester();

	/**
	 * Returns the meta object for the containment reference list '{@link ecore.SemesterInStudyplan#getElectives <em>Electives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Electives</em>'.
	 * @see ecore.SemesterInStudyplan#getElectives()
	 * @see #getSemesterInStudyplan()
	 * @generated
	 */
	EReference getSemesterInStudyplan_Electives();

	/**
	 * Returns the meta object for class '{@link ecore.Elective <em>Elective</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Elective</em>'.
	 * @see ecore.Elective
	 * @generated
	 */
	EClass getElective();

	/**
	 * Returns the meta object for the reference '{@link ecore.Elective#getCourse <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Course</em>'.
	 * @see ecore.Elective#getCourse()
	 * @see #getElective()
	 * @generated
	 */
	EReference getElective_Course();

	/**
	 * Returns the meta object for the container reference '{@link ecore.Elective#getSemesterInStudyplan <em>Semester In Studyplan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Semester In Studyplan</em>'.
	 * @see ecore.Elective#getSemesterInStudyplan()
	 * @see #getElective()
	 * @generated
	 */
	EReference getElective_SemesterInStudyplan();

	/**
	 * Returns the meta object for the containment reference list '{@link ecore.Elective#getExamAttempts <em>Exam Attempts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exam Attempts</em>'.
	 * @see ecore.Elective#getExamAttempts()
	 * @see #getElective()
	 * @generated
	 */
	EReference getElective_ExamAttempts();

	/**
	 * Returns the meta object for class '{@link ecore.ExamAttempt <em>Exam Attempt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exam Attempt</em>'.
	 * @see ecore.ExamAttempt
	 * @generated
	 */
	EClass getExamAttempt();

	/**
	 * Returns the meta object for the attribute '{@link ecore.ExamAttempt#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see ecore.ExamAttempt#getDate()
	 * @see #getExamAttempt()
	 * @generated
	 */
	EAttribute getExamAttempt_Date();

	/**
	 * Returns the meta object for the attribute '{@link ecore.ExamAttempt#getGrade <em>Grade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grade</em>'.
	 * @see ecore.ExamAttempt#getGrade()
	 * @see #getExamAttempt()
	 * @generated
	 */
	EAttribute getExamAttempt_Grade();

	/**
	 * Returns the meta object for data type '{@link java.lang.Character <em>Grade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Grade</em>'.
	 * @see java.lang.Character
	 * @model instanceClass="java.lang.Character"
	 *        extendedMetaData="enumeration='A B C D E F'"
	 * @generated
	 */
	EDataType getGrade();

	/**
	 * Returns the meta object for the container reference '{@link ecore.ExamAttempt#getElective <em>Elective</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Elective</em>'.
	 * @see ecore.ExamAttempt#getElective()
	 * @see #getExamAttempt()
	 * @generated
	 */
	EReference getExamAttempt_Elective();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EcoreFactory getEcoreFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ecore.impl.CourseImpl <em>Course</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecore.impl.CourseImpl
		 * @see ecore.impl.EcorePackageImpl#getCourse()
		 * @generated
		 */
		EClass COURSE = eINSTANCE.getCourse();

		/**
		 * The meta object literal for the '<em><b>Course Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__COURSE_CODE = eINSTANCE.getCourse_CourseCode();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__NAME = eINSTANCE.getCourse_Name();

		/**
		 * The meta object literal for the '<em><b>Credits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__CREDITS = eINSTANCE.getCourse_Credits();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__LEVEL = eINSTANCE.getCourse_Level();

		/**
		 * The meta object literal for the '{@link ecore.impl.ProgrammeImpl <em>Programme</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecore.impl.ProgrammeImpl
		 * @see ecore.impl.EcorePackageImpl#getProgramme()
		 * @generated
		 */
		EClass PROGRAMME = eINSTANCE.getProgramme();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAMME__NAME = eINSTANCE.getProgramme_Name();

		/**
		 * The meta object literal for the '<em><b>Specialisations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAMME__SPECIALISATIONS = eINSTANCE.getProgramme_Specialisations();

		/**
		 * The meta object literal for the '<em><b>Semester In Programme</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAMME__SEMESTER_IN_PROGRAMME = eINSTANCE.getProgramme_SemesterInProgramme();

		/**
		 * The meta object literal for the '{@link ecore.impl.SpecialisationImpl <em>Specialisation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecore.impl.SpecialisationImpl
		 * @see ecore.impl.EcorePackageImpl#getSpecialisation()
		 * @generated
		 */
		EClass SPECIALISATION = eINSTANCE.getSpecialisation();

		/**
		 * The meta object literal for the '<em><b>Specialisation In Programme</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIALISATION__SPECIALISATION_IN_PROGRAMME = eINSTANCE.getSpecialisation_SpecialisationInProgramme();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIALISATION__NAME = eINSTANCE.getSpecialisation_Name();

		/**
		 * The meta object literal for the '<em><b>Lower Level Specialisation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIALISATION__LOWER_LEVEL_SPECIALISATION = eINSTANCE.getSpecialisation_LowerLevelSpecialisation();

		/**
		 * The meta object literal for the '<em><b>Semester In Specialisation</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIALISATION__SEMESTER_IN_SPECIALISATION = eINSTANCE.getSpecialisation_SemesterInSpecialisation();

		/**
		 * The meta object literal for the '{@link ecore.impl.courseInSemesterImpl <em>course In Semester</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecore.impl.courseInSemesterImpl
		 * @see ecore.impl.EcorePackageImpl#getcourseInSemester()
		 * @generated
		 */
		EClass COURSE_IN_SEMESTER = eINSTANCE.getcourseInSemester();

		/**
		 * The meta object literal for the '<em><b>Course</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE_IN_SEMESTER__COURSE = eINSTANCE.getcourseInSemester_Course();

		/**
		 * The meta object literal for the '<em><b>Mandatory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE_IN_SEMESTER__MANDATORY = eINSTANCE.getcourseInSemester_Mandatory();

		/**
		 * The meta object literal for the '<em><b>Semester</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE_IN_SEMESTER__SEMESTER = eINSTANCE.getcourseInSemester_Semester();

		/**
		 * The meta object literal for the '{@link ecore.impl.SemesterImpl <em>Semester</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecore.impl.SemesterImpl
		 * @see ecore.impl.EcorePackageImpl#getSemester()
		 * @generated
		 */
		EClass SEMESTER = eINSTANCE.getSemester();

		/**
		 * The meta object literal for the '<em><b>Semester Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEMESTER__SEMESTER_NUMBER = eINSTANCE.getSemester_SemesterNumber();

		/**
		 * The meta object literal for the '<em><b>Course In Semester</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMESTER__COURSE_IN_SEMESTER = eINSTANCE.getSemester_CourseInSemester();

		/**
		 * The meta object literal for the '{@link ecore.impl.IndividualStudyPlanImpl <em>Individual Study Plan</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecore.impl.IndividualStudyPlanImpl
		 * @see ecore.impl.EcorePackageImpl#getIndividualStudyPlan()
		 * @generated
		 */
		EClass INDIVIDUAL_STUDY_PLAN = eINSTANCE.getIndividualStudyPlan();

		/**
		 * The meta object literal for the '<em><b>Student Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDIVIDUAL_STUDY_PLAN__STUDENT_NAME = eINSTANCE.getIndividualStudyPlan_StudentName();

		/**
		 * The meta object literal for the '<em><b>Semesters In Studyplan</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDIVIDUAL_STUDY_PLAN__SEMESTERS_IN_STUDYPLAN = eINSTANCE.getIndividualStudyPlan_SemestersInStudyplan();

		/**
		 * The meta object literal for the '{@link ecore.impl.SemesterInStudyplanImpl <em>Semester In Studyplan</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecore.impl.SemesterInStudyplanImpl
		 * @see ecore.impl.EcorePackageImpl#getSemesterInStudyplan()
		 * @generated
		 */
		EClass SEMESTER_IN_STUDYPLAN = eINSTANCE.getSemesterInStudyplan();

		/**
		 * The meta object literal for the '<em><b>Studyplan</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMESTER_IN_STUDYPLAN__STUDYPLAN = eINSTANCE.getSemesterInStudyplan_Studyplan();

		/**
		 * The meta object literal for the '<em><b>Semester</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMESTER_IN_STUDYPLAN__SEMESTER = eINSTANCE.getSemesterInStudyplan_Semester();

		/**
		 * The meta object literal for the '<em><b>Electives</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMESTER_IN_STUDYPLAN__ELECTIVES = eINSTANCE.getSemesterInStudyplan_Electives();

		/**
		 * The meta object literal for the '{@link ecore.impl.ElectiveImpl <em>Elective</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecore.impl.ElectiveImpl
		 * @see ecore.impl.EcorePackageImpl#getElective()
		 * @generated
		 */
		EClass ELECTIVE = eINSTANCE.getElective();

		/**
		 * The meta object literal for the '<em><b>Course</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELECTIVE__COURSE = eINSTANCE.getElective_Course();

		/**
		 * The meta object literal for the '<em><b>Semester In Studyplan</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELECTIVE__SEMESTER_IN_STUDYPLAN = eINSTANCE.getElective_SemesterInStudyplan();

		/**
		 * The meta object literal for the '<em><b>Exam Attempts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELECTIVE__EXAM_ATTEMPTS = eINSTANCE.getElective_ExamAttempts();

		/**
		 * The meta object literal for the '{@link ecore.impl.ExamAttemptImpl <em>Exam Attempt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecore.impl.ExamAttemptImpl
		 * @see ecore.impl.EcorePackageImpl#getExamAttempt()
		 * @generated
		 */
		EClass EXAM_ATTEMPT = eINSTANCE.getExamAttempt();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAM_ATTEMPT__DATE = eINSTANCE.getExamAttempt_Date();

		/**
		 * The meta object literal for the '<em><b>Grade</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAM_ATTEMPT__GRADE = eINSTANCE.getExamAttempt_Grade();

		/**
		 * The meta object literal for the '<em>Grade</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Character
		 * @see ecore.impl.EcorePackageImpl#getGrade()
		 * @generated
		 */
		EDataType GRADE = eINSTANCE.getGrade();

		/**
		 * The meta object literal for the '<em><b>Elective</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXAM_ATTEMPT__ELECTIVE = eINSTANCE.getExamAttempt_Elective();

	}

} //EcorePackage
