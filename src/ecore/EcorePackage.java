/**
 */
package ecore;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
	 * The feature id for the '<em><b>Course In Semester</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME__COURSE_IN_SEMESTER = 1;

	/**
	 * The number of structural features of the '<em>Programme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Programme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ecore.impl.SemesterImpl <em>Semester</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecore.impl.SemesterImpl
	 * @see ecore.impl.EcorePackageImpl#getSemester()
	 * @generated
	 */
	int SEMESTER = 2;

	/**
	 * The feature id for the '<em><b>Semester Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER__SEMESTER_NUMBER = 0;

	/**
	 * The number of structural features of the '<em>Semester</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Semester</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ecore.impl.SpecialisationImpl <em>Specialisation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecore.impl.SpecialisationImpl
	 * @see ecore.impl.EcorePackageImpl#getSpecialisation()
	 * @generated
	 */
	int SPECIALISATION = 3;

	/**
	 * The feature id for the '<em><b>Specialisation In Programme</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALISATION__SPECIALISATION_IN_PROGRAMME = 0;

	/**
	 * The feature id for the '<em><b>Course In Semester</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALISATION__COURSE_IN_SEMESTER = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALISATION__NAME = 2;

	/**
	 * The number of structural features of the '<em>Specialisation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALISATION_FEATURE_COUNT = 3;

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
	int COURSE_IN_SEMESTER = 4;

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
	 * The feature id for the '<em><b>Semester</b></em>' attribute.
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
	 * Returns the meta object for the reference list '{@link ecore.Programme#getCourseInSemester <em>Course In Semester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Course In Semester</em>'.
	 * @see ecore.Programme#getCourseInSemester()
	 * @see #getProgramme()
	 * @generated
	 */
	EReference getProgramme_CourseInSemester();

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
	 * Returns the meta object for class '{@link ecore.Specialisation <em>Specialisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specialisation</em>'.
	 * @see ecore.Specialisation
	 * @generated
	 */
	EClass getSpecialisation();

	/**
	 * Returns the meta object for the reference '{@link ecore.Specialisation#getSpecialisationInProgramme <em>Specialisation In Programme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Specialisation In Programme</em>'.
	 * @see ecore.Specialisation#getSpecialisationInProgramme()
	 * @see #getSpecialisation()
	 * @generated
	 */
	EReference getSpecialisation_SpecialisationInProgramme();

	/**
	 * Returns the meta object for the reference list '{@link ecore.Specialisation#getCourseInSemester <em>Course In Semester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Course In Semester</em>'.
	 * @see ecore.Specialisation#getCourseInSemester()
	 * @see #getSpecialisation()
	 * @generated
	 */
	EReference getSpecialisation_CourseInSemester();

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
	 * Returns the meta object for the attribute '{@link ecore.courseInSemester#getSemester <em>Semester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Semester</em>'.
	 * @see ecore.courseInSemester#getSemester()
	 * @see #getcourseInSemester()
	 * @generated
	 */
	EAttribute getcourseInSemester_Semester();

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
		 * The meta object literal for the '<em><b>Course In Semester</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAMME__COURSE_IN_SEMESTER = eINSTANCE.getProgramme_CourseInSemester();

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
		 * The meta object literal for the '{@link ecore.impl.SpecialisationImpl <em>Specialisation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecore.impl.SpecialisationImpl
		 * @see ecore.impl.EcorePackageImpl#getSpecialisation()
		 * @generated
		 */
		EClass SPECIALISATION = eINSTANCE.getSpecialisation();

		/**
		 * The meta object literal for the '<em><b>Specialisation In Programme</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIALISATION__SPECIALISATION_IN_PROGRAMME = eINSTANCE.getSpecialisation_SpecialisationInProgramme();

		/**
		 * The meta object literal for the '<em><b>Course In Semester</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIALISATION__COURSE_IN_SEMESTER = eINSTANCE.getSpecialisation_CourseInSemester();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIALISATION__NAME = eINSTANCE.getSpecialisation_Name();

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
		 * The meta object literal for the '<em><b>Semester</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE_IN_SEMESTER__SEMESTER = eINSTANCE.getcourseInSemester_Semester();

	}

} //EcorePackage
